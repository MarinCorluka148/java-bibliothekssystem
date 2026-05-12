public final class JavaLib{
    private JavaLib() {}

    public static void main(String[] args) {

        long start = System.nanoTime();

        double sinPiHalbe = Math.sin(Math.PI / 2);
        System.out.println(sinPiHalbe);

        double wurzelZwei = Math.sqrt(2);
        System.out.println(wurzelZwei);

        int[] feld = new int[]{100, 1000};
        System.out.println(feld.toString());
        String feldToString = java.util.Arrays.toString(feld);
        System.out.println(feldToString);

        int[][] matrix = new int[] [] {{11, 13}, {123, 190}};
        System.out.println(matrix.toString());
        String matrixAlsString = java.util.Arrays.toString(matrix);
        System.out.println(matrixAlsString);
        matrixAlsString = java.util.Arrays.deepToString(matrix);
        System.out.println(matrixAlsString);

        System.out.flush();

        long stopp = System.nanoTime();

        System.out.println((stopp - start) / 1000_000 + "ms");

    }

}