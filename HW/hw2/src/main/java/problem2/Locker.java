package problem2;

/**
 * A Locker class represent a package locker with concrete width,
 * height, depth and the mail item it stored.
 */
public class Locker {
  private Integer maxWidth;
  private Integer maxHeight;
  private Integer maxDepth;
  private MailItem mail;
  private static Integer minLenght = 1;

  /**
   * Constructor for the Recipient class.
   *
   * @param maxWidth  A maximum width in inches, an integer greater than or equal to 1.
   * @param maxHeight A maximum height in inches, an integer greater than or equal to 1.
   * @param maxDepth  A maximum depth in inches, an integer greater than or equal to 1.
   */
  public Locker(Integer maxWidth, Integer maxHeight, Integer maxDepth) {
    this.checkDimension(maxWidth);
    this.maxWidth = maxWidth;
    this.checkDimension(maxHeight);
    this.maxHeight = maxHeight;
    this.checkDimension(maxDepth);
    this.maxDepth =  maxDepth;
    this.mail = null;
  }

  /**
   * Return the max width of this Lock
   * @return the max width of this Lock
   */
  public Integer getMaxWidth() {
    return this.maxWidth;
  }

  /**
   * Return the max height of this Lock
   * @return the max height of this Lock
   */
  public Integer getMaxHeight() {
    return this.maxHeight;
  }

  /**
   * Return the max depth of this Lock
   * @return the max depth of this Lock
   */
  public Integer getMaxDepth() {
    return this.maxDepth;
  }

  /**
   * Return the  mail of this Lock
   * @return the mail of this Lock
   */
  public MailItem getMail() {
    return this.mail;
  }

  /**
   * check if the dimensions are less than min length 1, if not
   * throw exception
   * @param len the max width of this Lock
   */
  private void checkDimension(Integer len){
    if (len < minLenght)
      throw new IllegalArgumentException("Dimension must greater or equal to 1");
  }

  /**
   * Set mail to the locker
   * @param mail the mail item stores in the locker.
   */
  public void setMail(MailItem mail) {
    this.mail = mail;
  }

  /**
   * Return true if the mail dimension is smaller than blocker dimension,
   * false otherwise.
   * @param mail the mail item stores in the locker.
   * @return true if the mail dimension is smaller than blocker dimension,
   * false otherwise.
   */
  private boolean isValidDimensions(MailItem mail) {
    return mail.getDepth() <= this.maxDepth && mail.getWidth() <= this.maxWidth &&
        mail.getHeight() <= this.maxHeight;
  }

  /**
   * Return true if the recipient is match, false otherwise
   * @param recipient A recipient of this mail.
   * @return true if the recipient is match, false otherwise
   */
  private boolean isValidRecipient(Recipient recipient) {
    return recipient.equals(this.mail.getRecipient());
  }

  /**
   * add Mail to a locker, fail if the locker is occupied (it already
   * contains a mail item) or the mail item exceeds the dimensions of the locker
   * @param mail the mail item stores in the locker.
   * @throws LockerOccupiedException locker has been occupied with other mail
   * @throws InvalidDimensionException mail dimension is larger than locker
   */
  public void addMail(MailItem mail) throws LockerOccupiedException, InvalidDimensionException {
    if (this.getMail() != null)
      throw new LockerOccupiedException();
    if (!this.isValidDimensions(mail))
      throw new InvalidDimensionException();
    this.setMail(mail);
  }

  /**
   * pick up Mail from locker, remove and return the mail item from the locker
   * @param recipient A recipient of this mail.
   * @return a mail stores in the locker
   * @throws LockerEmptyException the locker is empty
   * @throws RecipientNotMatchException the recipient is not match
   */
  public MailItem pickupMail(Recipient recipient)
      throws LockerEmptyException, RecipientNotMatchException {
    if (this.getMail() == null)
      throw new LockerEmptyException();
    if (!this.isValidRecipient(recipient))
      throw new RecipientNotMatchException();
    MailItem tmpMail = this.getMail();
    this.setMail(null);
    return tmpMail;
  }
}
