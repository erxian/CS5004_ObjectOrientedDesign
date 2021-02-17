package problem1;

import java.util.Objects;

public class CourseCatalog implements ICourseCatalog {
  private Node head;
  private int numNodes;

  /**
   * Default head is null, default node number is 0.
   */
  public CourseCatalog() {
    this.head = null;
    this.numNodes = 0;
  }

  /**
   * Creates an empty CourseCatalog.
   * @return An empty CourseCatalog.
   */
  public static CourseCatalog createEmpty() {
    return new CourseCatalog();
  }

  /**
   * Adds a Course to the end of the CourseCatalog.
   *
   * @param course the course to append.
   */
  @Override
  public void append(Course course) {
    Node newNode = new Node(course, null);
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
   * Removes a specified Course from the CourseCatalog.
   *
   * @param course the course to remove.
   * @throws CourseNotFoundException Throw a CourseNotFoundException if the Course not exist.
   */
  @Override
  public void remove(Course course) throws CourseNotFoundException {
    if (!this.contains(course))
      throw new CourseNotFoundException("Course Not Found");
    Node currNode = this.head;
    Node preNode = currNode;
    //int i = 0;
    while (!currNode.getCourse().equals(course)) {
      //i++;
      preNode = currNode;
      currNode = currNode.getNextNode();
    }
    preNode.setNextNode(currNode.getNextNode());
    this.numNodes--;
  }

  /**
   * Checks if the specified course exists in the CourseCatalog.
   *
   * @param course the course to check.
   * @return True if the catalog contains this course, false otherwise.
   */
  @Override
  public boolean contains(Course course) {
    Node currNode = this.head;
    while (currNode != null) {
      if (currNode.getCourse().equals(course)) {
        return true;
      }
      currNode = currNode.getNextNode();
    }
    return false;
  }

  /**
   * Returns the index of the specified Course in the CourseCatalog, if it exists. If the Course not
   * exist, returns -1.
   *
   * @param course the course wait to find index.
   * @return the index of the specified Course in the CourseCatalog, if it exists. If the Course not
   * exist, returns -1.
   */
  @Override
  public int indexOf(Course course) {
    Node currNode = this.head;
    int i = 0;
    while (currNode != null) {
      if (currNode.getCourse().equals(course)) {
        return i;
      }
      i++;
      currNode = currNode.getNextNode();
    }
    return -1;
  }

  /**
   * Gets the number of Courses in the CourseCatalog.
   *
   * @return the number of Courses in the CourseCatalog.
   */
  @Override
  public int count() {
    return this.numNodes;
  }

  /**
   * Returns the Course at the given index in the CourseCatalog.
   *
   * @param index the index of course
   * @return the Course at the given index in the CourseCatalog.
   */
  @Override
  public Course get(int index) throws InvalidIndexException {
    this.checkBounds(index);
    Node currNode = this.head;
    int i = 0;
    while (i < index) {
      i++;
      currNode = currNode.getNextNode();
    }
    return currNode.getCourse();
  }


  /**
   * Helper method used by get and insert. Checks if the provided index is in bounds.
   * @param index The index to use.
   * @throws InvalidIndexException if index is out of bounds, throw the exception.
   */
  private void checkBounds(int index) throws InvalidIndexException {
    if (index >= this.numNodes || index < 0)
      throw new InvalidIndexException("index less than 0 or exceed current node number");
  }

  /**
   * Checks if the CourseCatalog is empty.
   *
   * @return True if the CourseCatalog is empty, false otherwise.
   */
  @Override
  public boolean isEmpty() {
    return this.numNodes == 0;
  }

  /**
   * Check if two CourseCatalog object is equal
   * @param o the CourseCatalog object waits to compare
   * @return true if equal, false otherwise.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CourseCatalog that = (CourseCatalog) o;
    return numNodes == that.numNodes &&
        Objects.equals(head, that.head);
  }
  /**
   * Check if two CourseCatalog object has same hashCode
   * @return true if has, false otherwise.
   */
  @Override
  public int hashCode() {
    return Objects.hash(head, numNodes);
  }

  /**
   * Return the CourseCatalog details.
   * @return the CourseCatalog details.
   */
  @Override
  public String toString() {
    return "CourseCatalog{" +
        "head=" + head.toString() +
        ", numNodes=" + numNodes +
        '}';
  }
}
