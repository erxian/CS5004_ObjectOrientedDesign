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
    List newList = conList.add(5);
    assertTrue(newList.contains(3));
    assertFalse(newList.contains(10));
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
    Cons some = new Cons(5, new Empty());
    assertFalse(conList.equals(some));
  }

  @Test
  public void testFirstEquals() {
    Cons some = new Cons(3, new Empty());
    assertTrue(conList.equals(some));
  }


  @Test
  public void testFirstIsNullEquals() {
    Cons some = new Cons(null, new Empty());
    Cons list = new Cons(5, new Empty());
    assertFalse(some.equals(list));
  }

  @Test
  public void testNullEquals() {
    Cons some = new Cons(null, new Empty());
    Cons list = new Cons(null, new Empty());
    assertTrue(some.equals(list));
  }

  @Test
  public void testRestIsNullEquals() {
    Cons some = new Cons(5, null);
    Cons list = new Cons(5, null);
    assertTrue(some.equals(list));
  }


  @Test
  public void testRestNullEquals() {
    Cons some = new Cons(5, null);
    Cons list = new Cons(5, new Empty());
    assertFalse(some.equals(list));
  }


  @Test
  public void testRestNotEquals() {
    List newList = conList.add(5);
    Cons some = new Cons(3, new Empty());
    List newSome = some.add(6);
    assertFalse(newList.equals(newSome));
  }

  @Test
  public void testRestEquals() {
    List newList = conList.add(5);
    Cons some = new Cons(3, new Empty());
    List newSome = some.add(5);
    assertTrue(newList.equals(newSome));
  }

  @Test
  public void testAllEquals() {
    Cons some = new Cons(3, new Empty());
    assertTrue(conList.equals(some));
  }


  @Test
  public void testHashCode() {
    Cons some = new Cons(3, new Empty());
    assertTrue(conList.hashCode() == some.hashCode());
  }

  @Test
  public void testAllIsNullHashCode() {
    Cons some = new Cons(null, null);
    assertTrue(some.hashCode() == 0);
  }

  @Test
  public void testFirstIsNullHashCode() {
    Cons some = new Cons(null, new Empty());
    assertTrue(some.hashCode() == 42);
  }

  @Test
  public void testFirstNotNullHashCode() {
    Cons some = new Cons(5, new Empty());
    assertTrue(some.hashCode() == 197);
  }

  @Test
  public void testRestIsNullHashCode() {
    Cons some = new Cons(5, null);
    assertTrue(some.hashCode() == 155);
  }


  @Test
  public void testToString() {
    String expected = "Cons{first=3, rest=EmptySet{}}";
    assertEquals(expected, conList.toString());
  }
}