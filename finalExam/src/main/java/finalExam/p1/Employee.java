package finalExam.p1;

public class Employee extends AbstractIndividualFilers {

  public Employee(String taxID, ContactInfo contactInfo,
      Double lastYearIncome, Double totalIncomeTax, Double mortgageInterest,
      Double propertyTaxes, Double studentFees, Double retirementSaving,
      Double healthSaving, Double donations) {
    super(taxID, contactInfo, lastYearIncome, totalIncomeTax, mortgageInterest, propertyTaxes,
        studentFees, retirementSaving, healthSaving, donations);
  }

  @Override
  public Double calculateTax() {
    return super.calculateTax();
  }
}
