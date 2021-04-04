package problem1;

import java.util.List;
import java.util.Objects;

/**
 * Class represents a traveler. The traveler has a first name, last name and a
 * list of destinations they visited in the last year.
 */
public class Traveler implements Comparable<Traveler> {
  private String firstName;
  private String lastName;
  private List<Destination> traveledDestinations;

  /**
   * Constructs a Traveler object and initializes it
   * to the given first name, last name and the list of traveled destinations
   * @param firstName the first name of this person
   * @param lastName the last name of this person
   * @param traveledDestinations list of destinations they visited in the last year.
   */

  public Traveler(String firstName, String lastName, List<Destination> traveledDestinations) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.traveledDestinations = traveledDestinations;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public List<Destination> traveledDestinations() {
    return this.traveledDestinations;
  }

  @Override
  public int compareTo(Traveler otherTraveler) {
    // compare the destination number first and then compare the last name
    if (this.equals(otherTraveler)) return 0;
    if (this.traveledDestinations.size() < otherTraveler.traveledDestinations.size()) {
      return -1;
    } else if (this.traveledDestinations.size() > otherTraveler.traveledDestinations.size()) {
      return 1;
    } else {
      return this.lastName.compareTo(otherTraveler.lastName);
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(getFirstName(), getLastName(), traveledDestinations);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Traveler traveler = (Traveler) o;
    return Objects.equals(getFirstName(), traveler.getFirstName()) &&
        Objects.equals(getLastName(), traveler.getLastName()) &&
        Objects.equals(traveledDestinations, traveler.traveledDestinations);
  }
}