import java.util.Scanner;
import java.util.NoSuchElementException;

public final class Exceptions{
    private Exceptions(){
        throw new AssertionError("illegal class instantation");
    }

    public static void main(String[] args){
        try{
            int n = Input.Output.readInt();
            n = sqrt(n);
            InputOutput.print(n);
            Exceptions e = new Exceptions();
            e.sqrt(n);
        }catch (InputException x){
            String s = x.getMessage();
            System.err.println(s);
        }catch (IllegalArgumentException x){
            x.printStackTrace();
        }
    }
}