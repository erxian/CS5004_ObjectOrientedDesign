package finalExam.p1;

public abstract class AbstractGroupFilers extends AbstractTaxFiler {
  protected Integer dependantNum;
  protected Integer minorChildren;
  protected Double childExpenses;
  protected Double dependantExpenses;

  protected static final double SAVING_DISCOUNT = 0.65;
  protected static final double SAVING_BAR = 17500;
  protected static final double INCOME_HIGH_BAR = 200000;
  protected static final double INCOME_LOW_BAR = 75000;

  protected static final double EDUCATION_EXPENSES = 7500;
  protected static final double EDUCATION_DEDUCTION = 2500;
  protected static final double CHILD_EXPENSES = 5000;
  protected static final double CHILD_DEDUCTION = 1250;
  protected static final double MINOR_CHILD_DEDUCTION = 750;

  protected static final double TAXABLE_LOW_BAR = 90000;
  protected static final double TAXABLE_HIGH_BAR = 185000;

  protected static final double TAX_LOW_RATE = 0.145;
  protected static final double TAX_HIGH_RATE = 0.19;


  public AbstractGroupFilers(String taxID, ContactInfo contactInfo, Double lastYearIncome,
      Double totalIncomeTax, Double mortgageInterest, Double propertyTaxes,
      Double studentFees, Double retirementSaving, Double healthSaving,
      Double donations, Integer dependantNum, Integer minorChildren,
      Double childExpenses, Double dependantExpenses) {
    super(taxID, contactInfo, lastYearIncome, totalIncomeTax, mortgageInterest, propertyTaxes,
        studentFees, retirementSaving, healthSaving, donations);
    this.dependantNum = dependantNum;
    this.minorChildren = minorChildren;
    this.childExpenses = childExpenses;
    this.dependantExpenses = dependantExpenses;
  }

  protected Double checkChildcareDeduction() {
    if (this.lastYearIncome <= INCOME_HIGH_BAR && this.childExpenses >= CHILD_EXPENSES) {
      return CHILD_DEDUCTION;
    }
    return 0.0;
  }

  protected Double checkCareCredit() {
    if (this.lastYearIncome <= INCOME_LOW_BAR) {
      return this.minorChildren * MINOR_CHILD_DEDUCTION;
    }
    return 0.0;
  }

  protected Double checkSavingDeduction() {
    Double savingDeduction = (this.retirementSaving + this.healthSaving) * SAVING_DISCOUNT;
    if (savingDeduction > SAVING_BAR) {
      return SAVING_BAR;
    }
    return savingDeduction;
  }

  protected Double checkStudentDiscount() {
    if (this.lastYearIncome <= INCOME_HIGH_BAR && this.studentFees >= EDUCATION_EXPENSES) {
      return EDUCATION_DEDUCTION;
    }
    return 0.0;
  }

  @Override
  protected Double calculateTaxableIncome() {

    Double savingDeduction = this.checkSavingDeduction();
    Double studentFeesDeduction = this.checkStudentDiscount();
    Double childDeduction = this.checkChildcareDeduction();

    Double TaxableIncome = super.calculateTaxableIncome() - savingDeduction
        - studentFeesDeduction - childDeduction;

    return TaxableIncome;
  }

  @Override
  public Double calculateTax() {
    Double TaxableIncome = this.calculateTaxableIncome();
    if (TaxableIncome <= TAXABLE_LOW_BAR) {
      return TaxableIncome * TAX_LOW_RATE - this.checkCareCredit();
    }

    if (TaxableIncome >= TAXABLE_HIGH_BAR) {
      return TaxableIncome * TAX_HIGH_RATE - this.checkCareCredit();
    }
    // Lack of description about the tax rate when TaxableIncome between
    // $90000 and $185000, so set default with TAX_LOW_RATE
    return TaxableIncome * TAX_LOW_RATE - this.checkCareCredit();
  }
}
