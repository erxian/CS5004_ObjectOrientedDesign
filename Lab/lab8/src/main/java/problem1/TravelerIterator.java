package problem1;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * The type Traveler iterator.
 */
public class TravelerIterator implements Iterator<Traveler>{
  private List<Traveler> travelers;
  private int index;

  /**
   * Instantiates a new Traveler iterator.
   *
   * @param travelers the travelers
   */
  public TravelerIterator(List<Traveler> travelers) {
    this.travelers = travelers;
    this.index = 0;
  }


  @Override
  public boolean hasNext() {
    while (index < travelers.size()) {
      Traveler currentTraveler = this.travelers.get(index);
      // check the current traveler satisfy condition
      if (this.hasTravelOutsideUs(currentTraveler)) {
        return true;
      } else {
        index++;
      }
    }
    return false;
  }

  /**
   *
   * @param currentTraveler current traveler
   * @return true if there is traveler traveled outside of US
   */
  private boolean hasTravelOutsideUs(Traveler currentTraveler) {
    for (Destination destination: currentTraveler.traveledDestinations()) {
      if (!destination.getCountry().equals("US")) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Traveler next() {
    if (this.hasNext()) {
      return this.travelers.get(index++);
    }
    throw new NoSuchElementException("No next traveler!");
  }
}
