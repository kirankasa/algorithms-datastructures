import java.util.Iterator;

public class StackOfStringWithArray implements Iterable<String> {

    private int N = 0;
    private String[] array;

    public StackOfStringWithArray(int capacity) {
        this.array = new String[capacity];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public String pop() {
        return array[--N];
    }

    public void push(String item) {
        array[N++] = item;
    }

    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int length = N;

            public boolean hasNext() {
                return length != 0;
            }

            public String next() {
                return array[--length];
            }

            public void remove() {

            }
        };
    }
}
