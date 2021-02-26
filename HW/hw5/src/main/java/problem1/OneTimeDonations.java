package problem1;

import java.time.LocalDateTime;

public class OneTimeDonations extends Donations {

  /**
   * @param amount     the donation amount.
   * @param donateTime the date and time that the donation was made.
   */
  public OneTimeDonations(Integer amount, LocalDateTime donateTime) {
    super(amount, donateTime);
  }

  /**
   * Calculate the donated amount during one specific year.
   * @param year the calculate range year.
   * @return the donated amount during this specific year.
   */
  @Override
  public long getYearAmount(Integer year) {
    if (this.getDonateTime().getYear() != year) {
      return super.getYearAmount(year);
    }
    return this.getAmount();
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
    return super.toString();
  }
}
