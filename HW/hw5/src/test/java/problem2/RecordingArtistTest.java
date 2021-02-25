package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RecordingArtistTest {

  private RecordingArtist langlang;
  private Author darthVader;

  @Before
  public void setUp() throws Exception {
    darthVader = new Author("Darth", "Vader");
    langlang = new RecordingArtist("lang", "lang");
  }

  @Test
  public void getFirstName() {
    assertEquals("lang", langlang.getFirstName());
  }

  @Test
  public void getLastName() {
    assertEquals("lang", langlang.getLastName());
  }

  @Test
  public void getArtists() {
    assertEquals(null, langlang .getArtists());
  }

  @Test
  public void isBand() {
    assertFalse(langlang.isBand());
  }

  @Test
  public void testEquals() {
    assertTrue(langlang.equals(langlang));
    assertFalse(langlang.equals(darthVader));
    assertFalse(langlang.equals(null));
    assertFalse(langlang.equals(""));
  }

  @Test
  public void testFirstAllEquals() {
    RecordingArtist copy = new RecordingArtist("lang", "lang");
    assertTrue(langlang.equals(copy));
  }

  @Test
  public void testFirstNotEquals() {
    RecordingArtist liulang = new RecordingArtist("liu", "lang");
    assertFalse(langlang.equals(liulang));
  }

  @Test
  public void testLastNotEquals() {
    RecordingArtist langpi = new RecordingArtist("lang", "pi");
    assertFalse(langlang.equals(langpi));
  }

  @Test
  public void testHashcode() {
    RecordingArtist some = new RecordingArtist("lang", "lang");
    assertTrue(langlang.hashCode() == some.hashCode());
  }

  @Test
  public void testToString() {
    String expected = "RecordingArtist{firstName='lang', lastName='lang'}";
    assertEquals(expected, langlang.toString());
  }

}