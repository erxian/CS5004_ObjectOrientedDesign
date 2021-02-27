package problem2;

import java.util.Objects;

public class ConsSet implements ISet {
  private Integer first;
  private ISet rest;

  /**
   * Constructor for ConsSet Class.
   * @param first the first element of this Set.
   * @param rest the rest elements of this Set.
   */
  public ConsSet(Integer first, ISet rest) {
    this.first = first;
    this.rest = rest;
  }

  /**
   * Get the first element of this Set.
   * @return the first element of this Set.
   */
  public Integer getFirst() {
    return this.first;
  }

  /**
   * Get the rest of this Set.
   * @return the rest of this Set.
   */
  public ISet getRest() {
    return this.rest;
  }

  /**
   * Is empty boolean.
   *
   * @return the boolean, true if the Set is empty false otherwise.
   */
  @Override
  public Boolean isEmpty() {
    return null;
  }

  /**
   * Add Integer n to Set.
   *
   * @param n Integer need add.
   * @return a new Set contains n.
   */
  @Override
  public ISet add(Integer n) {
    if (this.contains(n)) return this;
    return new ConsSet(n, this);
  }

  /**
   * Check if Set contains Integer n
   *
   * @param n Integer need check
   * @return a boolean, true if contains false otherwise.
   */
  @Override
  public Boolean contains(Integer n) {
    if (this.first.equals(n)) return true;
    return this.rest.contains(n);
  }

  /**
   * Remove the integer n.
   *
   * @param n the Integer need remove.
   * @return a new Set without n.
   */
  @Override
  public ISet remove(Integer n) {
    if (!this.contains(n)) return this;

    if(this.first.equals(n)) {
      return this.rest;
    } else {
      return new ConsSet(this.first, this.rest.remove(n));
    }
  }

  /**
   * Size integer.
   *
   * @return the integer
   */
  @Override
  public Integer size() {
    return 1 + this.rest.size();
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
    ConsSet consSet = (ConsSet) o;
    if (!this.size().equals(consSet.size())) return false;
    if (!consSet.contains(this.first)) return false;

    return this.rest.equals(consSet.remove(this.first));
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
