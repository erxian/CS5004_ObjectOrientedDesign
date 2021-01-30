package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AthleteTest {
  private Athlete michael;
  private Athlete bubule;
  private Name nameMichael;
  private Name nameBubule;

  @Before
  public void setUp() throws Exception {
    nameMichael = new Name("michael","D","phelps");
    michael = new Athlete(nameMichael, 187.22,160.00, "swimming");

    nameBubule = new Name("bubule", "M", "joe");
    bubule = new Athlete(nameBubule, 180.44, 145.00);

  }

  @Test
  public void getAthletesName() {
    Name althelteName = michael.getAthletesName();
    assertEquals("michael", althelteName.getFirstName());
    assertEquals("D", althelteName.getMiddleName());
    assertEquals("phelps", althelteName.getLastName());

    Name tmpName = bubule.getAthletesName();
    assertEquals("bubule", tmpName.getFirstName());
    assertEquals("M", tmpName.getMiddleName());
    assertEquals("joe", tmpName.getLastName());
  }

  @Test
  public void getHeight() {
    assertEquals(187.22, michael.getHeight(), 0.0);
    assertEquals(180.44, bubule.getHeight(), 0.0);
  }

  @Test
  public void getWeight() {
    assertEquals(160.00, michael.getWeight(), 0.0);
    assertEquals(145.00, bubule.getWeight(), 0.0);
  }

  @Test
  public void getLeague() {
    assertEquals("swimming", michael.getLeague());
    assertEquals(null, bubule.getLeague());
  }
}