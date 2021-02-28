package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ConsSetTest {
  private ConsSet consSet;

  @Before
  public void setUp() throws Exception {
    consSet = new ConsSet(5, new EmptySet());
  }

  @Test
  public void getFirst() {
    assertEquals(5, consSet.getFirst(), 0);
  }

  @Test
  public void getRest() {
    assertEquals(new EmptySet(), consSet.getRest());
  }

  @Test
  public void isEmpty() {
    assertFalse(consSet.isEmpty());
  }

  @Test
  public void add() {
    ISet newSet = consSet.add(10);
    assertTrue(newSet.contains(10));
  }

  @Test
  public void contains() {
    assertTrue(consSet.contains(5));
    assertFalse(consSet.contains(10));
  }

  @Test
  public void removeRest() {
    ISet newSet = consSet.add(10);
    ISet newSet2 = newSet.remove(5);
    ConsSet some = new ConsSet(10, new EmptySet());
    assertTrue(newSet2.equals(some));
  }

  @Test
  public void removeFirst() {
    ISet newSet = consSet.add(10);
    ISet newSet2 = newSet.remove(10);
    ConsSet some = new ConsSet(5, new EmptySet());
    assertTrue(newSet2.equals(some));
  }

  @Test
  public void size() {
    assertEquals(1, consSet.size(), 0);
  }

  @Test
  public void testHashCode() {
    ConsSet some = new ConsSet(5, new EmptySet());
    assertTrue(consSet.hashCode() == some.hashCode());
  }

  @Test
  public void testEquals() {
    assertTrue(consSet.equals(consSet));
    assertFalse(consSet.equals(null));
    assertFalse(consSet.equals(""));
  }

  @Test
  public void testSizeNotEquals() {
    ConsSet some = new ConsSet(5, new EmptySet());
    ISet someNew = some.add(9);
    assertFalse(consSet.equals(someNew));
  }

  @Test
  public void testFirstNotEquals() {
    ConsSet some = new ConsSet(8, new EmptySet());
    assertFalse(consSet.equals(some));
  }

  @Test
  public void testRestNotEquals() {
    ISet newSet = consSet.add(10);
    ConsSet some = new ConsSet(5, new EmptySet());
    ISet someNew = some.add(9);
    assertFalse(newSet.equals(someNew));
  }

  @Test
  public void testAllEquals() {
    ISet newSet = consSet.add(10);
    ConsSet some = new ConsSet(5, new EmptySet());
    ISet someNew = some.add(10);
    assertTrue(newSet.equals(someNew));
  }


  @Test
  public void testToString() {
    ISet newSet = consSet.add(10);
    String expected = "Cons{first=10, rest=Cons{first=5, rest=EmptySet{}}}";
    assertEquals(expected, newSet.toString());
  }
}