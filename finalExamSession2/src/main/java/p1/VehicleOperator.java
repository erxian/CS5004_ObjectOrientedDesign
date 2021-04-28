package p1;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class VehicleOperator {

  private String name;
  private String drivingLicenseNumber;
  private LocalDate dateOfBirth;
  private List<Vehicle> operatedVehicles;

  public VehicleOperator(String name, String drivingLicenseNumber,
                         LocalDate dateOfBirth, List<Vehicle> operatedVehicles) {
    this.name = name;
    this.drivingLicenseNumber = drivingLicenseNumber;
    this.dateOfBirth = dateOfBirth;
    this.operatedVehicles = operatedVehicles;
  }

  public String getName() {
    return name;
  }

  public String getDrivingLicenseNumber() {
    return drivingLicenseNumber;
  }

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public List<Vehicle> getOperatedVehicles() {
    return operatedVehicles;
  }

  public List<Vehicle> findVehicleByYear(LocalDate yearManufactured) {
    return this.operatedVehicles.stream()
        .filter(v -> (v.getYearManufactured().isBefore(yearManufactured) ||
          v.getYearManufactured().isEqual(yearManufactured)))
        .collect(Collectors.toList());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName(),getDrivingLicenseNumber(), getDateOfBirth(), getOperatedVehicles());
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    VehicleOperator that = (VehicleOperator) o;
    return Objects.equals(getName(), that.getName()) &&
        Objects.equals(getDrivingLicenseNumber(), that.getDrivingLicenseNumber()) &&
        getDateOfBirth().equals(that.getDateOfBirth()) &&
        Objects.equals(getOperatedVehicles(), that.getOperatedVehicles());
  }

  @Override
  public String toString() {
    return "VehicleOperator{" +
        "name='" + this.name + '\'' +
        ", drivingLicenseNumber='" + this.drivingLicenseNumber + '\'' +
        ", dateOfBirth='" + this.dateOfBirth.toString() + '\'' +
        ", operatedVehicles='" + this.operatedVehicles + '\'' +
        '}';
  }
}
