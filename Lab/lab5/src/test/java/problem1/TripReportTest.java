package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TripReportTest {
  private TripReport report;

  @Before
  public void setUp() throws Exception {
    Vehicle bus = new Bus("Stanford school bus", 20.0f, 35.0f);
    report = new TripReport(bus, 30.0f, 600.0f, 20);
  }

  @Test
  public void getVehicle() {
    Vehicle some = new Bus("Stanford school bus", 20.0f, 35.0f);
    assertTrue(report.getVehicle().equals(some));
  }
}