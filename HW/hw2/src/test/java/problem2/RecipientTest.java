package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RecipientTest {
  private Recipient lily;

  @Before
  public void setUp() throws Exception {
    lily =  new Recipient("lily","wang", "lily.wang@gmail.com");
  }

  @Test
  public void getFirstName() {
    assertEquals("lily", lily.getFirstName());
  }

  @Test
  public void getLastName() {
    assertEquals("wang", lily.getLastName());
  }

  @Test
  public void getAddress() {
    assertEquals("lily.wang@gmail.com", lily.getAddress());
  }
}