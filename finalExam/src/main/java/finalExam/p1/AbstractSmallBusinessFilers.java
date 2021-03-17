package finalExam.p1;

public abstract class AbstractSmallBusinessFilers extends AbstractTaxFiler {
  protected Integer employeeNum;
  protected Double employeeExpenses;
  protected Double businessExpenses;

  protected static final double TAX_RATE = 0.15;
  protected static final double EMPLOYEE_CREDIT = 2500.0;

  public AbstractSmallBusinessFilers(String taxID, ContactInfo contactInfo, Double lastYearIncome,
      Double totalIncomeTax, Double mortgageInterest, Double propertyTaxes,
      Double studentFees, Double retirementSaving, Double healthSaving, Double donations,
      Integer employeeNum, Double employeeExpenses, Double businessExpenses) {
    super(taxID, contactInfo, lastYearIncome, totalIncomeTax, mortgageInterest, propertyTaxes,
        studentFees, retirementSaving, healthSaving, donations);
    this.employeeNum = employeeNum;
    this.employeeExpenses = employeeExpenses;
    this.businessExpenses = businessExpenses;
  }

  protected Double taxableIncome() {
    Double basicTaxableIncome = this.lastYearIncome - this.totalIncomeTax;
    Double employeeCredit = this.employeeNum * EMPLOYEE_CREDIT;

    Double TaxableIncome = basicTaxableIncome - this.donations - this.employeeExpenses -
        this.businessExpenses - employeeCredit;

    return TaxableIncome;
  }

  @Override
  public Double calculateTax() {
    return this.taxableIncome() * TAX_RATE;
  }
}
