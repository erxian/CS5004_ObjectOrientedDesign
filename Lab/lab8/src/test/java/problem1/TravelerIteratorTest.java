package problem1;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class TravelerIteratorTest {
  private Traveler traveler1;
  private Traveler traveler2;
  private Traveler traveler3;
  private Traveler traveler4;

  private Destination destination1;
  private Destination destination2;
  private Destination destination3;
  private Destination destination4;

  TravelerIterator travelerIterator;


  @Before
  public void setUp() throws Exception {
    destination1 = new Destination("Boston", "US", "NZ9001", 1002.0f);
    destination2 = new Destination("New York", "US", "NZ7755", 920.0f);
    destination3 = new Destination("Toronto", "Canada", "CA4421", 750.0f);
    destination4 = new Destination("Tokyo", "Japan", "JP1120", 18000.0f);
    traveler1 = new Traveler("peter", "zhu", Arrays.asList(destination1, destination3));
    traveler2 = new Traveler("lily", "wang", Arrays.asList(destination1, destination2));
    traveler3 = new Traveler("fiona", "wu", Arrays.asList(destination3));
    traveler4 = new Traveler("jessica", "hu", Arrays.asList(destination4));

    travelerIterator = new TravelerIterator(Arrays.asList(traveler1, traveler2, traveler3, traveler4));
    /**
    for (Destination destination: traveler1.traveledDestinations()) {
      System.out.println(destination.getCountry());
    }*/
  }

  @Test
  public void Test() {
    assertTrue(travelerIterator.hasNext());
    assertEquals(traveler1, travelerIterator.next());
    assertTrue(travelerIterator.hasNext());
    assertEquals(traveler3, travelerIterator.next());
    assertTrue(travelerIterator.hasNext());
    assertEquals(traveler4, travelerIterator.next());
    assertFalse(travelerIterator.hasNext());
  }
}