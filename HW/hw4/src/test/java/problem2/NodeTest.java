package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import problem1.Course;

public class NodeTest {
  private Node node1;
  private Node node2;
  private Node node3;

  @Before
  public void setUp() throws Exception {
    node1 = new Node(5, node2);
    node2 = new Node(10, node3);
    node3 = new Node(15, null);
  }

  @Test
  public void getItem() {
    assertEquals(10, node2.getItem(), 0);
  }


  @Test
  public void testEquals() {
    assertTrue(node1.equals(node1));
    assertFalse(node1.equals(node2));
    assertFalse(node1.equals(null));
    assertFalse(node1.equals(""));
  }

  @Test
  public void testItemNotEquals() {
    Node some = new Node(20, node3);
    assertFalse(node2.equals(some));
  }

  @Test
  public void testNextNotEquals() {
    Node some = new Node(5, node3);
    assertFalse(node1.equals(some));
  }

  @Test
  public void testAllNotEquals() {
    Node some = new Node(72, node3);
    assertFalse(some.equals(node3));
  }


  @Test
  public void testHashCode() {
    Node some = new Node(15, null);
    assertTrue(node3.hashCode() == some.hashCode());
  }

  @Test
  public void testToString() {
    String expected = "Node{item='5', nextNode=null}";
    assertEquals(expected, node1.toString());
  }
}