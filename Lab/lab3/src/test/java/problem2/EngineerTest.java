package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EngineerTest {
  private Engineer itMan;

  @Before
  public void setUp() throws Exception {
    itMan = new Engineer(67.0f, "peter wang" , 25);
  }

  @Test
  public void getWealth() {
      assertEquals(67.0f, itMan.getWealth(), 0.0);
  }

  @Test
  public void addWealth() {
    double addNum = 10.25f;
    itMan.addWealth(addNum);
    assertEquals(77.25f, itMan.getWealth(), 0.0);
  }

  @Test
  public void decreaseWealth() {
    double deNum = 20.00f;
    itMan.decreaseWealth(deNum);
    assertEquals(47.0f, itMan.getWealth(), 0.0);
  }
}