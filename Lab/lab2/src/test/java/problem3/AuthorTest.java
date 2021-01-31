package problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AuthorTest {
  private Author emily;

  @Before
  public void setUp() throws Exception {
    emily = new Author("emily brunt", "e.brunt@gmail.com", "No.10086");
  }

  @Test
  public void getName() {
    assertEquals(emily.getName(), "emily brunt");
  }

  @Test
  public void getEmail() {
    assertEquals(emily.getEmail(), "e.brunt@gmail.com");
  }

  @Test
  public void getAddress() {
    assertEquals(emily.getAddress(),"No.10086");
  }
}