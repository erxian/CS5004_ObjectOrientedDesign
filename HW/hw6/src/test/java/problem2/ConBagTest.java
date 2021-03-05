package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import problem1.ConPriorityQueue;
import problem1.Element;
import problem1.PriorityQueue;

public class ConBagTest {
  private BagOfWords conBag;

  @Before
  public void setUp() throws Exception {
    conBag = new ConBag("cat", BagOfWords.emptyBagOfWords());
  }

  @Test
  public void isEmpty() {
    assertFalse(conBag.isEmpty());
  }

  @Test
  public void size() {
    assertEquals(1, conBag.size(), 0);
  }

  @Test
  public void add() {
    BagOfWords newBag = conBag.add("dog");
    assertTrue(newBag.contains("dog"));
    assertFalse(conBag.contains("dog"));
  }

  @Test
  public void contains() {
    assertTrue(conBag.contains("cat"));
    assertFalse(conBag.contains("dog"));
  }

  @Test
  public void testHashCode() {
    BagOfWords that = new ConBag("cat", BagOfWords.emptyBagOfWords());
    assertTrue(conBag.hashCode() == that.hashCode());
  }

  @Test
  public void testEquals() {
    assertTrue(conBag.equals(conBag));
    assertFalse(conBag.equals(null));
    assertFalse(conBag.equals(""));
    BagOfWords that = new ConBag("cat", BagOfWords.emptyBagOfWords());
    assertTrue(conBag.equals(that));
  }

  @Test
  public void testAllEquals() {
    /**
     * from client aspect, conBag1 is ["cat", "woof", "dog", "woof", "dog", "dog"]
     * from client aspect, conBag2 is ["dog", "dog", "cat", "woof", "dog", "woof"]
     * Inside the program, both newBag and newSome are: ["woof", "woof", "dog", "dog", "dog", "cat]
     */
    BagOfWords conBag1 = new ConBag("cat", BagOfWords.emptyBagOfWords());
    BagOfWords conBag2 = new ConBag("dog", BagOfWords.emptyBagOfWords());

    BagOfWords newBag1 = conBag1.add("woof");
    BagOfWords newBag2 = conBag2.add("dog");

    newBag1 = newBag1.add("dog");
    newBag2 = newBag2.add("cat");

    newBag1 = newBag1.add("woof");
    newBag2 = newBag2.add("woof");

    newBag1 = newBag1.add("dog");
    newBag2 = newBag2.add("dog");

    newBag1 = newBag1.add("dog");
    newBag2 = newBag2.add("woof");

    assertTrue(newBag1.equals(newBag2));
  }

  @Test
  public void testSizeNotEquals() {
    BagOfWords conBag1 = new ConBag("cat", BagOfWords.emptyBagOfWords());
    BagOfWords conBag2 = new ConBag("dog", BagOfWords.emptyBagOfWords());

    BagOfWords newBag1 = conBag1.add("woof");
    BagOfWords newBag2 = conBag2.add("dog");

    newBag1 = newBag1.add("dog");
    assertFalse(newBag1.equals(newBag2));
  }

  @Test
  public void testFirstNotEquals() {
    BagOfWords conBag1 = new ConBag("cat", BagOfWords.emptyBagOfWords());
    BagOfWords conBag2 = new ConBag("dog", BagOfWords.emptyBagOfWords());

    BagOfWords newBag1 = conBag1.add("dog");
    BagOfWords newBag2 = conBag2.add("woof");

    assertFalse(newBag1.equals(newBag2));
  }

  @Test
  public void testToString() {
    String expected = "ConBag{first=cat, rest=EmptyBag{}}";
    assertEquals(expected, conBag.toString());
  }
}