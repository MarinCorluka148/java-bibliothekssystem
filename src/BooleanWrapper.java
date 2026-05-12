public final class BooleanWrapper{
    private BooleanWrapper(){}

    public static void main(String[] args){
      Boolean reference;
      reference = Boolean.TRUE;
      reference = Boolean.valueOf(true);

      boolean value;
      value = true;
      value = reference.booleanValue();
    }

}