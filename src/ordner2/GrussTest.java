package ordner2;

import ordner1.Gruss;
import static ordner1.Gruss.gruss;

public final class GrussTest{
    private GrussTest(){}

    public static void main(String[] args){
        ordner1.Gruss.gruss();
        Gruss.gruss();
        gruss();
    }
}
