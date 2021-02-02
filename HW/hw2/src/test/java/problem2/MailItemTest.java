package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MailItemTest {
  private MailItem dhlMail;

  @Before
  public void setUp() throws Exception {
    dhlMail = new MailItem(25, 15, 20,
        new Recipient("lily","wang", "lily.wang@gmail.com"));
  }

  @Test (expected = IllegalArgumentException.class)
  public void invalidSetUp() throws IllegalArgumentException {
    MailItem mail1 = new MailItem(-10, 15, 20,
        new Recipient("lily","wang", "lily.wang@gmail.com"));
    MailItem mail2 = new MailItem(10, -10, 20,
        new Recipient("lily","wang", "lily.wang@gmail.com"));
    MailItem mail3 = new MailItem(10, 10, -20,
        new Recipient("lily","wang", "lily.wang@gmail.com"));
  }

  @Test
  public void getWidth() {
    assertEquals(25, dhlMail.getWidth(), 0);
  }

  @Test
  public void getHeight() {
    assertEquals(15, dhlMail.getHeight(), 0);
  }

  @Test
  public void getDepth() {
    assertEquals(20, dhlMail.getDepth(), 0);
  }

  @Test
  public void getRecipient() {
    assertTrue(new Recipient(
        "lily","wang", "lily.wang@gmail.com"
    ).equals(dhlMail.getRecipient()));

    assertFalse(dhlMail.getRecipient().equals(null));
  }
}