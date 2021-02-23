package problem1;

/**
 * specification for a NonProfit organization.
 */
public interface INonProfit {

  /**
   * Return the sum of all donations processed in this year
   * @param year donate year
   * @return the sum of all donations processed in this year
   */
  long getTotalDonationsForYear(Integer year);
}
