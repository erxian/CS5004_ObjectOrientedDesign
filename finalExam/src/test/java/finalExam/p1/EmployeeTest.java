package finalExam.p1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
  private Employee employee;
  private ContactInfo contactInfo;
  private Name name;

  @Before
  public void setUp() throws Exception {
    name = new Name("peter", "li");
    contactInfo = new ContactInfo(name, "building N0.8", "10086",
        "perter.li@gmail.com");
    employee = new Employee("001", contactInfo, 82500.50, 9000.00,
        3600.00, 9000.00, 5000.00, 2500.00,
        2000.00, 500.00);
  }

  @Test
  public void checkStudentDiscount() {
    assertEquals(0.0, employee.checkStudentDiscount(), 0.0);
  }

  @Test
  public void calculateTaxableIncome() {
    assertEquals(67350.5, employee.calculateTaxableIncome(), 0.0);
  }

  @Test
  public void calculateTax() {
    assertEquals(12796.595, employee.calculateTax(), 0.0);
  }

  @Test
  public void checkMortgageDiscount() {
    assertEquals(2500.0, employee.checkMortgageDiscount(), 0.0);
  }
}