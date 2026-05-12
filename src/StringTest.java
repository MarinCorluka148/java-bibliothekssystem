public final class StringTest {
    private StringTest() {}

    static class Person {
        String name;
        int alter;
    }

    public static void main(String[] args) {

        Person ja = new Person();
        ja.alter = 100;
        ja.name = "Baba";

        String s = "Hallo";
        System.out.print(s);

        System.out.println(ja);
    }
}
