package finalExam.p1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SelfEmployeedFilerTest {
  private SelfEmployeedFiler selfEmployee;
  private ContactInfo contactInfo;
  private Name name;

  @Before
  public void setUp() throws Exception {
    name = new Name("chris", "wu");
    contactInfo = new ContactInfo(name, "building N0.10", "10010",
        "chris.wu@gmail.com");
    selfEmployee = new SelfEmployeedFiler("001", contactInfo, 60000.00,
        4000.00, 1600.00, 5000.00, 2500.00,
        500.00, 2000.00, 50.00, 1200.00,
        2000.00, 980.00, 680.00);
  }

  @Test
  public void checkStudentDiscount() {
    assertEquals(0.0, selfEmployee.checkStudentDiscount(), 0.0);
  }

  @Test
  public void calculateTaxableIncome() {
    assertEquals(54200.0, selfEmployee.calculateTaxableIncome(), 0.0);
  }

  @Test
  public void checkMortgageDiscount() {
    assertEquals(0.0, selfEmployee.checkMortgageDiscount(), 0.0);
  }

  @Test
  public void calculateTax() {
    assertEquals(8130.0, selfEmployee.calculateTax(), 0.0);
  }
}