package problem2;

import java.util.Objects;

public class ConBag implements BagOfWords {
  private String first;
  private BagOfWords rest;

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
   * Add a given word s to BagOfWords.
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

  /**
  @Override
  public String peek() {
    return this.first;
  }


  @Override
  public BagOfWords remove() {
    return this.rest;
  }

  public static void main(String args[]) {
    BagOfWords bagOfWords = BagOfWords.emptyBagOfWords();
    BagOfWords newBag = bagOfWords.add("cat");
    newBag = newBag.add("dog");
    newBag = newBag.add("cat");
    newBag = newBag.add("woof");
    newBag = newBag.add("dog");
    newBag = newBag.add("cat");
    newBag = newBag.add("chicken");
    newBag = newBag.add("woof");


    BagOfWords another = BagOfWords.emptyBagOfWords();
    BagOfWords anNew = another.add("chicken");
    anNew = anNew.add("cat");
    anNew = anNew.add("woof");
    anNew = anNew.add("dog");
    anNew = anNew.add("dog");
    anNew = anNew.add("cat");
    anNew = anNew.add("woof");
    //anNew = anNew.add("ele");


    while(!newBag.isEmpty()) {
      System.out.printf("%s ", newBag.peek());
      newBag = newBag.remove();
    }

    System.out.printf("\n");

    while(!anNew.isEmpty()) {
      System.out.printf("%s ", anNew.peek());
      anNew = anNew.remove();
    }

    System.out.printf("\n");
    System.out.printf("%b", newBag.equals(anNew));
  }**/
}
