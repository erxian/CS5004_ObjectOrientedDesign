package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RoomTest {
  private Room single;

  @Before
  public void setUp() throws Exception {
    single = new Room(1, 80.00f, 0);
  }

  @Test (expected = IllegalArgumentException.class)
  public void invalidSetUp() throws IllegalArgumentException {
    Room invalidGuestNum = new Room(2, 76.55f, 1);
  }

  @Test (expected = IllegalArgumentException.class)
  public void invalidPrice() throws IllegalArgumentException {
    Room invalidPrice = new Room(4, -20.00f, 0);
  }

  @Test
  public void getMaxOccupancy() {
    assertEquals(1, single.getMaxOccupancy());
  }

  @Test
  public void getGuestNum() {
    assertEquals(0, single.getGuestNum());
  }

  @Test
  public void isAvailable() throws UnavailableException {
    assertEquals(true, single.isAvailable());
  }

  @Test
  public void bookRoom() throws UnavailableException, InvalidGuestNumException {
    single.bookRoom(1);
    assertEquals(1, single.getGuestNum());
  }

  @Test (expected = UnavailableException.class)
  public void unavailableRoom() throws UnavailableException, InvalidGuestNumException {
    single.bookRoom(1);
    Room room3 =  new Room(2, 80.00f, 0);
    room3.bookRoom(1);
    room3.bookRoom(1);
  }

  @Test (expected = InvalidGuestNumException.class)
  public void overMaxOccupancy() throws UnavailableException, InvalidGuestNumException {
    Room room1 =  new Room(2, 80.00f, 0);
    room1.bookRoom(5);
  }

  @Test (expected = InvalidGuestNumException.class)
  public void belowMinGuestNum() throws UnavailableException, InvalidGuestNumException {
    Room room2 =  new Room(2, 80.00f, 0);
    room2.bookRoom(0);
  }
}