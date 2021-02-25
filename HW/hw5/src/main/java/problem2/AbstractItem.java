package problem2;

import java.util.Objects;

public abstract class AbstractItem {
  private Creator creator;
  private String itemTitle;
  private Integer releasedYear;

  /**
   * Constructor for the AbstractItem Class
   * @param creator the creator of the item
   * @param itemTitle the title of the item
   * @param releasedYear the released year of the item
   */
  public AbstractItem(Creator creator, String itemTitle, Integer releasedYear) {
    this.creator = creator;
    this.itemTitle = itemTitle;
    this.releasedYear = releasedYear;
  }

  /**
   * Get the creator of the item
   * @return the creator of the item
   */
  public Creator getCreator() {
    return this.creator;
  }

  /**
   * Get the title of the item
   * @return the title of the Item
   */
  public String getItemTitle() {
    return this.itemTitle;
  }

  /**
   * Get the released year of the item
   * @return the released year of the item
   */
  public Integer getReleasedYear() {
    return this.releasedYear;
  }


  @Override
  public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      AbstractItem that = (AbstractItem) o;
      return Objects.equals(getCreator(), that.getCreator()) &&
          Objects.equals(getItemTitle(), that.getItemTitle()) &&
          Objects.equals(getReleasedYear(), that.getReleasedYear());
  }

  @Override
  public int hashCode() {
    return  Objects.hash(getCreator(), getItemTitle(), getReleasedYear());
  }
}
