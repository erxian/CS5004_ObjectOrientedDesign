package finalExam.p1;

public class SmallBusinessFilers extends AbstractTaxFiler {
  protected Integer employeeNum;
  protected Double employeeExpenses;
  protected Double businessExpenses;

  protected static final double TAX_RATE = 0.15;
  protected static final double EMPLOYEE_CREDIT = 2500.0;

  public SmallBusinessFilers(String taxID, ContactInfo contactInfo, Double lastYearIncome,
      Double totalIncomeTax, Double mortgageInterest, Double propertyTaxes,
      Double studentFees, Double retirementSaving, Double healthSaving, Double donations,
      Integer employeeNum, Double employeeExpenses, Double businessExpenses) {
    super(taxID, contactInfo, lastYearIncome, totalIncomeTax, mortgageInterest, propertyTaxes,
        studentFees, retirementSaving, healthSaving, donations);
    this.employeeNum = employeeNum;
    this.employeeExpenses = employeeExpenses;
    this.businessExpenses = businessExpenses;
  }

  private Double calculateTaxableIncome() {
    Double basicTaxableIncome = this.lastYearIncome - this.totalIncomeTax;
    Double employeeCredit = this.employeeNum * EMPLOYEE_CREDIT;

    Double TaxableIncome = basicTaxableIncome - this.donations - this.employeeExpenses -
        this.businessExpenses - employeeCredit;

    return TaxableIncome;
  }

  @Override
  public Double calculateTax() {
    return this.calculateTaxableIncome() * TAX_RATE;
  }
}
