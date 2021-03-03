package problem1;

public class ConPriorityQueue implements PriorityQueue {
  private Element first;
  private PriorityQueue rest;

  public ConPriorityQueue(Element first, PriorityQueue rest) {
    this.first = first;
    this.rest = rest;
  }
  /**
   * Is empty boolean.
   *
   * @return the boolean, true if PQ is empty false otherwise.
   */
  @Override
  public Boolean isEmpty() {
    return false;
  }

  /**
   * Add the given element to priority queue.
   *
   * @param priority the priority
   * @param value    the value
   * @return a copy of priority queue contains given element.
   */
  @Override
  public PriorityQueue add(Integer priority, String value) {
    if (this.first.getPriority() < priority) {
      Element newElement = new Element(priority, value);
      return new ConPriorityQueue(newElement, this);
    } else {
      return new ConPriorityQueue(this.first, this.rest.add(priority, value));
    }
  }

  /**
   * Return the value in the PQ that has the highest priority.
   *
   * @return the value in the PQ that has the highest priority.
   */
  @Override
  public String peek() {
    return this.first.getValue();
  }


  /**
   * remove the element with the highest priority.
   *
   * @return a copy of the PQ without the element with the highest priority
   */
  @Override
  public PriorityQueue pop() {
    return this.rest;
  }

  /**
  public static void main(String args[]) {
    EmptyPriorityQueue emptyPriorityQueue = new EmptyPriorityQueue();
    PriorityQueue newPQ = emptyPriorityQueue.add(5, "aaa");
    newPQ = newPQ.add(2, "bbb");
    newPQ = newPQ.add(10, "ccc");
    newPQ = newPQ.add(6, "ddd");
    newPQ = newPQ.add(3, "eee");
    newPQ = newPQ.add(6, "fff");

    while(!newPQ.isEmpty()) {
      System.out.printf("%s ", newPQ.peek());
      newPQ = newPQ.pop();
    }
  }**/
}
