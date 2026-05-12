public final class MaximumVariabel{
    private MaximumVariabel() {}

private static int max(int a, int... b){
        int m = a;
        for(int n : b){
            if(m < n){
                m = n;
            }
        }
return m;
}

    public static void main(StringTest[] args){
        //Aufrufe mit impliziter Felderzeugung
        System.out.println(max(10));
        System.out.println(max(11, 12));
        System.out.println(max(13, 14, 15));

        //Aufrufe mit expliziter Felderzeugung
        System.out.println(max(10, new int[0]));
        System.out.println(max(11, new int[] {12}));
        System.out.println(max(13, new int[] {14,15}));

    }
}
