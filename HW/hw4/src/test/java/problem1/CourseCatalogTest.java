package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CourseCatalogTest {
  CourseCatalog empty;
  CourseCatalog aCatalog;

  @Before
  public void setUp() throws Exception {
    empty = CourseCatalog.createEmpty();
    aCatalog = CourseCatalog.createEmpty();
    aCatalog.append(new Course("Algorithm", "CS", 5008));
    aCatalog.append(new Course("OOD", "CS", 5004));
  }

  @Test
  public void append() {
    aCatalog.append(new Course("Python", "CS", 5001));
    CourseCatalog copy = new CourseCatalog();
    copy.append(new Course("Algorithm", "CS", 5008));
    copy.append(new Course("OOD", "CS", 5004));
    copy.append(new Course("Python", "CS", 5001));
    assertEquals(aCatalog.toString(), copy.toString());
    assertTrue(aCatalog.equals(copy));
  }

  @Test
  public void count() {
    assertTrue(aCatalog.count() == 2);
    assertTrue(empty.count() == 0);
  }

  @Test
  public void isEmpty() {
    assertTrue(empty.isEmpty());
    assertFalse(aCatalog.isEmpty());
  }

  @Test
  public void indexOf() {
    Course course = new Course("OOD", "CS", 5004);
    aCatalog.append(new Course("Python", "CS", 5001));
    assertEquals(1, aCatalog.indexOf(course));
    assertEquals(-1, aCatalog.indexOf(null));
  }

  @Test
  public void remove() throws CourseNotFoundException {
    Course cs5002 = new Course("Math", "CS", 5002);
    Course cs5001 = new Course("Python", "CS", 5001);
    aCatalog.append(new Course("Math", "CS", 5002));
    aCatalog.append(new Course("Python", "CS", 5001));
    aCatalog.remove(cs5002);
    assertEquals(3, aCatalog.count());
    assertEquals(2, aCatalog.indexOf(cs5001));
  }

  @Test (expected = CourseNotFoundException.class)
  public void removeFail() throws CourseNotFoundException {
    Course cs5002 = new Course("Math", "CS", 5002);
    aCatalog.remove(cs5002);
  }


  @Test
  public void contains() {
    Course cs5008 = new Course("Algorithm", "CS", 5008);
    Course cs5002 = new Course("Math", "CS", 5002);
    assertTrue(aCatalog.contains(cs5008));
    assertFalse(aCatalog.contains(cs5002));
  }

  @Test
  public void get() throws InvalidIndexException {
    Course cs5008 = new Course("Algorithm", "CS", 5008);
    Course cs5004 = new Course("OOD", "CS", 5004);
    assertTrue(aCatalog.get(0).equals(cs5008));
    assertTrue(aCatalog.get(1).equals(cs5004));
  }

  @Test (expected = InvalidIndexException.class)
  public void getFailWithNegative() throws InvalidIndexException {
    aCatalog.get(-1);
  }

  @Test (expected = InvalidIndexException.class)
  public void getFailWithExceed() throws InvalidIndexException {
    aCatalog.get(5);
  }

  @Test
  public void testEquals() {
    assertTrue(empty.equals(empty));
    assertFalse(empty.equals(aCatalog));
    assertFalse(empty.equals(null));
    assertFalse(empty.equals(""));
  }

  @Test
  public void testHeadNotEquals() {
    CourseCatalog bCatalog = CourseCatalog.createEmpty();
    bCatalog.append(new Course("OOD", "CS", 5004));
    bCatalog.append(new Course("Algorithm", "CS", 5008));

    assertFalse(aCatalog.equals(bCatalog));
  }

  @Test
  public void testNumNotEquals() {
    CourseCatalog bCatalog = CourseCatalog.createEmpty();
    bCatalog.append(new Course("OOD", "CS", 5004));

    assertFalse(aCatalog.equals(bCatalog));
  }


  @Test
  public void testHashcode() {
    assertTrue(empty.hashCode() == CourseCatalog.createEmpty().hashCode());
  }

  @Test
  public void testToStrings() {
    String expected = "CourseCatalog{head=Node{courseCS5008: Algorithm', "
        + "nextNode=Node{courseCS5004: OOD', nextNode=null}}, numNodes=2}";
    assertEquals(expected, aCatalog.toString());
  }

}