package problem1;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import org.junit.Before;
import org.junit.Test;

public class PledgesTest {
  private Pledges inherit;
  private Pledges inheritDad;

  @Before
  public void setUp() throws Exception {
    inherit = new Pledges(5000,
        LocalDateTime.of(2020, 3, 15, 8, 0));

    inheritDad = new Pledges(3000,
        LocalDateTime.of(2020, 3, 15, 8, 0),
        LocalDateTime.of(2023, 5, 20, 8, 0));
  }

  @Test (expected = IllegalArgumentException.class)
  public void anotherSetUp() throws Exception {
    Pledges inheritMom = new Pledges(3000,
        LocalDateTime.of(2020, 3, 15, 8, 0),
        LocalDateTime.of(2019, 5, 20, 8, 0));
  }


  @Test
  public void getProcessingDate() {
    assertEquals(null, inherit.getProcessingDate());
  }

  @Test
  public void setProcessingDate() {
    inherit.setProcessingDate(LocalDateTime.of(2023, 5, 20, 8, 0));
    assertEquals(LocalDateTime.of(2023, 5, 20, 8, 0),
        inherit.getProcessingDate());
  }

  @Test (expected = IllegalArgumentException.class)
  public void setIllegalProcessingDate() {
    inherit.setProcessingDate(LocalDateTime.of(2008, 2, 15, 8, 1));
  }

  @Test
  public void getYearAmount() {
    assertEquals(0, inherit.getYearAmount(2021));
    inherit.setProcessingDate(LocalDateTime.of(2023, 5, 20, 8, 0));
    assertEquals(0, inherit.getYearAmount(2022));
    assertEquals(5000, inherit.getYearAmount(2023));
  }

  @Test
  public void testEquals() {
    Pledges some = new Pledges(3000,
        LocalDateTime.of(2020, 3, 15, 8, 0));
    assertTrue(inherit.equals(inherit));
    assertFalse(inherit.equals(some));
    assertFalse(inherit.equals(null));
    assertFalse(inherit.equals(""));
  }

  @Test
  public void testCancelNotEquals() {
    Pledges some = new Pledges(5000,
        LocalDateTime.of(2020, 3, 15, 8, 0));
    some.setProcessingDate(LocalDateTime.of(2024, 3, 15, 8, 0));
    inherit.setProcessingDate(LocalDateTime.of(2024, 3, 15, 8, 0));
    assertTrue(inherit.equals(some));
  }

  @Test
  public void testHashcode() {
    Pledges copy = new Pledges(5000,
        LocalDateTime.of(2020, 3, 15, 8, 0));
    assertTrue(inherit.hashCode() == copy.hashCode());
  }

  @Test
  public void testToString() {
    inherit.setProcessingDate(LocalDateTime.of(2024, 3, 15, 8, 0));
    String expected = "Donations{Amount='5000', createDate='2020-03-15T08:00', processingDate='2024-03-15T08:00'}";
    assertEquals(expected, inherit.toString());
  }

}