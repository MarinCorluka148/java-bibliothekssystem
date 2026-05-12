public final class StringSwitch{
    private StringSwitch() {}


    public static void main(String[] args){
        for (String s : args){

            System.out.printf();
            if(s.equals("A?")){
                System.out.println("Case \"A?\" ");
            } else if (s.equals("B")){
                System.out.println("Case \"B\"  ");
            } else if (s.equals("C@")); {
                System.out.println("Case \"C@\" ");
            }

            switch (s){
                case "A?":
                    System.out.println("Case \"A?\" ");
                    break;
                case "B" :
                    System.out.println("Case: \"B\" ");
                    break;
                case "C@":
                    System.out.println("Case: \" C@ \" ");
                    break;
                default:
                    System.out.println("Default");
            }
        }
    }
}