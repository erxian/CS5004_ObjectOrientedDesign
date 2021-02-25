package problem2;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;

public class BandTest {
  private Band littleTiger;
  private RecordingArtist mem1;
  private RecordingArtist mem2;
  private RecordingArtist mem3;
  Set<RecordingArtist> threeMem;

  @Before
  public void setUp() throws Exception {
    mem1 = new RecordingArtist("wu", "qilong");
    mem2 = new RecordingArtist("su", "youpeng");
    mem3 = new RecordingArtist("chen", "zhipeng");

    threeMem = new HashSet<>();
    threeMem.add(mem1);
    threeMem.add(mem2);
    threeMem.add(mem3);

    littleTiger = new Band("little tiger", threeMem);
  }

  @Test
  public void getBandName() {
    assertEquals("little tiger", littleTiger.getBandName());
  }

  @Test
  public void getRecordingArtists() {
    assertEquals(threeMem, littleTiger.getRecordingArtists());
  }

  @Test
  public void getArtists() {
    assertEquals(threeMem, littleTiger.getArtists());
  }

  @Test
  public void isBand() {
    assertTrue(littleTiger.isBand());
  }

  @Test
  public void testEquals() {
    assertTrue(littleTiger.equals(littleTiger));
    assertFalse(littleTiger.equals(mem1));
    assertFalse(littleTiger.equals(null));
    assertFalse(littleTiger.equals(""));
  }

  @Test
  public void testAllEquals() {
    Band copy = new Band("little tiger", threeMem);
    assertTrue(littleTiger.equals(copy));
  }


  @Test
  public void testNameNotEquals() {
    Band some = new Band("fenghuang", threeMem);
    assertFalse(littleTiger.equals(some));
  }

  @Test
  public void testMemNotEquals() {
    Set<RecordingArtist> solo = new HashSet<>();
    solo.add(mem1);
    Band some = new Band("little tiger", solo);
    assertFalse(littleTiger.equals(some));
  }

  @Test
  public void testHashcode() {
    Band copy = new Band("little tiger", threeMem);
    assertTrue(littleTiger.hashCode() == copy.hashCode());
  }

  @Test
  public void testToString() {
    String expected = "RecordingArtist{bandName='little tiger', "
        + "recordingArtists='[RecordingArtist{firstName='wu', lastName='qilong'}, "
        + "RecordingArtist{firstName='chen', lastName='zhipeng'}, "
        + "RecordingArtist{firstName='su', lastName='youpeng'}]'}";
    assertEquals(expected, littleTiger.toString());
  }
}