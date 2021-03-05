package problem2;
/**
 * EmptyBag Class is an empty BagOfWords.
 */
public class EmptyBag implements BagOfWords {

  /**
   * Is the BagOfWords boolean.
   *
   * @return true if the BagOfWords is empty false otherwise.
   */
  @Override
  public Boolean isEmpty() {
    return true;
  }

  /**
   * Get the size of BagOfWords.
   *
   * @return the size of BagOfWords.
   */
  @Override
  public Integer size() {
    return 0;
  }

  /**
   * Add a given word s to BagOfWords.
   *
   * @param s the given word
   * @return a new BagOfWords contains given word s
   */
  @Override
  public BagOfWords add(String s) {
    return new ConBag(s, this);
  }

  /**
   * Check if the BagOfWords contain given word s.
   *
   * @param s the given word
   * @return ture if contains word s false otherwise.
   */
  @Override
  public Boolean contains(String s) {
    return false;
  }

  @Override
  public int hashCode() {
    return 31;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || this.getClass() != obj.getClass()) return false;
    return true;
  }

  @Override
  public String toString() {
    return "EmptyBag{}";
  }
}
