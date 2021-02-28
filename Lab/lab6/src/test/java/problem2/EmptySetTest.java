package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmptySetTest {
  private EmptySet emptySet;

  @Before
  public void setUp() throws Exception {
    emptySet = new EmptySet();
  }

  @Test
  public void isEmpty() {
    assertTrue(emptySet.isEmpty());
  }

  @Test
  public void add() {
    ISet newSet = emptySet.add(5);
    assertTrue(newSet.contains(5));
  }

  @Test
  public void contains() {
    assertFalse(emptySet.contains(1));
  }

  @Test
  public void remove() {
    ISet newSet = emptySet.remove(5);
    assertTrue(emptySet.equals(newSet));
  }

  @Test
  public void size() {
    assertEquals(0, emptySet.size(), 0);
  }

  @Test
  public void testHashCode() {
    assertEquals(31, emptySet.hashCode());
  }

  @Test
  public void testEquals() {
    assertTrue(emptySet.equals(emptySet));
    assertFalse(emptySet.equals(null));
    assertFalse(emptySet.equals(""));
  }

  @Test
  public void testToString() {
    String expected = "EmptySet{}";
    assertEquals(expected, emptySet.toString());
  }
}