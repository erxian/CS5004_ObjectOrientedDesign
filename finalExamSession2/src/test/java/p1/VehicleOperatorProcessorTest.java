package p1;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class VehicleOperatorProcessorTest {
  private VehicleOperatorProcessor vehicleOperatorProcessor;
  private VehicleOperator vehicleOperator1;
  private VehicleOperator vehicleOperator2;

  private Vehicle vehicle1;
  private Vehicle vehicle2;
  private Vehicle vehicle3;
  private Vehicle vehicle4;

  List<Vehicle> operateList1 = new ArrayList<>();
  List<Vehicle> operateList2 = new ArrayList<>();

  List<Vehicle> expected = new ArrayList<>();

  List<VehicleOperator> operators = new ArrayList<>();


  @Before
  public void setUp() throws Exception {
    vehicle1 = new Vehicle("1001", "fort", "Abarth", LocalDate.of(1996, 5,10), 10000.0f);
    vehicle2 = new Vehicle("1002", "toyota", "Acura", LocalDate.of(1995, 2,1), 5000.0f);
    vehicle3 = new Vehicle("1003", "BMW", "BMW", LocalDate.of(2001, 10,12), 15000.0f);
    vehicle4 = new Vehicle("1004", "Audi", "Audi", LocalDate.of(2005, 5,20), 6000.0f);

    operateList1.add(vehicle1);
    operateList1.add(vehicle2);

    operateList2.add(vehicle3);
    operateList2.add(vehicle4);

    vehicleOperator1 = new VehicleOperator("peter", "No.10086", LocalDate.of(1986, 12, 12), operateList1);
    vehicleOperator2 = new VehicleOperator("tom", "No.10010", LocalDate.of(2000, 5, 20), operateList2);

    operators.add(vehicleOperator1);
    operators.add(vehicleOperator2);

    vehicleOperatorProcessor = new VehicleOperatorProcessor(operators);
  }

  @Test
  public void mysteryMethod() {
    List<Vehicle> list = VehicleOperatorProcessor.mysteryMethod(vehicleOperator1, "toyota", "Acura");
    expected.add(vehicle2);
    assertEquals(expected, list);
  }

  @Test
  public void filterByManufacturingYear() {
    List<String> nameList = vehicleOperatorProcessor.filterByManufacturingYear(LocalDate.of(1995, 2, 1));
    List<String> expectedName = Arrays.asList("peter");
    assertEquals(nameList, expectedName);
  }
}