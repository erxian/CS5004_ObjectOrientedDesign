package problem1;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import org.junit.Before;
import org.junit.Test;

public class OneTimeDonationsTest {
  private OneTimeDonations earthShake;

  @Before
  public void setUp() throws Exception {
    earthShake = new OneTimeDonations(100,
        LocalDateTime.of(2020, 12, 16, 7, 45));
  }

  @Test
  public void getYearAmount() {
    assertEquals(100, earthShake.getYearAmount(2020), 0);
    assertEquals(0, earthShake.getYearAmount(2018), 0);
  }

  @Test
  public void testEquals() {
    OneTimeDonations some = new OneTimeDonations(30,
        LocalDateTime.of(2018, 10, 1, 9, 30));
    assertTrue(earthShake.equals(earthShake));
    assertFalse(earthShake.equals(some));
    assertFalse(earthShake.equals(null));
    assertFalse(earthShake.equals(""));
  }

  @Test
  public void testAmountNotEquals() {
    OneTimeDonations some = new OneTimeDonations(30,
        LocalDateTime.of(2020, 12, 16, 7, 45));
    assertFalse(earthShake.equals(some));
  }

  @Test
  public void testDateYearNotEquals() {
    OneTimeDonations some = new OneTimeDonations(100,
        LocalDateTime.of(2021, 12, 16, 7, 45));
    assertFalse(earthShake.equals(some));
  }

  @Test
  public void testDateMonthNotEquals() {
    OneTimeDonations some = new OneTimeDonations(100,
        LocalDateTime.of(2020, 7, 16, 7, 45));
    assertFalse(earthShake.equals(some));
  }

  public void testDateDayNotEquals() {
    OneTimeDonations some = new OneTimeDonations(100,
        LocalDateTime.of(2020, 12, 8, 7, 45));
    assertFalse(earthShake.equals(some));
  }

  @Test
  public void testDateHourNotEquals() {
    OneTimeDonations some = new OneTimeDonations(100,
        LocalDateTime.of(2020, 12, 16, 15, 45));
    assertFalse(earthShake.equals(some));
  }

  @Test
  public void testDateMinuteNotEquals() {
    OneTimeDonations some = new OneTimeDonations(100,
        LocalDateTime.of(2020, 12, 16, 7, 10));
    assertFalse(earthShake.equals(some));
  }

  @Test
  public void testHashcode() {
    OneTimeDonations copy = new OneTimeDonations(100,
        LocalDateTime.of(2020, 12, 16, 7, 45));
    assertTrue(earthShake.hashCode() == copy.hashCode());
  }

  @Test
  public void testToString() {
    String expected = "Donations{amount='100', donateTime='2020-12-16T07:45'}";
    assertEquals(expected, earthShake.toString());
  }
}