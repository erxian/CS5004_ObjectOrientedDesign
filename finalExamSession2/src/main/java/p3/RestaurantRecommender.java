package p3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Class represents a RestaurantRecommender that contains the aggregated statistics of guests who
 * have visited Restaurants.
 */
public class RestaurantRecommender {

  /**
   * Map of the aggregated restaurant statistics. Map Key is a Restaurant object, and it's corresponding
   * Value is the number of guests who have visited that restaurant.
   */
  private Map<Restaurant, Integer> restaurantStatistics;

  /**
   * Starting integer value inserted into the Map when counting guests.
   */
  private static final Integer START_VALUE = 1;


  /**
   * RestaurantRecommender Constructor.
   */
  public RestaurantRecommender() {
    restaurantStatistics = new HashMap<>();
  }

  /**
   * Restaurant Recommender Constructor
   * @param restaurantStatistics Input aggregated restaurant statistics
   */
  public RestaurantRecommender(Map<Restaurant, Integer> restaurantStatistics) {
    this.restaurantStatistics = restaurantStatistics;
  }

  /**
   * Method returns a map of aggregated restaurant statistics based on a specified input list of guests.
   * Map Key is a Restaurant object, and it's corresponding Value is the number of guests who
   * have visited that restaurant.
   * @param guests A list of Guest objects.
   * @return Map of the aggregated restaurant statistics. Map Key is a Restaurant object, and it's corresponding
   * Value is the number of guests who have visited that restaurant.
   */
  public Map<Restaurant, Integer> getAggregatedStatistics(List<Guest> guests) {
    Map<Restaurant, Integer> resultingMap = new HashMap<>();

    // Null and size check
    if(guests == null || guests.size() == 0) {
      return resultingMap;
    }

    for(Guest guest : guests) {
      for (Restaurant restaurant : guest.getVisitedRestaurant()) {
        if(!resultingMap.containsKey(restaurant)) {
          resultingMap.put(restaurant, START_VALUE);
        } else {
          resultingMap.put(restaurant, resultingMap.get(restaurant) + START_VALUE);
        }
      }
    }
    this.restaurantStatistics = resultingMap;
    return resultingMap;
  }

  /**
   * Method returns the most visited recommended Restaurant based on that Restaurant being the most
   * frequently visited Restaurant.
   * @return Restaurant, representing the most visited Restaurant to be recommended. Returns null
   * if no Restaurants have been visited.
   */
  public Restaurant recommendMostVisitedRestaurant() {
    // Return null if no restaurant stats available.
    if (this.restaurantStatistics.size() == 0) {
      return null;
    }

    Restaurant mostVisited = null;
    Integer numOfVisits = Integer.MIN_VALUE;

    for(Map.Entry<Restaurant, Integer> entry : this.restaurantStatistics.entrySet()) {
      if(entry.getValue() > numOfVisits) {
        mostVisited = entry.getKey();
        numOfVisits = entry.getValue();
      }
    }
    return mostVisited;
  }

  /**
   * Method returns the most highly rated Restaurant for the cousine provided.
   * @param cuisine attribute defining the dominant cuisine offered by the restaurant
   * @return Restaurant, representing the most highly rated Restaurant to be recommended.
   * Returns null if no Restaurants have been visited.
   */
  public Restaurant recommendHighlyRatedRestaurant(String cuisine) {
    // Return null if no restaurant stats available.
    if(this.restaurantStatistics.size() == 0) {
      return null;
    }

    Restaurant highlyRated = null;
    Float highestRate = Float.MIN_VALUE;

    for(Map.Entry<Restaurant, Integer> entry : this.restaurantStatistics.entrySet()) {
      if(entry.getKey().getCuisine().equals(cuisine) &&
          entry.getKey().getRating() > highestRate) {
        highlyRated = entry.getKey();
        highestRate = entry.getKey().getRating();
      }
    }
    return highlyRated;
  }

  /**
   * Compare two RestaurantRecommender Objects for equality.
   * @param o Another RestaurantRecommender
   * @return true if objects are equal, false otherwise.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof RestaurantRecommender)) {
      return false;
    }
    RestaurantRecommender that = (RestaurantRecommender) o;
    return Objects.equals(restaurantStatistics, that.restaurantStatistics);
  }

  /**
   * Returns integer hashCode of the Object.
   * @return Integer hashCode of the Object.
   */
  @Override
  public int hashCode() {
    return Objects.hash(restaurantStatistics);
  }

  /**
   * String representation of a RestaurantRecommender Object.
   * @return String representation of a RestaurantRecommender Object.
   */
  @Override
  public String toString() {
    return "RestaurantRecommender{" +
        "restaurantStatistics=" + restaurantStatistics +
        '}';
  }
}