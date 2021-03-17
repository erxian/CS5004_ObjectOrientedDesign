package finalExam.p1;

public abstract class AbstractIndividualFilers extends AbstractTaxFiler {
  protected static final double SAVING_DISCOUNT = 0.7;
  protected static final double EDUCATION_BAR = 75000.0;
  protected static final double EDUCATION_EXPENSES = 5000.0;
  protected static final double EDUCATION_DEDUCTION = 1500.0;
  protected static final double TAXABLE_BAR = 55000.0;
  protected static final double TAX_LOW_RATE = 0.15;
  protected static final double TAX_HIGH_RATE = 0.19;

  public AbstractIndividualFilers(String taxID, ContactInfo contactInfo, Double lastYearIncome,
      Double totalIncomeTax, Double mortgageInterest, Double propertyTaxes,
      Double studentFees, Double retirementSaving, Double healthSaving,
      Double donations) {
    super(taxID, contactInfo, lastYearIncome, totalIncomeTax, mortgageInterest, propertyTaxes,
        studentFees, retirementSaving, healthSaving, donations);
  }

  protected Double checkStudentDiscount() {
    if (this.lastYearIncome <= EDUCATION_BAR && this.studentFees >= EDUCATION_EXPENSES) {
      return EDUCATION_DEDUCTION;
    }
    return 0.0;
  }

  @Override
  protected Double calculateTaxableIncome() {
    Double savingDeduction = (this.retirementSaving + this.healthSaving) * SAVING_DISCOUNT;
    Double studentFeesDeduction = this.checkStudentDiscount();

    Double TaxableIncome = super.calculateTaxableIncome() - savingDeduction -
        studentFeesDeduction;

    return TaxableIncome;
  }

  @Override
  public Double calculateTax() {
    Double TaxableIncome = this.calculateTaxableIncome();
    if (TaxableIncome < TAXABLE_BAR) {
      return TaxableIncome * TAX_LOW_RATE;
    } else {
      return TaxableIncome * TAX_HIGH_RATE;
    }
  }
}
