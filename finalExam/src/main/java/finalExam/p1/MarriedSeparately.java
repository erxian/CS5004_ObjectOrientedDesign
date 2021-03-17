package finalExam.p1;

public class MarriedSeparately extends AbstractGroupFilers {

  public MarriedSeparately(String taxID, ContactInfo contactInfo, Double lastYearIncome,
      Double totalIncomeTax, Double mortgageInterest, Double propertyTaxes,
      Double studentFees, Double retirementSaving, Double healthSaving,
      Double donations, Integer dependantNum, Integer minorChildren, Double childExpenses,
      Double dependantExpenses) {
    super(taxID, contactInfo, lastYearIncome, totalIncomeTax, mortgageInterest, propertyTaxes,
        studentFees, retirementSaving, healthSaving, donations, dependantNum,
        minorChildren, childExpenses, dependantExpenses);
  }

  @Override
  public Double calculateTax() {
    return super.calculateTax();
  }
}
