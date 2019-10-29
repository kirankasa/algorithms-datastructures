import java.util.Iterator;

public class StackOfStringWithLinkedList implements Iterable {

    private Node first;

    public Iterator iterator() {
        return new ListIterator(first);
    }

    private class Node {
        private String item;
        private Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public String pop() {
        String item = first.item;
        first = first.next;
        return item;
    }

    public void push(String item) {
        Node newItem = new Node();
        newItem.item = item;
        newItem.next = first;
        first = newItem;
    }

    private class ListIterator implements Iterator<String> {
        private Node node;

        ListIterator(Node node) {
            this.node = node;

        }

        public boolean hasNext() {
            return node != null;
        }

        public String next() {
            String item = node.item;
            node = node.next;
            return item;
        }

        public void remove() {

        }
    }
}
