package problem2;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;

public class MusicTest {
  private RecordingArtist langlang;
  private Band littleTiger;

  private Music xiaoyequ;
  private Music fashionGroup;

  private RecordingArtist mem1;
  private RecordingArtist mem2;
  private RecordingArtist mem3;
  Set<RecordingArtist> threeMem;

  @Before
  public void setUp() throws Exception {
    langlang = new RecordingArtist("lang", "lang");
    xiaoyequ = new Music(langlang, "Piano", 2010);

    mem1 = new RecordingArtist("wu", "qilong");
    mem2 = new RecordingArtist("su", "youpeng");
    mem3 = new RecordingArtist("chen", "zhipeng");

    threeMem = new HashSet<>();
    threeMem.add(mem1);
    threeMem.add(mem2);
    threeMem.add(mem3);

    littleTiger = new Band("little tiger", threeMem);
    fashionGroup = new Music(littleTiger, "fashion group", 2004);
  }

  @Test
  public void getCreator() {
    assertEquals(langlang, xiaoyequ.getCreator());
    assertEquals(threeMem, fashionGroup.getCreator().getArtists());
  }

  @Test
  public void getItemTitle() {
    assertEquals("Piano", xiaoyequ.getItemTitle());
    assertEquals("fashion group", fashionGroup.getItemTitle());
  }

  @Test
  public void getReleasedYear() {
    assertEquals(2010, xiaoyequ.getReleasedYear(), 0);
    assertEquals(2004, fashionGroup.getReleasedYear(),0);
  }

  @Test
  public void testEquals() {
    assertTrue(fashionGroup.equals(fashionGroup));
    assertFalse(fashionGroup.equals(littleTiger));
    assertFalse(fashionGroup.equals(null));
    assertFalse(fashionGroup.equals(""));
  }

  @Test
  public void testHashCode() {
    Music copy = new Music(langlang, "Piano", 2010);
    assertTrue(xiaoyequ.hashCode() == copy.hashCode());
  }

  @Test
  public void testToString() {
    String expected = "Music{Music Creator='RecordingArtist{firstName='lang', lastName='lang'}', "
        + "Title='Piano', Released Year='2010}";
    assertEquals(expected, xiaoyequ.toString());
  }

  @Test
  public void testBandToString() {
    String expected = "Music{Music Creator='RecordingArtist{bandName='little tiger', "
        + "recordingArtists='[RecordingArtist{firstName='wu', lastName='qilong'}, "
        + "RecordingArtist{firstName='chen', lastName='zhipeng'}, "
        + "RecordingArtist{firstName='su', lastName='youpeng'}]'}', "
        + "Title='fashion group', Released Year='2004}";
    assertEquals(expected, fashionGroup.toString());
  }
}