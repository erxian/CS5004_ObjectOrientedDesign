package problem2;

public class Music extends AbstractItem {

  /**
   * Constructor fo the Music Class
   * @param band the band of the Music
   * @param itemTitle the title of the Music
   * @param releasedYear the released year of the Music
   */
  public Music(Band band, String itemTitle, Integer releasedYear) {
    super(band, itemTitle, releasedYear);
  }

  /**
   * Constructor fo the Music Class
   * @param recordingArtist the recordingArtist of the Music
   * @param itemTitle the title of the Music
   * @param releasedYear the released year of the Music
   */
  public Music(RecordingArtist recordingArtist, String itemTitle, Integer releasedYear) {
    super(recordingArtist, itemTitle, releasedYear);
  }

  /**
   * Get the creator of the Music
   *
   * @return the creator of the Music
   */
  @Override
  public Creator getCreator() {
    return super.getCreator();
  }

  /**
   * Get the title of the Music
   *
   * @return the title of the Music
   */
  @Override
  public String getItemTitle() {
    return super.getItemTitle();
  }

  /**
   * Get the released year of the Music
   *
   * @return the released year of the Music
   */
  @Override
  public Integer getReleasedYear() {
    return super.getReleasedYear();
  }

  @Override
  public boolean equals(Object o) {
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public String toString() {
    return "Music{" +
        "Music Creator='" + super.getCreator() + '\'' + ", " +
        "Title='" + super.getItemTitle() + '\'' + ", " +
        "Released Year='" + super.getReleasedYear() +
        '}';
  }
}
