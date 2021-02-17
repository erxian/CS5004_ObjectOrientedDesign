package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SetOfIntegersTest {
  Set empty;
  Set aSet;

  @Before
  public void setUp() throws Exception {
    empty = SetOfIntegers.emptySet();
    aSet =  SetOfIntegers.emptySet();
    aSet = aSet.add(5);
    aSet = aSet.add(10);
  }


  @Test
  public void addDuplicates() {
    aSet = aSet.add(15);
    assertEquals(3, aSet.size(), 0);
    aSet = aSet.add(15);
    assertEquals(3, aSet.size(), 0);
  }


  @Test
  public void returnNewSet() {
    Set bSet = aSet.add(20);
    assertEquals(2, aSet.size(), 0);
    assertEquals(3, bSet.size(), 0);
  }

  @Test
  public void isEmpty() {
    assertTrue(empty.isEmpty());
    assertFalse(aSet.isEmpty());
  }

  @Test
  public void contains() {
    assertTrue(aSet.contains(5));
    assertFalse(empty.contains(5));
  }

  @Test
  public void remove() {
    aSet.remove(5);
    assertEquals(2, aSet.size(), 0);
    aSet = aSet.remove(99);
    assertEquals(2, aSet.size(), 0);
    aSet = aSet.add(15);
    aSet = aSet.remove(15);
    assertEquals(2, aSet.size(), 0);
    aSet = aSet.remove(5);
    assertEquals(1, aSet.size(), 0);
  }

  @Test
  public void size() {
    assertEquals(0, empty.size(), 0);
    assertEquals(2, aSet.size(), 0);
  }

  @Test
  public void testEquals() {
    assertTrue(empty.equals(empty));
    assertFalse(empty.equals(aSet));
    assertFalse(empty.equals(null));
    assertFalse(empty.equals(""));
  }

  @Test
  public void testNumNotEquals() {
    Set some = SetOfIntegers.emptySet();
    some = some.add(5);
    assertFalse(aSet.equals(some));
  }

  @Test
  public void testHeadEquals() {
    Set some = SetOfIntegers.emptySet();
    some = some.add(72);
    some = some.add(88);
    assertFalse(aSet.equals(some));
  }


  @Test
  public void testHashcode() {
    assertTrue(empty.hashCode() == SetOfIntegers.emptySet().hashCode());
  }

  @Test
  public void testToStrings() {
    String expected = "Set{head=Node{item='5', nextNode=Node{item='10', nextNode=null}}, numNodes=2}";
    assertEquals(expected, aSet.toString());
  }

}