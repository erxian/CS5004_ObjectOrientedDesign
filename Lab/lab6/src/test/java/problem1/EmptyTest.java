package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmptyTest {
  private Empty empty;

  @Before
  public void setUp() throws Exception {
    empty = new Empty();
  }

  @Test
  public void size() {
    assertEquals(0, empty.size(), 0);
  }

  @Test
  public void isEmpty() {
    assertTrue(empty.isEmpty());
  }

  @Test
  public void add() {
    List newList = empty.add(5);
    assertTrue(newList.contains(5));
  }

  @Test(expected = InvalidCallException.class)
  public void last() {
    empty.last();
  }

  @Test
  public void contains() {
    assertFalse(empty.contains(5));
  }

  @Test(expected = InvalidCallException.class)
  public void elementAt() {
    empty.elementAt(5);
  }

  @Test
  public void testEquals() {
    assertTrue(empty.equals(empty));
    assertFalse(empty.equals(null));
    assertFalse(empty.equals(""));
  }

  @Test
  public void testHashCode() {
    assertTrue(empty.hashCode() == 42);
  }


  @Test
  public void testToString() {
    String expected = "EmptySet{}";
    assertEquals(expected, empty.toString());
  }
}