package ausleihe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class Datenbank {

    private static final String URL = "jdbc:sqlite:bibliothek.db";

    public static Connection verbinden() throws SQLException {
        return DriverManager.getConnection(URL);
    }


    public static void mediumSpeichern(Medium medium) {

        String sql = """
            INSERT INTO medien(
                typ,
                titel,
                erscheinungsjahr,
                ausgeliehen,
                autor,
                seitenzahl,
                laenge,
                fsk,
                plattform,
                multiplayer
            ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
            """;

        try (
                Connection connection = DriverManager.getConnection(URL);
                PreparedStatement statement = connection.prepareStatement(sql)
        ) {

            statement.setString(1, medium.getClass().getSimpleName());
            statement.setString(2, medium.getTitel());
            statement.setInt(3, medium.getErscheinungsjahr());
            statement.setBoolean(4, medium.isAusgeliehen());

            if (medium instanceof Buch buch) {

                statement.setString(5, buch.getAuthor());
                statement.setInt(6, buch.getSeitenzahl());
                statement.setNull(7, java.sql.Types.REAL);
                statement.setNull(8, java.sql.Types.INTEGER);
                statement.setNull(9, java.sql.Types.VARCHAR);
                statement.setNull(10, java.sql.Types.INTEGER);

            } else if (medium instanceof Film film) {

                statement.setNull(5, java.sql.Types.VARCHAR);
                statement.setNull(6, java.sql.Types.INTEGER);
                statement.setDouble(7, film.getLaenge());
                statement.setInt(8, film.getFsk());
                statement.setNull(9, java.sql.Types.VARCHAR);
                statement.setNull(10, java.sql.Types.INTEGER);

            } else if (medium instanceof Spiel spiel) {

                statement.setNull(5, java.sql.Types.VARCHAR);
                statement.setNull(6, java.sql.Types.INTEGER);
                statement.setNull(7, java.sql.Types.REAL);
                statement.setNull(8, java.sql.Types.INTEGER);
                statement.setString(9, spiel.getPlattform());
                statement.setBoolean(10, spiel.isMultiplayer());
            }

            statement.executeUpdate();

            System.out.println("Medium gespeichert!");

        } catch (SQLException e) {

            System.out.println("Fehler beim Speichern.");
            System.out.println(e.getMessage());
        }
    }


    public static ArrayList<Medium> medienLaden() {

        ArrayList<Medium> medien = new ArrayList<>();

        String sql = "SELECT * FROM medien";

        try (
                Connection connection = DriverManager.getConnection(URL);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)
        ) {

            while (resultSet.next()) {

                String typ = resultSet.getString("typ");
                String titel = resultSet.getString("titel");
                int jahr = resultSet.getInt("erscheinungsjahr");
                boolean ausgeliehen = resultSet.getBoolean("ausgeliehen");

                if (typ.equals("Buch")) {

                    String autor = resultSet.getString("autor");
                    int seitenzahl = resultSet.getInt("seitenzahl");

                    medien.add(
                            new Buch(
                                    titel,
                                    jahr,
                                    ausgeliehen,
                                    autor,
                                    seitenzahl
                            )
                    );

                } else if (typ.equals("Film")) {

                    double laenge = resultSet.getDouble("laenge");
                    int fsk = resultSet.getInt("fsk");

                    medien.add(
                            new Film(
                                    titel,
                                    jahr,
                                    ausgeliehen,
                                    laenge,
                                    fsk
                            )
                    );

                } else if (typ.equals("Spiel")) {

                    String plattform = resultSet.getString("plattform");
                    boolean multiplayer = resultSet.getBoolean("multiplayer");

                    medien.add(
                            new Spiel(
                                    titel,
                                    jahr,
                                    ausgeliehen,
                                    plattform,
                                    multiplayer
                            )
                    );
                }
            }

            System.out.println("Medien wurden aus der Datenbank geladen.");

        } catch (SQLException e) {

            System.out.println("Fehler beim Laden aus der Datenbank.");
            System.out.println(e.getMessage());
        }

        return medien;
    }


    public static void mediumLoeschen(String titel) {

        String sql = "DELETE FROM medien WHERE titel = ?";

        try (
                Connection connection = DriverManager.getConnection(URL);
                PreparedStatement statement = connection.prepareStatement(sql)
        ) {

            statement.setString(1, titel);

            int geloeschteZeilen = statement.executeUpdate();

            if (geloeschteZeilen > 0) {
                System.out.println("Medium wurde aus der Datenbank geloescht.");
            } else {
                System.out.println("Kein Medium mit diesem Titel in der Datenbank gefunden.");
            }

        } catch (SQLException e) {

            System.out.println("Fehler beim Loeschen aus der Datenbank.");
            System.out.println(e.getMessage());
        }
    }



    public static void ausleihStatusAktualisieren(String titel, boolean ausgeliehen) {

        String sql = "UPDATE medien SET ausgeliehen = ? WHERE titel = ?";

        try (
                Connection connection = DriverManager.getConnection(URL);
                PreparedStatement statement = connection.prepareStatement(sql)
        ) {

            statement.setBoolean(1, ausgeliehen);
            statement.setString(2, titel);

            int geaenderteZeilen = statement.executeUpdate();

            if (geaenderteZeilen > 0) {
                System.out.println("Ausleihstatus wurde in der Datenbank aktualisiert.");
            } else {
                System.out.println("Kein Medium mit diesem Titel in der Datenbank gefunden.");
            }

        } catch (SQLException e) {

            System.out.println("Fehler beim Aktualisieren des Ausleihstatus.");
            System.out.println(e.getMessage());
        }
    }



    public static void alleMedienAusgeben() {

        String sql = "SELECT * FROM medien";

        try (
                Connection connection = DriverManager.getConnection(URL);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)
        ) {

            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String typ = resultSet.getString("typ");
                String titel = resultSet.getString("titel");
                int jahr = resultSet.getInt("erscheinungsjahr");
                boolean ausgeliehen = resultSet.getBoolean("ausgeliehen");

                System.out.printf(
                        "%d | %s | %s | %d | ausgeliehen: %b",
                        id,
                        typ,
                        titel,
                        jahr,
                        ausgeliehen
                );

                if (typ.equals("Buch")) {

                    String autor = resultSet.getString("autor");
                    int seitenzahl = resultSet.getInt("seitenzahl");

                    System.out.printf(
                            " | Autor: %s | Seiten: %d",
                            autor,
                            seitenzahl
                    );

                } else if (typ.equals("Film")) {

                    double laenge = resultSet.getDouble("laenge");
                    int fsk = resultSet.getInt("fsk");

                    System.out.printf(
                            " | Länge: %.2f | FSK: %d",
                            laenge,
                            fsk
                    );

                } else if (typ.equals("Spiel")) {

                    String plattform = resultSet.getString("plattform");
                    boolean multiplayer = resultSet.getBoolean("multiplayer");

                    System.out.printf(
                            " | Plattform: %s | Multiplayer: %b",
                            plattform,
                            multiplayer
                    );
                }

                System.out.println();
            }

        } catch (SQLException e) {

            System.out.println("Fehler beim Auslesen der Datenbank.");
            System.out.println(e.getMessage());
        }
    }



    public static void tabelleErstellen() {

        String sql = """
                CREATE TABLE IF NOT EXISTS medien (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    typ TEXT NOT NULL,
                    titel TEXT NOT NULL,
                    erscheinungsjahr INTEGER NOT NULL,
                    ausgeliehen INTEGER NOT NULL,
                    autor TEXT,
                    seitenzahl INTEGER,
                    laenge REAL,
                    fsk INTEGER,
                    plattform TEXT,
                    multiplayer INTEGER
                );
                """;

        try (Connection verbindung = verbinden();
             Statement statement = verbindung.createStatement()) {

            statement.execute(sql);

            System.out.println("Tabelle wurde erstellt.");

        } catch (SQLException e) {

            System.out.println("Fehler beim Erstellen der Tabelle.");
        }
    }
}
