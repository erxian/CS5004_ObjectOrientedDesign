package finalExam.p2;

public class EmployeeManagementSystem implements IEmployeeManagementSystem {
  private Node head;
  private int numNodes;
  protected static final Double SALARY_BAR = 100000.0;

  /**
   * check if the EmployeeManagementSystem is empty.
   *
   * @return the boolean
   */
  @Override
  public Boolean isEmpty() {
    return this.numNodes == 0;
  }

  /**
   * Count the number of Employees in the EmployeeManagementSystem.
   *
   * @return the number of Employees
   */
  @Override
  public Integer count() {
    return this.numNodes;
  }

  /**
   * Add an Employee to the EmployeeManagementSystem.
   *
   * @param employee the employee
   */
  @Override
  public void add(Employee employee) {
    if (this.contains(employee)) {
      return;
    }
    Node newNode = new Node(employee, null);
    if (this.head == null)
      this.head = newNode;
    else {
      Node currNode = this.head;
      while (currNode.getNextNode() != null) {
        currNode = currNode.getNextNode();
      }
      currNode.setNextNode(newNode);
    }
    this.numNodes++;
  }

  /**
   * Remove  a specified Employee from the EmployeeManagementSystem.
   *
   * @param employee the employee
   */
  @Override
  public void remove(Employee employee) {
    if (!this.contains(employee)) {
      return;
    }
    if (this.head.getNextNode() == null) {
      this.head = null;
    } else {
      Node currNode = this.head;
      Node preNode = currNode;
      while (!currNode.getEmployee().equals(employee)) {
        preNode = currNode;
        currNode = currNode.getNextNode();
      }
      preNode.setNextNode(currNode.getNextNode());
    }
    this.numNodes--;
  }

  /**
   * Check for a specified Employee in the EmployeeManagementSystem.
   *
   * @param employee the employee
   * @return the boolean
   */
  @Override
  public boolean contains(Employee employee) {
    Node currNode = this.head;
    while (currNode != null) {
      if (currNode.getEmployee().equals(employee)) {
        return true;
      }
      currNode = currNode.getNextNode();
    }
    return false;
  }

  /**
   * Find and return all Employees from the EmployeeManagementSystem who joined the company in a
   * year specified as an input argument.
   *
   * @param year the year
   * @return the subset of EmployeeManagementSystem
   */
  @Override
  public IEmployeeManagementSystem findByJoinedYear(Integer year) {
    IEmployeeManagementSystem sublist = IEmployeeManagementSystem.createEmpty();
    Node currNode = this.head;
    while (currNode != null) {
      if (currNode.getEmployee().getYearJoinedCompany().equals(year)) {
        sublist.add(currNode.getEmployee());
      }
      currNode = currNode.getNextNode();
    }
    return sublist;
  }

  /**
   * Find and return all Employees from the EmployeeManagementSystem who earn more than $100000 per
   * year
   *
   * @return the subset of EmployeeManagementSystem
   */
  @Override
  public IEmployeeManagementSystem findBySalary() {
    IEmployeeManagementSystem sublist = IEmployeeManagementSystem.createEmpty();
    Node currNode = this.head;
    while (currNode != null) {
      if (currNode.getEmployee().getAnnualEarnings() >= SALARY_BAR) {
        sublist.add(currNode.getEmployee());
      }
      currNode = currNode.getNextNode();
    }
    return sublist;
  }

  /**
   * Find and return all Employees from the EmployeeManagementSystem who have been promoted in a
   * year specified as an input argument.
   *
   * @param year the year
   * @return the subset of EmployeeManagementSystem
   */
  @Override
  public IEmployeeManagementSystem findByPromotedYear(Integer year) {
    IEmployeeManagementSystem sublist = IEmployeeManagementSystem.createEmpty();
    Node currNode = this.head;
    while (currNode != null) {
      if (currNode.getEmployee().getYearLastPromoted().equals(year)) {
        sublist.add(currNode.getEmployee());
      }
      currNode = currNode.getNextNode();
    }
    return sublist;
  }

  /**
   * Get an Employee from the EmployeeManagementSystem based upon the Employee’s unique identifier,
   * employeeID
   *
   * @param employeeID the employee id
   * @return the employee
   */
  @Override
  public Employee findByEmployeeID(String employeeID) throws InvalidEmployeeIDException {
    Node currNode = this.head;
    Employee targetEmployee = null;

    while (currNode != null) {
      if (currNode.getEmployee().getEmployeeID().equals(employeeID)) {
        targetEmployee = currNode.getEmployee();
      }
      currNode = currNode.getNextNode();
    }

    if (targetEmployee == null) {
      throw new InvalidEmployeeIDException();
    }
    return targetEmployee;
  }
}
