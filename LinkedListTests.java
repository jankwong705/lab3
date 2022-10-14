import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
    
    @Test
    public void testAppend() {
        //make a linked list root ≠ null and root next ≠ null
        //test for infinite loop
        LinkedList input = new LinkedList();
        input.prepend(3);
        input.prepend(2);
        input.prepend(1);
        input.append(4);
        assertEquals(1, input.first());
        assertEquals(2, input.root.next.value);
        assertEquals(3, input.root.next.next.value);
        assertEquals(4, input.last());
    }

    @Test
    public void testToString() {
        LinkedList input = new LinkedList();
        input.prepend(3);
        input.prepend(2);
        input.prepend(1);
        input.append(4);
        assertEquals("1 2 3 4 ", input.toString());
    }
}
