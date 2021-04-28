package p2;

import java.util.Iterator;
import java.util.List;

/**
 * The type Traveler iterator.
 */
public class TravelerIterator implements Iterator<Traveler> {
  private static final int FIVE = 5;

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

  /**
   *
   * @param currentTraveler current traveler
   * @return true if there is traveler traveled more than 5 times in
   * the last three years
   */
  private boolean hasTraveledOverFiveTimes(Traveler currentTraveler) {
    if (currentTraveler.traveledDestinations().size() > FIVE) {
      return true;
    }
    return false;
  }

  @Override
  public boolean hasNext() {
    if (this.index >= this.travelers.size())
      return false;
    else if (this.hasTraveledOverFiveTimes(travelers.get(index)))
      return true;
    else {
      this.index++;
      return this.hasNext();
    }
  }

  @Override
  public Traveler next() {
    Traveler next = this.travelers.get(index);
    this.index++;
    return next;
  }
}