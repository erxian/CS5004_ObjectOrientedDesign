package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CourseTest {
  private Course cs5004;
  private Course cs5008;

  @Before
  public void setUp() throws Exception {
    cs5004 = new Course("OOD", "CS", 5004);
    cs5008 = new Course("Algorithm", "CS", 5008);
  }

  @Test
  public void testToString() {
    String expected = "CS5004: OOD";
    assertEquals(expected, cs5004.toString());
  }

  @Test
  public void testEquals() {
    assertTrue(cs5004.equals(cs5004));
    assertFalse(cs5004.equals(cs5008));
    assertFalse(cs5008.equals(null));
    assertFalse(cs5008.equals(""));
  }

  @Test
  public void testHashCode() {
    Course course = new Course("OOD", "CS", 5004);
    assertTrue(cs5004.hashCode() == course.hashCode());
  }
}