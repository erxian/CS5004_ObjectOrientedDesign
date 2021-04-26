package problem2;

import static org.junit.Assert.*;

import java.awt.Color;
import org.junit.Before;
import org.junit.Test;

public class OlderVehiclesFilterTest {
  private Vehicle vehicle1;
  private Vehicle vehicle2;
  private Vehicle vehicle3;
  private OlderVehiclesFilter olderVehiclesFilter;

  @Before
  public void setUp() throws Exception {
    vehicle1 = new Vehicle("fort", "Abarth", 1992, Color.yellow);
    vehicle2 = new Vehicle("toyota", "Audi", 1995, Color.black);
    vehicle3 = new Vehicle("bmw", "BMW", 2000, Color.white);
    olderVehiclesFilter = new OlderVehiclesFilter(vehicle1, vehicle2, vehicle3);
  }

  @Test
  public void filterOlderVehicles() {
    olderVehiclesFilter.filterOlderVehicles();
  }
}