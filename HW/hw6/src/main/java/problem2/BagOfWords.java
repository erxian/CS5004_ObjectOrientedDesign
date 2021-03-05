package problem2;

/**
 * The interface BagOfWords. A BagOfWords is a data container, holding
 * Strings (words). A BagOfWords can contain duplicates, and Strings(words)
 * have no order.
 */
public interface BagOfWords {

  /**
   * Empty bag of BagOfWords.
   *
   * @return the EmptyBag.
   */
  static BagOfWords emptyBagOfWords() {
    return new EmptyBag();
  }

  /**
   * Is the BagOfWords boolean.
   *
   * @return true if the BagOfWords is empty false otherwise.
   */
  Boolean isEmpty();

  /**
   * Get the size of BagOfWords.
   *
   * @return the size of BagOfWords.
   */
  Integer size();

  /**
   * Add a given word s to BagOfWords.
   *
   * @param s the given word
   * @return a new BagOfWords contains given word s
   */
  BagOfWords add(String s);

  /**
   * Check if the BagOfWords contain given word s.
   *
   * @param s the given word
   * @return ture if contains word s false otherwise.
   */
  Boolean contains(String s);

  /**
  String peek();

  BagOfWords remove();
   */

}
