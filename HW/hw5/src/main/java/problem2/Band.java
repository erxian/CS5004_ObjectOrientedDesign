package problem2;

import java.util.Objects;
import java.util.Set;

public class Band implements Creator {
  private String bandName;
  private Set<RecordingArtist> recordingArtists;

  /**
   * Constructor for the Band class.
   * @param bandName the name of the Band
   * @param recordingArtists the recordingArtists of the Band
   */
  public Band(String bandName, Set<RecordingArtist> recordingArtists) {
    this.bandName = bandName;
    this.recordingArtists = recordingArtists;
  }

  /**
   * Return the name of the Band
   * @return the name of the Band
   */
  public String getBandName() {
    return this.bandName;
  }

  /**
   * Return the recordingArtists of the Band
   * @return the recordingArtists of the Band
   */
  public Set<RecordingArtist> getRecordingArtists() {
    return this.recordingArtists;
  }

  /**
   * Get the creator of the item
   *
   * @return the creator of the item
   */
  @Override
  public Set<RecordingArtist> getArtists() {
    return this.getRecordingArtists();
  }

  @Override
  public boolean isBand(){
    return true;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Band that = (Band) o;
    return Objects.equals(getBandName(), that.getBandName()) &&
        Objects.equals(getRecordingArtists(), that.getRecordingArtists());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getBandName(), getRecordingArtists());
  }

  @Override
  public String toString() {
    return "RecordingArtist{" +
        "bandName='" + bandName + '\'' + ", " +
        "recordingArtists='" + recordingArtists + '\'' +
        '}';
  }
}
