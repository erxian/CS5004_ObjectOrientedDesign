package problem2;


import java.util.ArrayList;
import java.util.List;


/**
 * The type Older vehicles filter.
 */
public class OlderVehiclesFilter {
  private List<Vehicle> vehicles = new ArrayList<>();
  private static final Integer YEAR = 1999;

  /**
   * Instantiates a new Older vehicles filter.
   *
   * @param vehicles the vehicles
   */
  public OlderVehiclesFilter(List<Vehicle> vehicles) {
    this.vehicles = vehicles;
  }

  /**
   * Construct an OlderVehiclesFilter
   * @param vehicle1 vehicle 1
   * @param vehicle2 vehicle 2
   * @param vehicle3 vehicle 3
   */
  public OlderVehiclesFilter(Vehicle vehicle1, Vehicle
      vehicle2, Vehicle vehicle3){
    this.vehicles.add(vehicle1);
    this.vehicles.add(vehicle2);
    this.vehicles.add(vehicle3);
  }

  /**
   * Filter v wvehilces list.
   *
   * @return the list
   */
  public List<String> filterVWvehilces(){
  //YOUR CODE HERE
    return null;
  }

  /**
   * Filter older vehicles before 1999, and print
   * out make, model and year
   */
  public void filterOlderVehicles() {
    this.vehicles.stream()
        .filter(vehicle -> vehicle.getYear() < YEAR)
        .map(v -> v.getMake() + ", " + v.getModel() + ", " + v.getYear())
        .forEach(System.out::println);
  }

  /*
  public static void main(String[] args) {
    Vehicle vehicle1 = new Vehicle("fort", "Abarth", 1992, Color.yellow);
    Vehicle vehicle2 = new Vehicle("toyota", "Audi", 1995, Color.black);
    Vehicle vehicle3 = new Vehicle("bmw", "BMW", 2000, Color.white);

    OlderVehiclesFilter ov = new OlderVehiclesFilter(vehicle1, vehicle2, vehicle3);

    ov.filterOlderVehicles();
  }*/
}
