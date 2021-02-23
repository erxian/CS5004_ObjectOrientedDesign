package problem1;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import org.junit.Before;
import org.junit.Test;

public class NonProfitTest {
  private NonProfit redCross;

  @Before
  public void setUp() throws Exception {
    redCross = new NonProfit("International Committee of the Red Cross");
  }


  @Test
  public void getOrganization() {
    assertEquals("International Committee of the Red Cross", redCross.getOrganization());
  }

  @Test
  public void getDonations() {
    assertTrue(redCross.getDonations().isEmpty());
    Donations oneTime = new OneTimeDonations(100,
        LocalDateTime.of(2020, 12, 16, 7, 45));
    redCross.addDonations(oneTime);
    assertFalse(redCross.getDonations().isEmpty());
  }

  @Test
  public void getTotalDonationsForYear() {
    assertTrue(redCross.getDonations().isEmpty());
    Donations oneTime = new OneTimeDonations(100,
        LocalDateTime.of(2020, 12, 16, 7, 45));
    Donations saveWildAnimal = new MonthlyDonations(20,
        LocalDateTime.of(2020, 3, 15, 8, 0));
    Donations inherit = new Pledges(5000,
        LocalDateTime.of(2020, 7, 23, 9, 30));
    redCross.addDonations(oneTime);
    redCross.addDonations(saveWildAnimal);
    redCross.addDonations(inherit);
    assertEquals(300, redCross.getTotalDonationsForYear(2020), 0);
  }
}