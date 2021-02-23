package problem1;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import org.junit.Before;
import org.junit.Test;

public class MonthlyDonationsTest {
  private MonthlyDonations saveWildAnimal;

  @Before
  public void setUp() throws Exception {
    saveWildAnimal = new MonthlyDonations(20,
        LocalDateTime.of(2020, 3, 15, 8, 0));
  }

  @Test
  public void getCancelDate() {
    assertEquals(null, saveWildAnimal.getCancelDate());
  }

  @Test
  public void setCancelDate() {
    saveWildAnimal.setCancelDate(LocalDateTime.of(2020, 8, 15, 8, 1));
    assertEquals(LocalDateTime.of(2020, 8, 15, 8, 1), saveWildAnimal.getCancelDate());
  }

  @Test (expected = IllegalArgumentException.class)
  public void setIllegalCancelDate() {
    saveWildAnimal.setCancelDate(LocalDateTime.of(2020, 2, 15, 8, 1));
  }

  @Test
  public void getYearAmountWithoutCancel() {
    assertEquals(0, saveWildAnimal.getYearAmount(2019), 0);
    assertEquals(200, saveWildAnimal.getYearAmount(2020), 0);
    assertEquals(240, saveWildAnimal.getYearAmount(2021), 0);
  }


  @Test
  public void getYearAmountWithCancelCase1() {
    saveWildAnimal.setCancelDate(LocalDateTime.of(2021, 2, 15, 8, 1));
    assertEquals(40, saveWildAnimal.getYearAmount(2021), 0);
  }

  @Test
  public void getYearAmountWithCancelCase2() {
    saveWildAnimal.setCancelDate(LocalDateTime.of(2020, 6, 15, 8, 1));
    assertEquals(80, saveWildAnimal.getYearAmount(2020), 0);
  }

  @Test
  public void getYearAmountWithCancelCase3() {
    saveWildAnimal.setCancelDate(LocalDateTime.of(2021, 5, 15, 8, 1));
    assertEquals(200, saveWildAnimal.getYearAmount(2020), 0);
  }

  @Test
  public void getYearAmountWithCancelCase4() {
    saveWildAnimal.setCancelDate(LocalDateTime.of(2022, 3, 15, 8, 1));
    assertEquals(240, saveWildAnimal.getYearAmount(2021), 0);
  }

  @Test
  public void getYearAmountWithCancelCase5() {
    saveWildAnimal.setCancelDate(LocalDateTime.of(2022, 3, 15, 8, 1));
    assertEquals(0, saveWildAnimal.getYearAmount(2024), 0);
  }

  @Test
  public void getYearAmountWithCancelCase6() {
    saveWildAnimal.setCancelDate(LocalDateTime.of(2022, 3, 15, 8, 1));
    assertEquals(0, saveWildAnimal.getYearAmount(2019), 0);
  }

  @Test
  public void testEquals() {
    MonthlyDonations some = new MonthlyDonations(30,
        LocalDateTime.of(2021, 3, 15, 8, 0));
    assertTrue(saveWildAnimal.equals(saveWildAnimal));
    assertFalse(saveWildAnimal.equals(some));
    assertFalse(saveWildAnimal.equals(null));
    assertFalse(saveWildAnimal.equals(""));
  }

  @Test
  public void testCancelNotEquals() {
    MonthlyDonations some = new MonthlyDonations(20,
        LocalDateTime.of(2020, 3, 15, 8, 0));
    some.setCancelDate(LocalDateTime.of(2024, 3, 15, 8, 0));
    saveWildAnimal.setCancelDate(LocalDateTime.of(2024, 3, 15, 8, 0));
    assertTrue(saveWildAnimal.equals(some));
  }

  @Test
  public void testHashcode() {
    MonthlyDonations copy = new MonthlyDonations(20,
        LocalDateTime.of(2020, 3, 15, 8, 0));
    assertTrue(saveWildAnimal.hashCode() == copy.hashCode());
  }

  @Test
  public void testToString() {
    saveWildAnimal.setCancelDate(LocalDateTime.of(2024, 7, 25, 10, 30));
    String expected = "Donations{MonthlyAmount='20', createTime='2020-03-15T08:00', cancelTime='2024-07-25T10:30'}";
    assertEquals(expected, saveWildAnimal.toString());
  }

}