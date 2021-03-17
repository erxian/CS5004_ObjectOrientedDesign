package finalExam.p1;

public class SelfEmployeedFiler extends AbstractIndividualFilers {
  private Double homeOfficeExpenses;
  private Double healthInsurance;
  private Double transportFee;
  private Double businessExpenses;

  public SelfEmployeedFiler(String taxID, ContactInfo contactInfo,
      Double lastYearIncome, Double totalIncomeTax, Double mortgageInterest,
      Double propertyTaxes, Double studentFees, Double retirementSaving,
      Double healthSaving, Double donations, Double homeOfficeExpenses,
      Double healthInsurance, Double transportFee, Double businessExpenses) {
    super(taxID, contactInfo, lastYearIncome, totalIncomeTax, mortgageInterest, propertyTaxes,
        studentFees, retirementSaving, healthSaving, donations);
    this.homeOfficeExpenses = homeOfficeExpenses;
    this.healthInsurance = healthInsurance;
    this.transportFee = transportFee;
    this.businessExpenses = businessExpenses;
  }

  @Override
  public Double calculateTax() {
    return super.calculateTax();
  }
}
