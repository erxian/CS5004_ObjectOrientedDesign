package problem2;

public class Book extends AbstractItem {

  /**
   * Constructor fo the Book Class
   * @param author the author of the Book
   * @param itemTitle the title of the Book
   * @param releasedYear the released year of the book.
   */
  public Book(Author author, String itemTitle, Integer releasedYear) {
    super(author, itemTitle, releasedYear);
  }

  /**
   * Get the creator of the Book
   *
   * @return the creator of the Book
   */
  @Override
  public Creator getCreator() {
    return super.getCreator();
  }

  /**
   * Get the title of the Book
   *
   * @return the title of the Book
   */
  @Override
  public String getItemTitle() {
    return super.getItemTitle();
  }

  /**
   * Get the released year of the Book
   *
   * @return the released year of the Book
   */
  @Override
  public Integer getReleasedYear() {
    return super.getReleasedYear();
  }

  @Override
  public boolean equals(Object o) {
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public String toString() {
    return "Book{" +
        "Author='" + super.getCreator() + '\'' + ", " +
        "Title='" + super.getItemTitle() + '\'' + ", " +
        "Released Year='" + super.getReleasedYear() +
        '}';
  }
}
