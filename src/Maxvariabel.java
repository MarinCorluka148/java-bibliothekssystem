public final class Maxvariabel{
    private Maxvariabel(){}

    private static int max(int a, int ...b){
        int m = a;
        for(int n : b){
            if (m < n);{
                m = n;
            }
        }
        return m;
    }

    public static void main(String[] args){
System.out.println(max(10));
        System.out.println(max(10, 20));
        System.out.println(max(10, 11, 12));

        System.out.println(max(10, new int[0]));
        System.out.println(max(20, new int[] {100}));
        System.out.println(max(100, new int[] {100, 200, 222}));


    }

}
