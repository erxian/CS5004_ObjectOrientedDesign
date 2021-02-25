package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BookTest {
  private Author jk;
  private Book harryPotter;

  @Before
  public void setUp() throws Exception {
    jk = new Author("J.K.", "Rowling");
    harryPotter = new Book(jk, "Harry Potter", 2005);
  }


  @Test
  public void getCreator() {
    assertEquals(jk, harryPotter.getCreator());
  }

  @Test
  public void getItemTitle() {
    assertEquals("Harry Potter", harryPotter.getItemTitle());
  }

  @Test
  public void getReleasedYear() {
    assertEquals(2005, harryPotter.getReleasedYear(), 0);
  }


  @Test
  public void testEquals() {
    assertTrue(harryPotter.equals(harryPotter));
    assertFalse(harryPotter.equals(jk));
    assertFalse(harryPotter.equals(null));
    assertFalse(harryPotter.equals(""));
  }


  @Test
  public void testAllEquals() {
   Book copy = new Book(jk, "Harry Potter", 2005);
   assertTrue(harryPotter.equals(copy));
  }

  @Test
  public void testAuthorNotEquals() {
    Author darthPeter = new Author("Darth", "Peter");
    Book some = new Book(darthPeter, "Harry Potter", 2005);
    assertFalse(harryPotter.equals(some));
  }

  @Test
  public void testTitleNotEquals() {
    Book some = new Book(jk, "HarryPotter", 2005);
    assertFalse(harryPotter.equals(some));
  }

  @Test
  public void testYearNotEquals() {
    Book some = new Book(jk, "Harry Potter", 2010);
    assertFalse(harryPotter.equals(some));
  }


  @Test
  public void testHashCode() {
    Book copy = new Book(jk, "Harry Potter", 2005);
    assertTrue(harryPotter.hashCode() == copy.hashCode());
  }

  @Test
  public void testToString() {
    String expected = "Book{Author='Author{firstName='J.K.', lastName='Rowling'}', "
        + "Title='Harry Potter', Released Year='2005}";
    assertEquals(expected, harryPotter.toString());
  }
}