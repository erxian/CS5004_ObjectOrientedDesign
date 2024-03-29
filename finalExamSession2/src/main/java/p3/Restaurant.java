package p3;
import java.util.Objects;

/**
 * Class Restaurant contains information about restaurant.
 */
public class Restaurant {

  private String restaurantName;
  private String address;
  private String cuisine;
  private Float rating;

  /**
   * Constructor for object Restaurant.
   * @param restaurantName - restaurant name, as a String
   * @param address - restaurant address, as a String
   * @param cuisine - attribute defining the dominant cuisine offered
   * by the restaurant
   * @param rating - attribute defining the average customer rating of the restaurant over the last year
   */
  public Restaurant(String restaurantName, String address,
                    String cuisine, Float rating) {
    this.restaurantName = restaurantName;
    this.address = address;
    this.cuisine = cuisine;
    this.rating = rating;
  }

  /**
   * Getter for parameter restaurantsName.
   * @return restaurantsName - String, representing a restaurant's name */
  public String getRestaurantName() {
    return restaurantName;
  }

  /**
   * Getter for parameter address.
   * @return address - String, representing a restaurant's address */
  public String getAddress() {
    return address;
  }

  /**
   * Getter for parameter cuisine.
   * @return cuisine - String representing the dominant
   * cuisine offered by the restaurant */
  public String getCuisine() {
    return cuisine;
  }

  /**
   * Getter for parameter rating.
   * @return rating - Float the average customer rating of the restaurant over the last year
   */
  public Float getRating() {
    return rating;
  }


  /**
   * Compare two Restaurant Objects for equality.
   * @param o Another Restaurant.
   * @return true if objects are equal, false otherwise.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Restaurant)) {
      return false;
    }
    Restaurant that = (Restaurant) o;
    return Objects.equals(getRestaurantName(), that.getRestaurantName()) &&
        Objects.equals(getAddress(), that.getAddress()) &&
        Objects.equals(getCuisine(), that.getCuisine()) &&
        Float.compare(getRating(), that.getRating()) == 0;
  }

  /**
   * Returns integer hashCode of the Object.
   * @return Integer hashCode of the Object.
   */
  @Override
  public int hashCode() {
    return Objects.hash(getRestaurantName(), getAddress(), getCuisine(), getRating());
  }

  /**
   * String representation of a Restaurant Object.
   * @return String representation of a Restaurant Object.
   */
  @Override
  public String toString() {
    return "Restaurant{" +
        "restaurantName='" + restaurantName + '\'' +
        ", address='" + address + '\'' +
        ", cuisine='" + cuisine + '\'' +
        ", rating='" + String.valueOf(rating) + '\'' +
        '}';
  }
}
