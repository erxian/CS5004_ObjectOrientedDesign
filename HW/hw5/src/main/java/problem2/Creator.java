package problem2;

import java.util.Set;

/**
 * A mutable class representing a creator.
 */
public interface Creator {

  /**
   * Get the artists of a band
   * @return the artists of a band
   */
  Set<RecordingArtist> getArtists();

  /**
   * Check if the creator is a band
   * @return True if it is a band, false otherwise.
   */
  boolean isBand();
}
