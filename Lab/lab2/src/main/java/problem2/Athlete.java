package problem2;

/**
 * Class Athlete contains information about an athlete, including athlete's name, their height, weight and league.
 */
public class Athlete {
  private Name athletesName;
  private Double height;
  private Double weight;
  private String league;
  /**
   * Constructs a new athlete, based upon all of the provided input parameters.
   * @param athletesName - object Name, containing athlete's first, middle and last name
   * @param height - athlete's height, expressed as a Double in cm (e.g., 6'2'' is recorded as 187.96cm)
   * @param weight - athlete's weigh, expressed as a Double in pounds (e.g. 125, 155, 200 pounds)
   * @param league - athelete's league, expressed as String
   * Return object Athlete
   */
  public Athlete(Name athletesName, Double height, Double weight, String league) {
    this.athletesName = athletesName;
    this.height = height;
    this.weight = weight;
    this.league = league;
  }
  /**
   * Constructs a new athlete, based upon all of the provided input parameters.
   * @param athletesName - object Name, containing athlete's first, middle and last name
   * @param height - athlete's height, expressed as a Double in cm (e.g., 6'2'' is recorded as 187.96cm)
   * @param weight - athlete's weigh, expressed as a Double in pounds (e.g. 125, 155, 200 pounds)
   * Return object Athlete, with league field set to null
   */
  public Athlete(Name athletesName, Double height, Double weight) {
    this.athletesName = athletesName;
    this.height = height;
    this.weight = weight;
    this.league = null;
  }
  /**
   * Returns athlete's name as an object Name
   * @return athlete's name as an object Name
   */
  public Name getAthletesName() {
    return this.athletesName;
  }
  /**
   * Returns athlete's height as a Double
   * @return athlete's height as a Double
   */
  public Double getHeight() {
    return this.height;
  }
  /**
   * Returns athlete's weight as a Double
   * @return athlete's weight as a Double
   */
  public Double getWeight() {
    return this.weight;
  }
  /**
   * Returns athlete's league as a String
   * @return athlete's league as a String
   */
  public String getLeague() {
    return this.league;
  }
}