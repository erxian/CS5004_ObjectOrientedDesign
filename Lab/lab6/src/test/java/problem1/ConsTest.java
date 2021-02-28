package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ConsTest {
  private Cons conList;

  @Before
  public void setUp() throws Exception {
    conList = new Cons(3, new Empty());
  }

  @Test
  public void getFirst() {
    assertEquals(3, conList.getFirst(), 0);
  }

  @Test
  public void getRest() {
    assertEquals(new Empty(), conList.getRest());
  }

  @Test
  public void size() {
    assertEquals(1, conList.size(), 0);
  }

  @Test
  public void isEmpty() {
    assertFalse(conList.isEmpty());
  }

  @Test
  public void add() {
    List newList = conList.add(5);
    assertTrue(newList.contains(5));
  }

  @Test
  public void last() {
    List newList = conList.add(5);
    assertEquals(3, newList.last(), 0);
  }

  @Test
  public void contains() {
    assertTrue(conList.contains(3));
  }

  @Test
  public void elementAt() {
    List newList = conList.add(5);
    assertEquals(3, newList.elementAt(1), 0);
  }

  @Test
  public void testEquals() {
    assertTrue(conList.equals(conList));
    assertFalse(conList.equals(null));
    assertFalse(conList.equals(""));
  }

  @Test
  public void testFirstNotEquals() {
    List newList = conList.add(5);
    Cons some = new Cons(5, new Empty());
    assertFalse(newList.equals(some));
  }

  @Test
  public void testRestNotEquals() {
    List newList = conList.add(5);
    Cons some = new Cons(3, new Empty());
    List newSome = some.add(6);
    assertFalse(newList.equals(newSome));
  }


  @Test
  public void testHashCode() {
    Cons some = new Cons(3, new Empty());
    assertTrue(conList.hashCode() == some.hashCode());
  }

  @Test
  public void testToString() {
    String expected = "Cons{first=3, rest=EmptySet{}}";
    assertEquals(expected, conList.toString());
  }
}