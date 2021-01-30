package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NameTest {
  private Name athlete;

  @Before
  public void setUp() throws Exception {
    athlete = new Name("peter", "L", "wang");
  }

  @Test
  public void getFirstName() {
    assertEquals("peter", athlete.getFirstName());
  }

  @Test
  public void getMiddleName() {
    assertEquals("L", athlete.getMiddleName());
  }

  @Test
  public void getLastName() {
    assertEquals("wang", athlete.getLastName());
  }
}