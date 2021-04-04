package problem1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class TravelerTest {
  private Traveler traveler;
  private Destination destination1;
  private Destination destination2;
  private Destination destination3;

  @Before
  public void setUp() throws Exception {
    destination1 = new Destination("Boston", "US", "NZ9001", 1002.0f);
    destination2 = new Destination("New York", "US", "NZ7755", 920.0f);
    destination3 = new Destination("Toronto", "Canada", "CA4421", 750.0f);
    traveler = new Traveler("peter", "zhu", Arrays.asList(destination1,destination2, destination3));
  }

  @Test
  public void getFirstName() {
    assertEquals("peter", traveler.getFirstName());
  }

  @Test
  public void getLastName() {
    assertEquals("zhu", traveler.getLastName());

  }

  @Test
  public void traveledDestinations() {
    List<Destination> destinations = Arrays.asList(destination1, destination2, destination3);
    assertEquals(destinations, traveler.traveledDestinations());
  }

  @Test
  public void compareTo() {
    Traveler other = new Traveler("peter", "zhu", Arrays.asList(destination1, destination2, destination3));
    assertTrue(traveler.compareTo(other) == 0);

    Traveler that = new Traveler("peter", "Li", Arrays.asList(destination1, destination2));
    assertTrue(traveler.compareTo(that) == 1);

    Destination  destination4 = new Destination("Singapore", "singapore", "SG4421", 5000.0f);
    Traveler rich = new Traveler("chris", "wu", Arrays.asList(destination1, destination2, destination3, destination4));
    assertTrue(traveler.compareTo(rich) == -1);
  }
}