package problem1;

import static org.junit.Assert.*;

import java.nio.channels.Pipe;
import org.junit.Before;
import org.junit.Test;

public class ConPriorityQueueTest {
   private ConPriorityQueue conPriorityQueue;

  @Before
  public void setUp() throws Exception {
    conPriorityQueue = new ConPriorityQueue(new Element(5, "cat"),
        new EmptyPriorityQueue());
  }

  @Test
  public void isEmpty() {
    assertFalse(conPriorityQueue.isEmpty());
  }

  @Test
  public void add() {
    assertEquals("cat", conPriorityQueue.peek());
    PriorityQueue newPQ = conPriorityQueue.add(7, "dog");
    assertEquals("dog", newPQ.peek());
  }

  @Test
  public void peek() {
    PriorityQueue newPQ = conPriorityQueue.add(2, "dog");
    assertEquals("cat", newPQ.peek());
    newPQ = newPQ.add(7, "bird");
    assertEquals("bird", newPQ.peek());
    newPQ = newPQ.add(6, "deer");
    assertEquals("bird", newPQ.peek());
    newPQ = newPQ.add(10, "woof");
    assertEquals("woof", newPQ.peek());
    newPQ = newPQ.add(10, "chicken");
    assertEquals("woof", newPQ.peek());
  }

  @Test
  public void pop() {
    PriorityQueue newPQ = conPriorityQueue.add(2, "dog");
    assertEquals("cat", newPQ.peek());
    newPQ = newPQ.add(7, "bird");
    assertEquals("bird", newPQ.peek());
    newPQ = newPQ.add(6, "deer");
    assertEquals("bird", newPQ.peek());
    newPQ = newPQ.add(10, "woof");
    assertEquals("woof", newPQ.peek());
    newPQ = newPQ.add(10, "chicken");
    assertEquals("woof", newPQ.peek());

    newPQ = newPQ.pop();
    assertEquals("chicken", newPQ.peek());
    newPQ = newPQ.pop();
    assertEquals("bird", newPQ.peek());
    newPQ = newPQ.pop();
    assertEquals("deer", newPQ.peek());
    newPQ = newPQ.pop();
    assertEquals("cat", newPQ.peek());
    newPQ = newPQ.pop();
    assertEquals("dog", newPQ.peek());
    newPQ = newPQ.pop();  // EmptyPriorityQueue

  }

  @Test
  public void testHashCode() {
    ConPriorityQueue that = new ConPriorityQueue(new Element(5, "cat"),
        new EmptyPriorityQueue());
    assertTrue(conPriorityQueue.hashCode() == that.hashCode());
  }

  @Test
  public void testEquals() {
    assertTrue(conPriorityQueue.equals(conPriorityQueue));
    assertFalse(conPriorityQueue.equals(null));
    assertFalse(conPriorityQueue.equals(""));
    ConPriorityQueue that = new ConPriorityQueue(new Element(5, "cat"),
        new EmptyPriorityQueue());
    assertTrue(conPriorityQueue.equals(that));
  }

  @Test
  public void testFirstNotEquals() {
    ConPriorityQueue that = new ConPriorityQueue(new Element(2, "cat"),
        new EmptyPriorityQueue());
    assertFalse(conPriorityQueue.equals(that));

    ConPriorityQueue some = new ConPriorityQueue(new Element(5, "dog"),
        new EmptyPriorityQueue());
    assertFalse(conPriorityQueue.equals(some));
  }


  @Test
  public void testRestNotEquals() {
    ConPriorityQueue that = new ConPriorityQueue(new Element(2, "cat"),
        new EmptyPriorityQueue());

    PriorityQueue newThat = that.add(1, "woof");

    assertFalse(conPriorityQueue.equals(newThat));
  }



  @Test
  public void testToString() {
    String expected = "ConPriorityQueue{first=Element{priority='5', value='cat}, "
        + "rest=EmptyPriorityQueue{}}";
    assertEquals(expected, conPriorityQueue.toString());
  }
}