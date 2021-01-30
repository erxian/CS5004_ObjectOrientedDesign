package problem2;

/**
 * Class BaseballPlayer contains information about the name, height, weight and league,
 * team, average batting and season home runs of a baseball player.
 */
public class BaseballPlayer extends Athlete {
  private String team;
  private Double averageBatting;
  private Integer seasonHomeRuns;

  /**
   *
   * @param athletesName - object Name, containing athlete's first, middle and last name
   * @param height - athlete's height, expressed as a Double in cm (e.g., 6'2'' is recorded as 187.96cm)
   * @param weight - athlete's weigh, expressed as a Double in pounds (e.g. 125, 155, 200 pounds)
   * @param league - athelete's league, expressed as String
   * @param team - team of baseball player
   * @param averageBatting - average batting of baseball player
   * @param seasonHomeRuns - season home runs of baseball player
   */
  public BaseballPlayer(Name athletesName, Double height, Double weight, String league,
      String team, Double averageBatting, Integer seasonHomeRuns) {
    super(athletesName, height, weight, league);
    this.team = team;
    this.averageBatting = averageBatting;
    this.seasonHomeRuns = seasonHomeRuns;
  }
  /**
   * Return the team of baseball player
   * @return the team of baseball player
   */
  public String getTeam() {
    return team;
  }
  /**
   * Return the average batting of baseball player
   * @return the average batting of baseball player
   */
  public Double getAverageBatting() {
    return averageBatting;
  }
  /**
   * Return the season home runs of baseball player
   * @return the season home runs of baseball player
   */
  public Integer getSeasonHomeRuns() {
    return seasonHomeRuns;
  }
}
