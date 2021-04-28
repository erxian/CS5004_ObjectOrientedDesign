package p1;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class VehicleOperatorProcessor {
  private List<VehicleOperator> operators;

  public VehicleOperatorProcessor(List<VehicleOperator> operators) {
    this.operators = operators;
  }

  private VehicleOperatorProcessor(VehicleOperator operator1, VehicleOperator operator2){
    this.operators.add(operator1);
    this.operators.add(operator2);
  }

  /**
   * Get the vehicle list operated by an operator with given Vehicle make and model
   * @param operator VehicleOperator, the people who operate the vehicle
   * @param make a String, the manufacture who made the vehicle
   * @param model a String, the model that vehicle used
   * @return a Vehicle List which satisfy the given condition
   */
  public static List<Vehicle> mysteryMethod(VehicleOperator operator, String make, String model){
    return operator.getOperatedVehicles().stream()
        .filter(x -> x.getMake().equals(make) && x.getModel().equals(model))
        .collect(Collectors.toList());
  }

  /**
   * Get the list of names of all VehicleOperators who operate at least one vehicle
   * older than or equal to the input argument manufacturingYear.
   * @param manufacturingYear Vechivle manufacture year
   * @return the list of names
   */
  public List<String> filterByManufacturingYear(LocalDate manufacturingYear){
    return this.operators.stream().filter(v -> v.findVehicleByYear(manufacturingYear).size() >= 1)
        .map(v -> v.getName())
        .collect(Collectors.toList());
  }

  /**
   * Compare two VehicleOperatorProcessor Objects for equality.
   * @param o Another VehicleOperatorProcessor
   * @return true if objects are equal, false otherwise.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof VehicleOperatorProcessor)) {
      return false;
    }

    VehicleOperatorProcessor that = (VehicleOperatorProcessor) o;
    return Objects.equals(operators, that.operators);
  }

  /**
   * Returns integer hashCode of the Object.
   * @return Integer hashCode of the Object.
   */
  @Override
  public int hashCode() {
    return Objects.hash(operators);
  }

  /**
   * String representation of a VehicleOperatorProcessor Object.
   * @return String representation of a VehicleOperatorProcessor Object.
   */
  @Override
  public String toString() {
    return "VehicleOperatorProcessor{" +
        "operators=" + operators +
        '}';
  }
}
