package problem1;

import java.util.HashSet;
import java.util.Set;

public class NonProfit implements INonProfit {
  private String organization;
  private Set<Donations> donations;

  /**
   * 
   * @param organization The Non Profit organization name.
   */
  public NonProfit(String organization) {
    this.organization = organization;
    this.donations = new HashSet<>();
  }

  /**
   * Get the organization name of this Non profit donation.
   * @return the organization name of this Non profit donation.
   */
  public String getOrganization() {
    return this.organization;
  }

  /**
   * Get the Donation Set of this Non profit donation.
   * @return the Donation Set of this Non profit donation.
   */
  public Set<Donations> getDonations() {
    return this.donations;
  }

  /**
   * Add donations to the donation Set
   * @param donations the donation added.
   */
  public void addDonations(Donations donations) {
    this.donations.add(donations);
  }

  /**
   * Return the sum of all donations processed in this year
   *
   * @param year donate year
   * @return the sum of all donations processed in this year
   */
  @Override
  public long getTotalDonationsForYear(Integer year) {
    long sumAmount = 0;
    for (Donations donateIter : this.donations) {
        sumAmount += donateIter.getYearAmount(year);
    }
    return sumAmount;
  }
}
