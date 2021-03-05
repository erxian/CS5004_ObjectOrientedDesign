package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import problem1.EmptyPriorityQueue;

public class EmptyBagTest {
  private BagOfWords emptyBag;

  @Before
  public void setUp() throws Exception {
    emptyBag = BagOfWords.emptyBagOfWords();
  }

  @Test
  public void isEmpty() {
    assertTrue(emptyBag.isEmpty());
  }

  @Test
  public void size() {
    assertEquals(0, emptyBag.size(), 0);
  }

  @Test
  public void add() {
    BagOfWords newBag = emptyBag.add("cat");
    assertEquals(1, newBag.size(), 0);
  }

  @Test
  public void contains() {
    assertFalse(emptyBag.contains("cat"));
  }

  @Test
  public void testHashCode() {
    assertTrue(emptyBag.hashCode() == 31);
  }

  @Test
  public void testEquals() {
    assertTrue(emptyBag.equals(emptyBag));
    assertFalse(emptyBag.equals(null));
    assertFalse(emptyBag.equals(""));
    BagOfWords that = BagOfWords.emptyBagOfWords();
    assertTrue(emptyBag.equals(that));
  }

  @Test
  public void testToString() {
    String expected = "EmptyBag{}";
    assertEquals(expected, emptyBag.toString());
  }
}