package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ElementTest {
  private Element element;

  @Before
  public void setUp() throws Exception {
    element = new Element(1, "kitty");
  }

  @Test
  public void getPriority() {
    assertEquals(1, element.getPriority(), 0);
  }

  @Test
  public void getValue() {
    assertEquals("kitty", element.getValue());
  }

  @Test
  public void testHashCode() {
    Element that = new Element(1, "kitty");
    assertTrue(element.hashCode() == that.hashCode());
  }

  @Test
  public void testEquals() {
    assertTrue(element.equals(element));
    assertFalse(element.equals(null));
    assertFalse(element.equals(""));
    Element that = new Element(1, "kitty");
    assertTrue(element.equals(that));
  }

  @Test
  public void testPriNotEquals() {
    Element that = new Element(2, "kitty");
    assertFalse(element.equals(that));
  }


  @Test
  public void testValueNotEquals() {
    Element that = new Element(1, "dog");
    assertFalse(element.equals(that));
  }

  @Test
  public void testToString() {
    String expected = "Element{priority='1', value='kitty}";
    assertEquals(expected, element.toString());
  }
}