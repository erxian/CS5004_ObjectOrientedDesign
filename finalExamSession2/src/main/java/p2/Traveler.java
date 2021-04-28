package p2;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Class represents a traveler. The traveler has a first name, last name and a
 * list of destinations they visited in the last three years.
 */
public class Traveler implements Comparable<Traveler> {
  private String firstName;
  private String lastName;
  private List<Destination> traveledDestinations;

  private static final String INDIA = "India";
  private static final String GERMANY = "Germany";

  /**
   * Constructs a Traveler object and initializes it
   * to the given first name, last name and the list of traveled destinations
   * @param firstName the first name of this person
   * @param lastName the last name of this person
   * @param traveledDestinations list of destinations they visited in the last three years.
   */

  public Traveler(String firstName, String lastName, List<Destination> traveledDestinations) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.traveledDestinations = traveledDestinations;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public List<Destination> traveledDestinations() {
    return traveledDestinations;
  }

  private int tripNumberToIndiaOrGermany() {
    return this.traveledDestinations.stream()
        .filter(x -> x.getDestinationName().equals(INDIA) ||
          x.getDestinationName().equals(GERMANY))
        .collect(Collectors.toList())
        .size();
  }

  @Override
  public int compareTo(Traveler otherTraveler) {

    return Integer.compare(this.tripNumberToIndiaOrGermany(),
        otherTraveler.tripNumberToIndiaOrGermany());
  }
}