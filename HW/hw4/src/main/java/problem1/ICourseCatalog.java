package problem1;

/**
 * A List represents an ordered, mutable collection of Course.
 */
public interface ICourseCatalog {

  /**
   * Adds a Course to the end of the CourseCatalog.
   * @param course the course to append.
   */
  void append(Course course);

  /**
   * Removes a specified Course from the CourseCatalog.
   * @param course the course to remove.
   * @throws CourseNotFoundException Throw a CourseNotFoundException if the Course not exist.
   *
   */
  void remove(Course course) throws CourseNotFoundException;

  /**
   * Checks if the specified course exists in the CourseCatalog.
   * @param course the course to check.
   * @return True if the catalog contains this course, false otherwise.
   */
  boolean contains(Course course);

  /**
   * Returns the index of the specified Course in the
   * CourseCatalog, if it exists. If the Course not exist, returns -1.
   * @param course the specified course
   * @return the index of the specified Course in the CourseCatalog, if it exists.
   * If the Course not exist, returns -1.
   */
  int indexOf(Course course);

  /**
   * Gets the number of Courses in the CourseCatalog.
   * @return the number of Courses in the CourseCatalog.
   */
  int count();

  /**
   * Returns the Course at the given index in the CourseCatalog.
   * @param index the index of course
   * @return the Course at the given index in the CourseCatalog.
   * @throws InvalidIndexException Throw a InvalidIndexException if
   * the index is out of range.
   */
  Course get(int index) throws InvalidIndexException;

  /**
   * Checks if the CourseCatalog is empty.
   * @return True if the CourseCatalog is empty, false otherwise.
   */
  boolean isEmpty();
}
