package problem1;

import java.time.LocalDateTime;
import java.util.Objects;

public class Pledges extends Donations {
  private LocalDateTime processingDate;
  /**
   * @param amount     the donation amount.
   * @param donateTime the date and time that the donation was created.
   */
  public Pledges(Integer amount, LocalDateTime donateTime) {
    super(amount, donateTime);
    this.processingDate = null;
  }

  /**
   *
   * @param amount the donation amount.
   * @param donateTime the date and time that the donation was created.
   * @param processingDate the date and time the donation was made.
   */
  public Pledges(Integer amount, LocalDateTime donateTime, LocalDateTime processingDate) {
    super(amount, donateTime);
    if (processingDate.isBefore(this.getDonateTime())) {
      throw new IllegalArgumentException("processing date is not prior to the creation date and time");
    }
    this.processingDate = processingDate;
  }

  /**
   * Get the processing date of this pledge donation.
   * @return the processing date of this pledge donation.
   */
  public LocalDateTime getProcessingDate() {
    return this.processingDate;
  }

  /**
   * Set the processing date of this pledge donation.
   * @param processingDate the date the donation is actually processed
   */
  public void setProcessingDate(LocalDateTime processingDate) {
    if (processingDate.isBefore(this.getDonateTime())) {
      throw new IllegalArgumentException("processing date is not prior to the creation date and time");
    }
    this.processingDate = processingDate;
  }

  /**
   * Calculate the donated amount during one specific year.
   * @param year the calculate range year.
   * @return the donated amount during this specific year.
   */
  @Override
  public long getYearAmount(Integer year) {
    if (this.getProcessingDate() == null || this.getProcessingDate().getYear() != year) {
      return super.getYearAmount(year);
    }
    return this.getAmount();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    Pledges that = (Pledges) o;
    return Objects.equals(getProcessingDate(), that.getProcessingDate());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getProcessingDate());
  }

  @Override
  public String toString() {
    return "Donations{" +
        "Amount='" + String.valueOf(super.getAmount()) + '\'' +
        ", createDate='" + String.valueOf(super.getDonateTime()) + '\'' +
        ", processingDate='" + String.valueOf(this.getProcessingDate()) + '\'' +
        '}';
  }
}
