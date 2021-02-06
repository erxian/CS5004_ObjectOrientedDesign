package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FoodOderSystemTest {
  private Meat pork;
  private Rice rice;
  private Vegetable potato;
  private Fruit banana;
  private Pasta emptyPasta;
  private FoodItem[] foodList;

  @Before
  public void setUp() throws Exception {
    pork = new Meat("pig meat", 5.00, 50, 20210204, 20210218);
    rice = new Rice("dongbei rice", 32.0, 200);
    potato = new Vegetable("potato", 0.5, 90, 20210224, 20210210);
    banana = new Fruit("banana", 8.5, 70, 20210204, 20210208);
    emptyPasta = new Pasta("empty pasta", 15.6, 120);
    foodList = new FoodItem[]{pork, rice, potato, banana, emptyPasta};
  }
}