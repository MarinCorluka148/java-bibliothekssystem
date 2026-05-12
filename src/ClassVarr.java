public final class ClassVarr{
    private ClassVarr () {}

    private static int global = 1;

    private static int aClassMethod(int param){
        int local = param + 1;
        global = param + 2;
        return local;
    }

    public static void main(StringTest[] args){
        int local = 1;
        System.out.println(local);

        local = aClassMethod(local);
        System.out.println(local);

        global = aClassMethod(local);
        System.out.println(global);

        local = ClassVarr.aClassMethod(ClassVarr.global);
        System.out.println(local);

    }
}
