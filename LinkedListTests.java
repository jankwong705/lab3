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
        assertEquals(4, input.root);
    }
}
