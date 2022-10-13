import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

class StringMethods implements StringChecker {
    public boolean checkString(String s) {
        return s.contains("s");
    }
}
public class ListTests {

    @Test
    public void testFilter() {
        StringChecker sc = new StringMethods();
        List<String> s = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        s.add("seasame");
        expected.add("seasame");
        s.add("sonata");
        expected.add("sonata");
        s.add("diego");
        s.add("sofa");
        expected.add("sofa");
        s.add("detrimental");
        s.add("coffee");
        List<String> results = ListExamples.filter(s, sc);
        assertEquals(expected, results);
    }
}