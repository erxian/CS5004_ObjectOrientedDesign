package finalExam.p1;

public abstract class AbstractTaxFiler implements ITaxFiler {
  protected String taxID;
  protected ContactInfo contactInfo;
  protected Double lastYearIncome;
  protected Double totalIncomeTax;
  protected Double mortgageInterest;
  protected Double propertyTaxes;
  protected Double studentFees;
  protected Double retirementSaving;
  protected Double healthSaving;
  protected Double donations;

  protected static final double MORTGAGE_BAR = 150000;
  protected static final double MORTGAGE_INTEREST = 12500;
  protected static final double MORTGAGE_DEDUCTION = 2500;

  public AbstractTaxFiler(String taxID, ContactInfo contactInfo, Double lastYearIncome,
      Double totalIncomeTax, Double mortgageInterest, Double propertyTaxes,
      Double studentFees, Double retirementSaving, Double healthSaving,
      Double donations) {
    this.taxID = taxID;
    this.contactInfo = contactInfo;
    this.lastYearIncome = lastYearIncome;
    this.totalIncomeTax = totalIncomeTax;
    this.mortgageInterest = mortgageInterest;
    this.propertyTaxes = propertyTaxes;
    this.studentFees = studentFees;
    this.retirementSaving = retirementSaving;
    this.healthSaving = healthSaving;
    this.donations = donations;
  }

  protected Double checkMortgageDiscount() {
    if (this.lastYearIncome < MORTGAGE_BAR &&
        (this.mortgageInterest + this.propertyTaxes) > MORTGAGE_INTEREST) {
      return MORTGAGE_DEDUCTION;
    }
    return 0.0;
  }
}
