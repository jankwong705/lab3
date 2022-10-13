import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReverseInPlaceNormArray() {
    int[] input = {1, 4, 6, 2};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{2, 6, 4, 1}, input);
  }

  @Test
  public void testReversedNormArray() {
    int[] input = {9, 0, 8, 7};
    assertArrayEquals(new int[]{7, 8, 0, 9}, ArrayExamples.reversed(input));
  }
  
  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
}
