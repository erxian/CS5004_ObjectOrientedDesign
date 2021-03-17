package finalExam.p2;

/**
 * The interface Employee management system.
 */
public interface IEmployeeManagementSystem {

  /**
   * check if the EmployeeManagementSystem is empty.
   *
   * @return the boolean
   */
  Boolean isEmpty();

  /**
   * Count the number of Employees in the EmployeeManagementSystem.
   *
   * @return the number of Employees
   */
  Integer count();

  /**
   * Add an Employee to the EmployeeManagementSystem.
   *
   * @param employee the employee
   */
  void add(Employee employee);

  /**
   * Remove  a specified Employee from the EmployeeManagementSystem.
   *
   * @param employee the employee
   */
  void remove(Employee employee);

  /**
   * Check for a specified Employee in the EmployeeManagementSystem.
   *
   * @param employee the employee
   * @return the boolean
   */
  boolean contains(Employee employee);

  /**
   * Find and return all Employees from the EmployeeManagementSystem who
   * joined the company in a year specified as an input argument.
   *
   * @param year the year
   * @return the subset of EmployeeManagementSystem
   */
  IEmployeeManagementSystem findByJoinedYear(Integer year);

  /**
   * Find and return all Employees from the EmployeeManagementSystem who
   * earn more than $100000 per year
   *
   * @return the subset of EmployeeManagementSystem
   */
  IEmployeeManagementSystem findBySalary();

  /**
   * Find and return all Employees from the EmployeeManagementSystem who
   * have been promoted in a year specified as an input argument.
   *
   * @param year the year
   * @return the subset of EmployeeManagementSystem
   */
  IEmployeeManagementSystem findByPromotedYear(Integer year);

  /**
   * Get an Employee from the EmployeeManagementSystem based upon the Employee’s
   * unique identifier, employeeID
   *
   * @param employeeID the employee id
   */
  Employee findByEmployeeID(String employeeID) throws InvalidEmployeeIDException;
}
