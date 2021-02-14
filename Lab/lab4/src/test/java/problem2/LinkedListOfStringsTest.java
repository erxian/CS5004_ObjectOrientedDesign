package problem2;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class LinkedListOfStringsTest {
  IListOfStrings empty;
  IListOfStrings aList;

  @Before
  public void setUp() throws Exception {
    empty = LinkedListOfStrings.createEmpty();
    aList = LinkedListOfStrings.createEmpty();
    aList.add("A");
    aList.add("B");
  }

  @Test
  public void isEmpty() {
    assertEquals(true, empty.isEmpty());
    assertEquals(false, aList.isEmpty());
  }

  @Test
  public void size() {
    assertTrue(aList.size() == 2);
    assertTrue(empty.size() == 0);
  }

  @Test
  public void contains() {
    assertTrue(aList.contains("A"));
  }

  @Test
  public void containsAll() {
    IListOfStrings otherList = LinkedListOfStrings.createEmpty();
    otherList.add("A");
    otherList.add("B");
    assertTrue(aList.containsAll(otherList));
  }

  @Test
  public void filterLargerThan() {
    IListOfStrings otherList = LinkedListOfStrings.createEmpty();
    otherList.add("DEF");
    aList.add("DEF");
    assertEquals(aList.filterLargerThan(1), otherList.filterLargerThan(1));
  }

  @Test
  public void hasDuplicates() {
    aList.add("A");
    assertTrue(aList.hasDuplicates());
  }

  @Test
  public void removeDuplicates() {
    aList.add("A");
    aList.add("B");
    aList.add("C");
    IListOfStrings otherList = LinkedListOfStrings.createEmpty();
    otherList.add("A");
    otherList.add("B");
    otherList.add("C");
    assertEquals(aList.removeDuplicates(), otherList);
  }

  @Test
  public void testEquals() {
    assertTrue(empty.equals(empty));
    assertFalse(empty.equals(aList));
    assertFalse(empty.equals(null));
    assertFalse(empty.equals(""));
  }

  @Test
  public void testHashcode() {
    assertTrue(empty.hashCode() == LinkedListOfStrings.createEmpty().hashCode());
  }

}