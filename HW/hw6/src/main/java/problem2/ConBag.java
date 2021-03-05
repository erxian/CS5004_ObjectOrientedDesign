package problem2;

import java.util.Objects;

/**
 * ConBag Class holding String elements, can contains duplicates,
 * elements have no order.
 */
public class ConBag implements BagOfWords {
  private String first;
  private BagOfWords rest;

  /**
   * Constructor for ConBag
   * @param first first element in ConBag
   * @param rest the rest elements in Conbag
   */
  public ConBag(String first, BagOfWords rest) {
    this.first = first;
    this.rest = rest;
  }

  /**
   * Is the BagOfWords boolean.
   *
   * @return true if the BagOfWords is empty false otherwise.
   */
  @Override
  public Boolean isEmpty() {
    return false;
  }

  /**
   * Get the size of BagOfWords.
   *
   * @return the size of BagOfWords.
   */
  @Override
  public Integer size() {
    return 1 + this.rest.size();
  }

  /**
   * Add a given word s to BagOfWords according to its alphabetical
   * order, if given word has higher alphabetical than first, it will
   * be added as the new first. If lower, compare to the rest. If given
   * word has duplicates in BagOfWords, it will be added to the tail of
   * the exist duplicates.
   *
   * @param s the given word
   * @return a new BagOfWords contains given word s
   */
  @Override
  public BagOfWords add(String s) {
    // first is smaller.
    if (this.first.compareTo(s) < 0)
      return new ConBag(s, this);
    else // s is smaller
      return new ConBag(this.first, this.rest.add(s));
  }

  /**
   * Check if the BagOfWords contain given word s.
   *
   * @param s the given word
   * @return ture if contains word s false otherwise.
   */
  @Override
  public Boolean contains(String s) {
    if (this.first.equals(s)) return true;
    return this.rest.contains(s);
  }

  @Override
  public int hashCode() {
    int result = 31 * this.size();
    result += Objects.hashCode(this.first);
    return result + this.rest.hashCode();
  }

  /**
   * Every element in ConBag are sorted already, using recursion to
   * compare elements one by one.
   * @param o The Object
   * @return true if two ConBag have same elements(regardless oder),
   * false otherwise.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConBag conBag = (ConBag) o;
    if (!this.size().equals(conBag.size())) return false;
    if (!this.first.equals(conBag.first)) return false;
    // System.out.printf("T: %s, O: %s ", this.first, conBag.first);
    return this.rest.equals(conBag.rest);
  }

  @Override
  public String toString() {
    return "ConBag{"
        + "first=" + this.first
        + ", rest=" + this.rest
        + '}';
  }
}
