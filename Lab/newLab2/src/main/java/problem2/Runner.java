package problem2;

/**
 * Class Runner contains information about name, height, weight and league,
 * best 5k times, best half-marathon time, and Favorite running event of runner
 */
public class Runner extends Athlete {
  private Double best5Ktime;
  private Double bestHMtime;
  private String favorEvent;
  /**
   *
   * @param athletesName - object Name, containing athlete's first, middle and last name
   * @param height - athlete's height, expressed as a Double in cm (e.g., 6'2'' is recorded as 187.96cm)
   * @param weight - athlete's weigh, expressed as a Double in pounds (e.g. 125, 155, 200 pounds)
   * @param league - athelete's league, expressed as String
   * @param best5Ktime - The best 5K time of runner
   * @param bestHMtime - The best half-marathon time of runner
   * @param favorEvent - The Favorite running event of runner
   */
  public Runner(Name athletesName, Double height, Double weight, String league,
      double best5Ktime, double bestHMtime, String favorEvent) {
    super(athletesName, height, weight, league);
    this.best5Ktime = best5Ktime;
    this.bestHMtime = bestHMtime;
    this.favorEvent = favorEvent;
  }
  /**
   * Return the best 5K time of runner
   * @return the best 5K time of runner
   */
  public Double getBest5Ktime() {
    return best5Ktime;
  }

  /**
   * Return the best half-marathon time of runner
   * @return the best half-marathon time of runner
   */
  public Double getBestHMtime() {
    return bestHMtime;
  }

  /**
   *  Return the Favorite running event of runner
   * @return the Favorite running event of runner
   */
  public String getFavorEvent() {
    return favorEvent;
  }
}