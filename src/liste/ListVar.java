package liste;

public final class ListVar{

    public static void main(String[] args){
        int[] listZahlen = {1, 2, 3, 4, 5,};

        IntList hund = new IntList();

        for(int i = 0; i < listZahlen.length; i++){
            hund.insert(listZahlen[i]);
        }

        IntList.Iterator schwuchtel = hund.new Iterator();
        while(schwuchtel.hasNext()){
            System.out.println(schwuchtel.next());
        }
    }
}
