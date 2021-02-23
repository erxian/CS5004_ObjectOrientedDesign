package problem1;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class MonthlyDonations extends Donations {
  private LocalDateTime cancelDate;
  protected Integer allMonth = 12;

  /**
   * When Monthly Donations first created
   * @param amount     the donation amount.
   * @param donateTime the date and time that the donation was made.
   */
  public MonthlyDonations(Integer amount, LocalDateTime donateTime) {
    super(amount, donateTime);
    this.cancelDate = null;
  }

  /**
   * Get cancel date of this monthly donation.
   * @return the cancel date of this monthly donation.
   */
  public LocalDateTime getCancelDate() {
    return this.cancelDate;
  }

  /**
   * Set cancel date of this monthly donation.
   * @param cancelDate the cancel date of this monthly donation.
   */
  public void setCancelDate(LocalDateTime cancelDate) {
    if (cancelDate.isBefore(this.getDonateTime())) {
      throw new IllegalArgumentException("cancellation is not prior to the creation date and time.");
    }
    this.cancelDate = cancelDate;
  }

  /**
   * If the donation has no cancel date
   * @param start the start date of one specific year
   * @param end the end date of one specific year
   * @return the donated months during this specific year.
   */
  private long monthsWithoutCancel(LocalDateTime start, LocalDateTime end) {
    long donatedMonth= 0;
    if (this.getDonateTime().isAfter(start) && this.getDonateTime().isBefore(end)) {
      donatedMonth =  Period.between(this.getDonateTime().toLocalDate(),
        end.toLocalDate()).getMonths() + 1;
      }
    if (this.getDonateTime().isBefore(start)) {
     donatedMonth = allMonth;
    }
    return donatedMonth;
  }

  /**
   * If the donation has cancel date
   * @param start the start date of one specific year
   * @param end end the end date of one specific year
   * @return the donated months during this specific year.
   */
  private long monthsWithCancel(LocalDateTime start, LocalDateTime end) {
    /**
     * There are 6 basic case when calculate months, case1 & case2 & case3 only donate partial
     * months in the specific year, case 4 can donate entire year, case5 & case6 don't donate
     * in the specific year.
     *
     * case1: donate crate Date is before than start and donate cancel Date is before than end.
     * case2: donate create Date is after than start and donate cancel Date is before than end.
     * case3: donate create Date is after than start and donate cancel Date is after than end.
     * case4: start is after than donate create Date and end is before donate cancel Date.
     * case5: start is after than donate cancel Date.
     * cate6: end is before than donate create Date.
     */

    // case5 & case6
    if (this.getDonateTime().isAfter(end) || this.getCancelDate().isBefore(start)) {
      return 0;
    }

    long donatedMonth = 0;
    // case1
    if (this.getDonateTime().isBefore(start) && this.getCancelDate().isBefore(end)) {
      LocalDateTime tempDateTime = LocalDateTime.from(start);
      long months = tempDateTime.until(this.getCancelDate(), ChronoUnit.MONTHS ) + 1;
      donatedMonth = months;
    // case2
    } else if (this.getDonateTime().isAfter(start) && this.getCancelDate().isBefore(end)) {
      LocalDateTime tempDateTime = LocalDateTime.from(this.getDonateTime());
      long months = tempDateTime.until(this.getCancelDate(), ChronoUnit.MONTHS ) + 1;
      donatedMonth = months;
    // case3
    } else if (this.getDonateTime().isAfter(start) && this.getCancelDate().isAfter(end)) {
      LocalDateTime tempDateTime = LocalDateTime.from(this.getDonateTime());
      long months = tempDateTime.until(end, ChronoUnit.MONTHS ) + 1;
      donatedMonth = months;
    // case4
    } else {
      donatedMonth = allMonth;
    }
    return donatedMonth;
  }

  /**
   * Calculate the donated amount during one specific year.
   * @param year the calculate range year.
   * @return the donated amount during this specific year.
   */
  @Override
  public long getYearAmount(Integer year) {
    LocalDateTime start = LocalDateTime.of(year, 1, 1, 00, 00);
    LocalDateTime end = LocalDateTime.of(year, 12, 31, 23, 59);
    long donatedMonth;
    if (this.getCancelDate() != null) {
      donatedMonth = monthsWithCancel(start, end);
    } else {
      donatedMonth = monthsWithoutCancel(start, end);
    }
    return this.getAmount() * donatedMonth;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    MonthlyDonations that = (MonthlyDonations) o;
    return Objects.equals(getCancelDate(), that.getCancelDate());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getCancelDate());
  }

  @Override
  public String toString() {
    return "Donations{" +
        "MonthlyAmount='" + String.valueOf(super.getAmount()) + '\'' +
        ", createTime='" + String.valueOf(super.getDonateTime()) + '\'' +
        ", cancelTime='" + String.valueOf(this.getCancelDate()) + '\'' +
        '}';
  }
}
