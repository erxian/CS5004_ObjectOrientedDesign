package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmptyPriorityQueueTest {
  private PriorityQueue emptyPriorityQueue;

  @Before
  public void setUp() throws Exception {
    emptyPriorityQueue = PriorityQueue.createEmpty();
  }

  @Test
  public void isEmpty() {
    assertTrue(emptyPriorityQueue.isEmpty());
  }

  @Test
  public void add() {
    PriorityQueue that = emptyPriorityQueue.add(2, "kitty");
    assertEquals("kitty", that.peek());
  }

  @Test(expected = InvalidCallException.class)
  public void peek() {
    emptyPriorityQueue.peek();
  }

  @Test(expected = InvalidCallException.class)
  public void pop() {
    emptyPriorityQueue.pop();
  }

  @Test
  public void testHashCode() {
    assertTrue(emptyPriorityQueue.hashCode() == 31);
  }

  @Test
  public void testEquals() {
    assertTrue(emptyPriorityQueue.equals(emptyPriorityQueue));
    assertFalse(emptyPriorityQueue.equals(null));
    assertFalse(emptyPriorityQueue.equals(""));
    PriorityQueue that = PriorityQueue.createEmpty();;
    assertTrue(emptyPriorityQueue.equals(that));
  }

  @Test
  public void testToString() {
    String expected = "EmptyPriorityQueue{}";
    assertEquals(expected, emptyPriorityQueue.toString());
  }
}