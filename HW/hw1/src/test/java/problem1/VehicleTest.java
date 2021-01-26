package problem1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleTest {
    private Vehicle vehicle;

    @Before
    public void setUp() throws Exception {
        vehicle = new Vehicle(1897, "BJ8888",
                    new Owner("evelyn", "xu", "8781498988"));
    }

    @Test
    public void getVIN() {
        assertEquals(vehicle.getVIN().longValue(), 1897);
    }

    @Test
    public void getLicensePlate() {
        assertEquals(vehicle.getLicensePlate(), "BJ8888");
    }

    @Test
    public void getOwner() {
        assertEquals(vehicle.getOwner().getName(), "xu evelyn");
        assertEquals(vehicle.getOwner().getPhoneNum(), "8781498988");
    }

    @Test
    public void setVIN() {
        vehicle.setVIN(10001);
        assertEquals(vehicle.getVIN().longValue(), 10001);
    }

    @Test
    public void setLicensePlate() {
        vehicle.setLicensePlate("BJ6666");
        assertEquals(vehicle.getLicensePlate(), "BJ6666");
    }

    @Test
    public void setOwner() {
        vehicle.setOwner(new Owner("wane", "bruce", "1234567890"));
        assertEquals(vehicle.getOwner().getName(), "bruce wane");
        assertEquals(vehicle.getOwner().getPhoneNum(), "1234567890");
        vehicle.setOwner(new Owner("jimmy", "cho", "66789"));
        assertEquals(vehicle.getOwner().getName(), "cho jimmy");
        assertEquals(vehicle.getOwner().getPhoneNum(), "0");
    }
}