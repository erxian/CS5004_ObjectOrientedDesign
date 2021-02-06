package problem2;

import static org.junit.Assert.*;

import org.junit.Before;

public class VideoGameTest {
  private Engineer itMan;
  private Farmer cowBoy;
  private Marine sam;
  private Sniper wane;
  private Pieces[] allPiece;

  @Before
  public void setUp() throws Exception {
    itMan = new Engineer(67.0f, "peter wang" , 25);
    cowBoy = new Farmer(50.50f, "lulu li", 45);
    sam = new Marine(66.0f, "sam louis", 22);
    wane = new Sniper(66.0f, "sam wane", 22);
    allPiece = new Pieces[]{itMan, cowBoy, sam, wane};
  }
}