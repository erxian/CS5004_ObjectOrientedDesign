package p1;

import java.time.LocalDate;
import java.util.Objects;

public class Vehicle {

  private String vehicleID;
  private String make;
  private String model;
  private LocalDate yearManufactured;
  private Float milage;

  public Vehicle(String vehicleID, String make, String model,
                 LocalDate yearManufactured, Float milage) {
    this.vehicleID = vehicleID;
    this.make = make;
    this.model = model;
    this.yearManufactured = yearManufactured;
    this.milage = milage;
  }

  public String getVehicleID() {
    return vehicleID;
  }

  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }

  public LocalDate getYearManufactured() {
    return yearManufactured;
  }

  public Float getMilage() {
    return milage;
  }

  @Override
  public int hashCode() {
    return Objects.hash(getVehicleID(), getMake(), getModel(), getMilage());
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Vehicle that = (Vehicle) o;
    return Objects.equals(getVehicleID(), that.getVehicleID()) &&
        Objects.equals(getMake(), that.getMake()) &&
        Objects.equals(getModel(), that.getModel()) &&
        getYearManufactured().equals(that.getYearManufactured()) &&
        Float.compare(getMilage(), that.getMilage()) == 0;
  }

  @Override
  public String toString() {
    return "Vehicle{" +
        "vehicleID='" + this.vehicleID + '\'' +
        ", make='" + this.make + '\'' +
        ", model='" + this.model + '\'' +
        ", yearManufactured='" + this.yearManufactured.toString() + '\'' +
        ", milage='" + String.valueOf(this.milage) + '\'' +
        '}';
  }
}
