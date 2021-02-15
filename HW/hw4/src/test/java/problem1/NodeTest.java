package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NodeTest {
  private Node node1;
  private Node node2;
  private Node node3;

  @Before
  public void setUp() throws Exception {
    node1 = new Node(new Course("Algorithm", "CS", 5008), node2);
    node2 = new Node(new Course("OOD", "CS", 5004), node3);
    node3 = new Node(new Course("Python", "CS", 5001), null);
  }

  @Test
  public void testToString() {
    String expected = "Node{courseCS5008: Algorithm', nextNode=null}";
    assertEquals(expected, node1.toString());
    System.out.println(node1.toString());
  }

  @Test
  public void testEquals() {
    assertTrue(node1.equals(node1));
    assertFalse(node1.equals(node2));
    assertFalse(node1.equals(null));
    assertFalse(node1.equals(""));
  }

  @Test
  public void testCourseNotEquals() {
    Node some = new Node(new Course("XXX", "CS", 5004), node3);
    assertFalse(node2.equals(some));
  }

  @Test
  public void testNextNotEquals() {
    assertFalse(node1.equals(node2));
  }


  @Test
  public void testHashcode() {
    Node some = new Node(new Course("Python", "CS", 5001), null);
    assertTrue(node3.hashCode() == some.hashCode());
  }

  @Test
  public void testToStrings() {
    String expected = "Node{courseCS5001: Python', nextNode=null}";
    assertEquals(expected, node3.toString());
  }
}