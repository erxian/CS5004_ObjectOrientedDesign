package problem2;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;

public class CatalogTest {
  private Catalog catalog1;
  private Catalog catalog2;
  private Author jk;
  private AbstractItem harryPotter;
  private Set<AbstractItem> origin;

  @Before
  public void setUp() throws Exception {
    catalog1 = new Catalog();

    jk = new Author("J.K.", "Rowling");
    harryPotter = new Book(jk, "Harry Potter", 2005);
    origin = new HashSet<>();
    origin.add(harryPotter);
    catalog2 = new Catalog(origin);
  }

  @Test
  public void addItem() {
    AbstractItem chinesePianist = new Music(new RecordingArtist("Lang", "lang"), "Piano", 2010);
    catalog1.addItem(chinesePianist);
    Set<AbstractItem> result = catalog1.search("piano");
    assertTrue(result.contains(chinesePianist));
  }

  @Test
  public void removeItem() {
    catalog2.removeItem(harryPotter);
    Set<AbstractItem> result = catalog2.search("harry");
    assertFalse(result.contains(harryPotter));
  }

  @Test
  public void searchByKeywords() {
    Set<AbstractItem> result = catalog2.search("potter");
    assertTrue(result.contains(harryPotter));
  }

  @Test
  public void searchByAuthor() {
    Set<AbstractItem> result = catalog2.search(jk);
    assertTrue(result.contains(harryPotter));
  }

  @Test
  public void searchByArtist() {
    AbstractItem chinesePianist = new Music(new RecordingArtist("Lang", "lang"), "Piano", 2010);

    RecordingArtist mem1 = new RecordingArtist("wu", "qilong");
    RecordingArtist mem2 = new RecordingArtist("su", "youpeng");
    RecordingArtist mem3 = new RecordingArtist("chen", "zhipeng");

    Set<RecordingArtist> threeMem = new HashSet<>();
    threeMem.add(mem1);
    threeMem.add(mem2);
    threeMem.add(mem3);

    Band tiger = new Band("little tiger", threeMem);
    AbstractItem littleTiger = new Music(tiger, "little Tiger", 2000);
    AbstractItem singerWu = new Music(mem1, "Singer", 2013);

    catalog2.addItem(singerWu);
    catalog2.addItem(littleTiger);
    Set<AbstractItem> result = catalog2.search(mem1);
    assertTrue(result.contains(littleTiger));
    assertTrue(result.contains(singerWu));
  }
}