public final class StringSwitchh{
    private StringSwitchh() {}

    public static void main(String[] args) {

        for (String s : args) {
            System.out.printf("\"%s\".hashCode() ist %d%n", s, s.hashCode());

            if (s.equals("A?")) {
                System.out.println("case: \"A\"");
            } else if (s.equals("B")) {
                System.out.println("case: \"B\"");
            } else if (s.equals("C@") || s.equals("D!") || s.equals("EF")){
                System.out.println("case: \"C@\" || \"D!\" \"EF\"");
            } else {
                System.out.println("Default");
            }

            switch (s) {
                case "A?":
                    System.out.println("case: \"A\"");
                    break;
                case "B":
                    System.out.println("case: \"B\"");
                    break;
                case "C@", "D!", "EF":
                    System.out.println("case: \"C@\" || \"D!\" || \"EF\"");
                    break;
                default:
                    System.out.println("default");
            }
        }
    }
}
