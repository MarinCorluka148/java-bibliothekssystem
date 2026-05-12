package liste;

import java.util.NoSuchElementException;

public final class IntList{
    private Element head;

    public IntList(){
        this.head = null;
    }

    public IntList insert(int n){
        this.head = new Element(this.head, n);
        return this;
    }

    private static final class Element{
        private final Element next;
        private final int n;

        private Element(Element e, int n){
            this.next = e;
            this.n = n;
        }
    }
    public final class Iterator{
        private Element current = IntList.this.head;

        public boolean hasNext(){
            return current != null;
        }

        public int next(){
            if (current == null){
                throw new NoSuchElementException();
            }
            Element e = this.current;
            this.current = this.current.next;
            return e.n;
        }
    }
}