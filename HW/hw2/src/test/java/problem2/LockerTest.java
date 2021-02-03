package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LockerTest {
  private Locker awsHub;
  private Recipient lily;
  private MailItem book;

  @Before
  public void setUp() throws Exception {
    awsHub = new Locker(30, 30, 30);
    lily = new Recipient("lily","wang", "lily.wang@gmail.com");
    book = new MailItem(25, 15, 20, lily);
  }


  @Test (expected = IllegalArgumentException.class)
  public void invalidSetUp() throws IllegalArgumentException {
    Locker locker1 = new Locker(-10, 10, 10);
  }

  @Test
  public void getMaxWidth() {
    assertEquals(30, awsHub.getMaxWidth(), 0);
  }

  @Test
  public void getMaxHeight() {
    assertEquals(30, awsHub.getMaxHeight(), 0);
  }

  @Test
  public void getMaxDepth() {
    assertEquals(30, awsHub.getMaxDepth(), 0);
  }

  @Test
  public void getMail() {
    assertEquals(null, awsHub.getMail());
  }

  @Test (expected = LockerEmptyException.class)
  public void pickupEmptyMail() throws RecipientNotMatchException, LockerEmptyException {
    assertEquals(null, awsHub.pickupMail(lily));
  }

  @Test (expected = InvalidDimensionException.class)
  public void invalidWidthDimension() throws LockerOccupiedException, InvalidDimensionException {
    Recipient tom = new Recipient("tom","xu", "tom.xu@gmail.com");
    MailItem laptop = new MailItem(40, 20, 20, tom);
    awsHub.addMail(laptop);
    assertEquals(null, awsHub.getMail());
  }

  @Test (expected = InvalidDimensionException.class)
  public void invalidHeightDimension() throws LockerOccupiedException, InvalidDimensionException {
    Recipient tom = new Recipient("tom","xu", "tom.xu@gmail.com");
    MailItem laptop = new MailItem(20, 45, 20, tom);
    awsHub.addMail(laptop);
    assertEquals(null, awsHub.getMail());
  }

  @Test (expected = InvalidDimensionException.class)
  public void invalidDepthDimension() throws LockerOccupiedException, InvalidDimensionException {
    Recipient tom = new Recipient("tom","xu", "tom.xu@gmail.com");
    MailItem laptop = new MailItem(20, 20, 50, tom);
    awsHub.addMail(laptop);
    assertEquals(null, awsHub.getMail());
  }

  @Test
  public void testAddMail() throws LockerOccupiedException, InvalidDimensionException {
    awsHub.addMail(book);
    assertEquals(book, awsHub.getMail());
  }

  @Test (expected = LockerOccupiedException.class)
  public void lockerOccupied() throws LockerOccupiedException, InvalidDimensionException {
    awsHub.addMail(book);
    awsHub.addMail(book);
  }

  @Test (expected = RecipientNotMatchException.class)
  public void recipientNotMatch()
      throws RecipientNotMatchException, LockerEmptyException,
      LockerOccupiedException, InvalidDimensionException {
    Recipient tom = new Recipient("tom","xu", "tom.xu@gmail.com");
    awsHub.addMail(book);
    awsHub.pickupMail(tom);
  }

  @Test
  public void pickupMail()
      throws RecipientNotMatchException, LockerEmptyException,
      LockerOccupiedException, InvalidDimensionException {
    awsHub.addMail(book);
    assertEquals(book, awsHub.pickupMail(lily));
    assertEquals(null, awsHub.getMail());
  }
}