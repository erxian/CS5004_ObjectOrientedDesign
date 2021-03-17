package finalExam.p2;

import static org.junit.Assert.*;

import java.time.LocalDate;
import org.junit.Before;
import org.junit.Test;

public class EmployeeManagementSystemTest {
  private IEmployeeManagementSystem baidu;
  private Employee employee1;
  private Employee employee2;

  @Before
  public void setUp() throws Exception {
    employee1 = new Employee(new Name("peter", "", "zhang"),
        new ContactInfo("No.116", "NY", "US", "10085", "10086",
            "peter@gmail.com"), LocalDate.now(), "1001", 2016,
        "software engineer", 2019, 120000.0);

    employee2 = new Employee(new Name("chris", "", "wu"),
        new ContactInfo("No.112", "Boston", "US", "10086", "50024",
            "chris@gmail.com"), LocalDate.now(), "1066", 2017,
        "software engineer", 2020, 90000.0);

    baidu = IEmployeeManagementSystem.createEmpty();
  }

  @Test
  public void count() {
    assertEquals(0, baidu.count(), 0);
  }

  @Test
  public void add() {
    baidu.add(employee1);
    baidu.add(employee2);
    assertEquals(2, baidu.count(), 0);
  }


  @Test
  public void addDuplicates() {
    baidu.add(employee1);
    baidu.add(employee1);
    assertEquals(1, baidu.count(), 0);
  }

  @Test
  public void findByJoinedYear() {
    baidu.add(employee1);
    baidu.add(employee2);
    IEmployeeManagementSystem employees = baidu.findByJoinedYear(2017);
    assertEquals(1, employees.count(), 0);
  }

  @Test
  public void findByEmployeeID() throws InvalidEmployeeIDException {
    baidu.add(employee1);
    baidu.add(employee2);
    assertTrue(baidu.findByEmployeeID("1001").equals(employee1));
  }


  @Test (expected = InvalidEmployeeIDException.class)
  public void findByEmployeeIDFail() throws InvalidEmployeeIDException {
    baidu.add(employee1);
    baidu.add(employee2);
    assertTrue(baidu.findByEmployeeID("1002").equals(employee1));
  }
}