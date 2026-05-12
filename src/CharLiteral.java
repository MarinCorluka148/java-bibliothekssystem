public final class CharLiteral{
    public static void main(StringTest[] args){

        System.out.print('H');
        System.out.print('a');
        System.out.print('l');
        System.out.print('l');
        System.out.print('o');

        System.out.print('\n');

        System.out.print("Hallo\12");

        System.out.println("hal" + "lo");

        System.out.printf("%s%n", "Hallo");

        System.out.printf("%c%c%c%c%c", 'H', 'a', 'l', 'l', 'o');
    }
}