import ausleihe.Bibliothek;
import ausleihe.Buch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BibliothekTest {

    @Test
    public void mediumHinzufuegenTest() {

        Bibliothek bibliothek = new Bibliothek();

        Buch buch = new Buch(
                "Der Hobbit",
                1937,
                false,
                "Tolkien",
                310
        );

        bibliothek.mediumHinzufuegen(buch);

        assertEquals(1, bibliothek.anzahlMedien());
    }

    @Test
    public void buchAusleihenTest() {

        Buch buch = new Buch(
                "Der Hobbit",
                1937,
                false,
                "Tolkien",
                310
        );

        buch.ausleihen();

        assertTrue(buch.isAusgeliehen());
    }

    @Test
    public void buchZurueckgebenTest() {

        Buch buch = new Buch(
                "Der Hobbit",
                1937,
                true,
                "Tolkien",
                310
        );

        buch.zurueckgeben();

        assertFalse(buch.isAusgeliehen());
    }

    @Test
    public void mediumEntfernenTest() {

        Bibliothek bibliothek = new Bibliothek();

        Buch buch = new Buch(
                "Der Hobbit",
                1937,
                false,
                "Tolkien",
                310
        );

        bibliothek.mediumHinzufuegen(buch);

        bibliothek.mediumEntfernen("Der Hobbit");

        assertEquals(0, bibliothek.anzahlMedien());
    }

    @Test
    public void mehrereMedienHinzufuegenTest() {

        Bibliothek bibliothek = new Bibliothek();

        bibliothek.mediumHinzufuegen(
                new Buch("A", 2000, false, "X", 100)
        );

        bibliothek.mediumHinzufuegen(
                new Buch("B", 2001, false, "Y", 200)
        );

        assertEquals(2, bibliothek.anzahlMedien());
    }

}
