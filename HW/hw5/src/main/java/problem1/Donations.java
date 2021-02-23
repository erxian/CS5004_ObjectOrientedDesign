package problem1;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Donations abstract the fields of all donations, including
 * donation amount an donation date and time.
 */
public abstract class Donations {
  private Integer amount;
  private LocalDateTime donateTime;

  /**
   *
   * @param amount the donation amount.
   * @param donateTime  the date and time that the donation was made.
   */
  public Donations(Integer amount, LocalDateTime donateTime) {
    this.amount = amount;
    this.donateTime = donateTime;
  }

  /**
   * Return the amount of the donation.
   * @return the amount of the donation.
   */
  public Integer getAmount() {
    return this.amount;
  }

  /**
   * Return the donation date and time.
   * @return the donation date and time.
   */
  public LocalDateTime getDonateTime() {
    return this.donateTime;
  }

  /**
   * Calculate the donated amount during one specific year.
   * @param year the calculate range year.
   * @return the donated amount during this specific year.
   */
  public long getYearAmount(Integer year) {
    return 0;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Donations that = (Donations) o;
    return Objects.equals(getAmount(), that.getAmount()) &&
        Objects.equals(getDonateTime(), that.getDonateTime());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getAmount(), getDonateTime());
  }

  @Override
  public String toString() {
    return "Donations{" +
        "amount='" + String.valueOf(this.amount) + '\'' +
        ", donateTime='" + String.valueOf(this.donateTime) + '\'' +
        '}';
  }
}
