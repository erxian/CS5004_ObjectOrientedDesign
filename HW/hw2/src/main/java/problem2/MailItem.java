package problem2;

/**
 * A MailItem class represent a mail with specific width, height
 * and depth, and it's recipient.
 */
public class MailItem {
  private Integer width;
  private Integer height;
  private Integer depth;
  private Recipient recipient;
  private static Integer minLenght = 1;

  /**
   * Constructor for the MailItem class.
   *
   * @param width     A width in inches, an integer greater than or equal to 1.
   * @param height    A height in inches, an integer greater than or equal to 1.
   * @param depth     A depth in inches, an integer greater than or equal to 1.
   * @param recipient A recipient of this mail.
   */
  public MailItem(Integer width, Integer height, Integer depth, Recipient recipient) {
    this.checkDimension(width);
    this.width = width;
    this.checkDimension(height);
    this.height = height;
    this.checkDimension(depth);
    this.depth = depth;
    this.recipient = recipient;
  }

  /**
   * Gets the width of a mail item
   * @return the width of a mail item
   */
  public Integer getWidth() {
    return this.width;
  }

  /**
   * Gets the height of a mail item
   * @return the height of a mail item
   */
  public Integer getHeight() {
    return this.height;
  }

  /**
   * Gets the depth of a mail item
   * @return the depth of a mail item
   */
  public Integer getDepth() {
    return this.depth;
  }

  /**
   * Gets the recipient of a mail item
   * @return the recipient of a mail item
   */
  public Recipient getRecipient() {
    return this.recipient;
  }

  /**
   * check if the dimension is greater or equal to 1, false throw exception
   * @param len the width of a mail item
   */
  private void checkDimension(Integer len){
    if (len < minLenght)
      throw new IllegalArgumentException("Dimension must greater or equal to 1");
  }
}
