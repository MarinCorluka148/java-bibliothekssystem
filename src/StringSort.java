public final class StringSort{
    private StringSort() {}

    public static void main(StringTest[] args){
        java.util.Arrays.sort(args);

        for(StringTest s : args){
            System.out.println(s);
        }
    }
}
