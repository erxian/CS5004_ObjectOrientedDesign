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
  public void add() {
    Set bSet = aSet.add(9);
    assertTrue(aSet.contains(9));
    assertTrue(bSet.contains(9));
  }


  @Test
  public void addDuplicates() {
    aSet = aSet.add(15);
    assertEquals(3, aSet.size(), 0);
    aSet = aSet.add(15);
    assertEquals(3, aSet.size(), 0);
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
  public void removeHead() {
    Set bSet = aSet.remove(5);
    assertEquals(2, aSet.size(), 0);
    assertTrue(aSet.contains(5));

    assertEquals(1, bSet.size(), 0);
    assertFalse(bSet.contains(5));
  }

  @Test
  public void removeMiddleOrTail() {
    Set bSet = aSet.remove(10);
    assertEquals(2, aSet.size(), 0);
    assertTrue(aSet.contains(10));

    assertEquals(1, bSet.size(), 0);
    assertFalse(bSet.contains(10));
  }


  @Test
  public void removeNotContain() {
    aSet = aSet.remove(99);
    assertEquals(2, aSet.size(), 0);
  }

  @Test
  public void removeContain() {
    aSet = aSet.add(15);
    aSet = aSet.add(20);
    aSet = aSet.add(25);
    Set bSet = aSet.remove(15);
    assertEquals(5, aSet.size(), 0);
    assertFalse(aSet.contains(15));

    assertEquals(4, bSet.size(), 0);
    assertFalse(bSet.contains(15));
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
  public void testHeadNotEquals() {
    Set some = SetOfIntegers.emptySet();
    some = some.add(72);
    some = some.add(78);
    assertFalse(aSet.equals(some));
  }

  @Test
  public void testNumNotEquals() {
    Set some = SetOfIntegers.emptySet();
    some = some.add(5);
    assertFalse(aSet.equals(some));
  }

  @Test
  public void testAllEquals() {
    Set some = SetOfIntegers.emptySet();
    some = some.add(5);
    some = some.add(10);
    assertTrue(aSet.equals(some));
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