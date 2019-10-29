import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

public class StackOfStringWithLinkedListTest {


    @Test
    public void isEmpty() {
        StackOfStringWithLinkedList list = new StackOfStringWithLinkedList();
        Assertions.assertTrue(list.isEmpty());
    }

    @Test
    public void pop() {
        StackOfStringWithLinkedList list = new StackOfStringWithLinkedList();
        list.push("123");
        String item = list.pop();
        Assertions.assertEquals("123", item);
    }

    @Test
    public void push() {
        StackOfStringWithLinkedList list = new StackOfStringWithLinkedList();
        list.push("123");
        Assertions.assertFalse(list.isEmpty());
        list.push("123");
        list.push("345");

        String item1 = list.pop();
        String item2 = list.pop();
        Assertions.assertEquals("345", item1);
        Assertions.assertEquals("123", item2);
    }

    @Test
    public void iterator() {
        StackOfStringWithLinkedList list = new StackOfStringWithLinkedList();
        list.push("123");
        Assertions.assertFalse(list.isEmpty());
        list.push("345");

        Iterator iterator = list.iterator();
        Assertions.assertNotNull(iterator);
        Assertions.assertTrue(iterator.hasNext());
        String item1 = (String) iterator.next();
        String item2 = (String) iterator.next();
        Assertions.assertEquals("345", item1);
        Assertions.assertEquals("123", item2);
    }
}