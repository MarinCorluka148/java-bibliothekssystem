public final class Programm {
    private Programm() {}

    public static void main(StringTest[] args){
        //args = new String[] {"Apfel","Birne"};

        for(int i = 0; i < args.length; i++){

            System.out.printf("%d: %s%n", i, args[i]);
        }
    }
}