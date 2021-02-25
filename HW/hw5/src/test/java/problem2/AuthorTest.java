package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AuthorTest {
  private Author darthVader;
  private RecordingArtist langlang;

  @Before
  public void setUp() throws Exception {
    darthVader = new Author("Darth", "Vader");
    langlang = new RecordingArtist("lang", "lang");
  }

  @Test
  public void getFirstName() {
    assertEquals("Darth", darthVader.getFirstName());
  }

  @Test
  public void getLastName() {
    assertEquals("Vader", darthVader.getLastName());
  }

  @Test
  public void getArtists() {
    assertEquals(null, darthVader.getArtists());
  }

  @Test
  public void isBand() {
    assertFalse(darthVader.isBand());
  }

  @Test
  public void testEquals() {
    assertTrue(darthVader.equals(darthVader));
    assertFalse(darthVader.equals(langlang));
    assertFalse(darthVader.equals(null));
    assertFalse(darthVader.equals(""));
  }

  @Test
  public void testAllEquals() {
    Author copy = new Author("Darth", "Vader");
    assertTrue(darthVader.equals(copy));
  }

  @Test
  public void testFirstNotEquals() {
    Author darthPeter = new Author("Darth", "Peter");
    assertFalse(darthVader.equals(darthPeter));
  }

  @Test
  public void testLastNotEquals() {
    Author luVader = new Author("Lu", "Vader");
    assertFalse(darthVader.equals(luVader));
  }

  @Test
  public void testHashcode() {
    Author some = new Author("Darth", "Vader");
    assertTrue(darthVader.hashCode() == some.hashCode());
  }

  @Test
  public void testToString() {
    String expected = "Author{firstName='Darth', lastName='Vader'}";
    assertEquals(expected, darthVader.toString());
  }
}