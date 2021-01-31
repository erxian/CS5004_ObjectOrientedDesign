package problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PosnTest {
  private Posn posn1;
  private Posn posn1xNull;
  private Posn posn1yNull;
  private Posn posnNull;

  @Before
  public void setUp() throws Exception {
    posn1 = new Posn(1,1);
    posn1xNull =  new Posn(null, 1);
    posn1yNull = new Posn(1, null);
    posnNull = new Posn(null, null);
  }

  @Test
  public void getX() {
    assertEquals(1, posn1.getX(), 0);
    assertEquals(null, posn1xNull.getX());
    assertEquals(1, posn1yNull.getX(), 0);
    assertEquals(null, posnNull.getX());
  }

  @Test
  public void getY() {
    assertEquals(1, posn1.getY(), 0);
    assertEquals(1, posn1xNull.getY(), 0);
    assertEquals(null, posn1yNull.getY());
    assertEquals(null, posnNull.getY());
  }

  @Test
  public void testEquals() {
    assertTrue(posn1.equals(posn1));

    assertTrue(new Posn(1, 1).equals(posn1));
    assertTrue(posn1.equals(new Posn(1, 1)));
    assertTrue(new Posn(null, 1).equals(posn1xNull));
    assertTrue(new Posn(1, null).equals(posn1yNull));
    assertTrue(new Posn(null, null).equals(posnNull));

    assertFalse(posn1.equals(null));
    assertFalse(posn1.equals(new Author("peter", "peter@gmail.com", "No.110")));

    assertFalse(new Posn(2, 2).equals(posn1));
    assertFalse(new Posn(null, 2).equals(posn1xNull));
    assertFalse(new Posn(2, null).equals(posn1yNull));

    assertFalse(posn1.equals(posn1xNull));
    assertFalse(posn1.equals(posn1yNull));
    assertFalse(posn1.equals(posnNull));

    assertFalse(posn1xNull.equals(posn1yNull));
    assertFalse(posn1xNull.equals(posnNull));
    assertFalse(posn1yNull.equals(posnNull));
    assertFalse(posnNull.equals(posn1xNull));
  }

  @Test
  public void testHashCode() {
    assertTrue(new Posn(1, 1).hashCode() == posn1.hashCode());
    assertTrue(new Posn(null, 1).hashCode() == posn1xNull.hashCode());
    assertTrue(new Posn(1, null).hashCode() == posn1yNull.hashCode());
    assertTrue(new Posn(null, null).hashCode() == posnNull.hashCode());

    assertFalse(new Posn(2, 2).hashCode() == posn1.hashCode());
    assertFalse(new Posn(null, 2).hashCode() == posn1xNull.hashCode());
    assertFalse(new Posn(2, null).hashCode() == posn1yNull.hashCode());

    assertFalse(posn1.hashCode() == posn1xNull.hashCode());
    assertFalse(posn1.hashCode() == posn1yNull.hashCode());
    assertFalse(posn1.hashCode() == posnNull.hashCode());
    assertFalse(posn1xNull.hashCode() == posn1yNull.hashCode());
    assertFalse(posn1xNull.hashCode() == posnNull.hashCode());
    assertFalse(posn1yNull.hashCode() == posnNull.hashCode());
  }

  @Test
  public void testToString() {
    assertEquals("Posn{x=1, y=1}", posn1.toString());
    assertEquals("Posn{x=null, y=1}", posn1xNull.toString());
    assertEquals("Posn{x=1, y=null}", posn1yNull.toString());
    assertEquals("Posn{x=null, y=null}", posnNull.toString());
  }
}