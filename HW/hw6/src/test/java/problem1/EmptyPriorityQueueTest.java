package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmptyPriorityQueueTest {
  private EmptyPriorityQueue emptyPriorityQueue;

  @Before
  public void setUp() throws Exception {
    emptyPriorityQueue = new EmptyPriorityQueue();
  }

  @Test
  public void isEmpty() {
  }

  @Test
  public void add() {
    emptyPriorityQueue.add(2, "kitty");
  }

  @Test(expected = InvalidCallException.class)
  public void peek() {
    emptyPriorityQueue.peek();
  }

  @Test
  public void testPeek() {
    PriorityQueue newPQ = emptyPriorityQueue.add(2, "kitty");
    assertEquals("kitty", newPQ.peek());
    newPQ = newPQ.add(7, "dog");
    assertEquals("dog", newPQ.peek());
    newPQ = newPQ.add(5, "deer");
    assertEquals("dog", newPQ.peek());
    newPQ = newPQ.add(10, "woof");
    assertEquals("woof", newPQ.peek());
    newPQ = newPQ.add(10, "chicken");
    assertEquals("woof", newPQ.peek());
  }


  @Test
  public void pop() {
  }

  @Test
  public void testHashCode() {
  }

  @Test
  public void testEquals() {
  }

  @Test
  public void testToString() {
  }
}