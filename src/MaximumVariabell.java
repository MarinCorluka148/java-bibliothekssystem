public final class MaximumVariabell {
    private MaximumVariabell() {
    }


    private static int max(int a, int... b) {
        int m = a;
        for (int n : b) {
            if (m < n) {
                m = n;
            }
        }
        return m;
    }


    public static void main(StringTest[] args){
        System.out.println(max(10));
        System.out.println(max(10, 11));
        System.out.println(max(10, 11, 12));

        System.out.println(max(10, new int[0] ));
        System.out.println(max(10, new int[] {11}));
        System.out.println(max(10, new int[] {11, 12}));
    }
}
