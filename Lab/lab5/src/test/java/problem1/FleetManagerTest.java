package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FleetManagerTest {
  private Vehicle schoolBus;
  private Vehicle cityTrain;
  private Vehicle riverBoat;
  private FleetManager fleetManager;

  @Before
  public void setUp() throws Exception {
    schoolBus = new Bus("Stanford school bus", 20.0f, 35.0f);
    cityTrain = new Train("NYC to Boston", 100.0f, 150.0f);
    riverBoat = new Boat("Queen", 50.0f, 70.0f);
    fleetManager = new FleetManager();
  }

  @Test
  public void testFirstDrive() {
    TripReport busReport = fleetManager.drive(60.0f, schoolBus);
    assertEquals(3.0f, busReport.getTripDuration(), 0.0);

    TripReport trainReport = fleetManager.drive(500.0f, cityTrain);
    assertEquals(5.0f, trainReport.getTripDuration(), 0.0);

    TripReport boatReport = fleetManager.drive(1000.0f, riverBoat);
    assertEquals(20.f, boatReport.getTripDuration(), 0.0);
  }

  @Test
  public void testSecondDrive() {
    TripReport busReport = fleetManager.drive(15, schoolBus);
    assertEquals(300, busReport.getDistance(), 0);

    TripReport trainReport = fleetManager.drive(60, cityTrain);
    assertEquals(6000.0f, trainReport.getDistance(), 0.0);

    TripReport boatReport = fleetManager.drive(20, riverBoat);
    assertEquals(1000.0f, boatReport.getDistance(), 0.0);
  }

  @Test
  public void testThirdDrive() {
    TripReport busReport = fleetManager.drive(25.0f, 100.0f, schoolBus);
    assertEquals(4, busReport.getTripDuration(), 0);

    TripReport trainReport = fleetManager.drive(200.0f, 1500.0f, cityTrain);
    assertEquals(10, trainReport.getTripDuration(), 0.0);

    TripReport boatReport = fleetManager.drive(60.0f, 600.0f, riverBoat);
    assertEquals(10, boatReport.getTripDuration(), 0.0);
  }

  @Test
  public void testForthDrive() {
    TripReport busReport = fleetManager.drive(4, 120.0f, schoolBus);
    assertEquals(30.0f, busReport.getSpeed(), 0.0);

    TripReport trainReport = fleetManager.drive(5, 600.0f, cityTrain);
    assertEquals(120.0f, trainReport.getSpeed(), 0.0);

    TripReport boatReport = fleetManager.drive(12, 600.0f, riverBoat);
    assertEquals(50.0f, boatReport.getSpeed(), 0.0);
  }
}