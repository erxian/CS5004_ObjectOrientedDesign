package p2;

import java.util.Comparator;
import java.util.stream.Collectors;

public class CanadaTripComparator implements Comparator<Traveler> {
  private static final String CANADA = "Canada";

  @Override
  /**
   * Compares its two arguments for order.  Returns a negative integer, zero, or a positive integer
   * as the first argument is less than, equal to, or greater than the second.
   */
  public int compare(Traveler t1, Traveler t2) {
    return compareByCanadaTripNum(t1, t2);
  }

  /**
   * Helper method to determine between travelers who has larger trip number traveled to
   * canada in the last three years
   * @param t1 t1 Traveler Object
   * @param t2 t2 Traveler Object
   * @return the Returns -1 if t1 travel trip number to canada is less than t2's, 0 if equal, and 1 otherwise.
   */
  private int compareByCanadaTripNum(Traveler t1, Traveler t2) {
    Integer traveler1ToCanada = this.tripNumberToCanada(t1);
    Integer traveler2ToCanada = this.tripNumberToCanada(t2);

    return traveler1ToCanada.compareTo(traveler2ToCanada);
  }

  /**
   * Helper method to determine the trip number a traveler has traveled to
   * canada in the last three years.
   * @param t Travel Object
   * @return the trip number to canada
   */
  private int tripNumberToCanada(Traveler t) {
    //Null & Size check
    if (t == null || t.traveledDestinations() == null || t.traveledDestinations().size() == 0) {
      return 0;
    }

    return t.traveledDestinations().stream()
        .filter(x -> x.getDestinationName().equals(CANADA))
        .collect(Collectors.toList())
        .size();
  }
}

