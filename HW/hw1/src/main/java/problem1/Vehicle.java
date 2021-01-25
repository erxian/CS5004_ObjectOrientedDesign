package problem1;

/**
 *  CS 5004 Spring 2021
 *  Zengping Xu
 *
 * Vehicle is a simple object that has a unique Vehicle Identification Number
 (vIN), and corresponding license plate.
 */
public class Vehicle {
    private Integer vIN;
    private String licensePlate;
    private Owner owner;
    /**
     * Constructor that creates a new vehicle object with the specified vIN and
     * license plate.
     * @param vIN - vIN of the new Vehicle object.
     * @param licensePlate - license plate of the new Vehicle.
     * @param owner - the owner of the new Vehicle
     */
    public Vehicle(Integer vIN, String licensePlate, Owner owner) {
        this.vIN = vIN;
        this.licensePlate = licensePlate;
        this.owner = owner;
    }
    /**
     * Returns the vIN of the Vehicle.
     * @return the vIN of the Vehicle.
     */
    public Integer getVIN() {
        return this.vIN;
    }
    /**
     * Returns the licensePlate of the Vehicle.
     * @return the licensePlate of the Vehicle.
     */
    public String getLicensePlate() {
        return this.licensePlate;
    }
    /**
     * Returns the owner of the Vehicle.
     * @return the owner of the Vehicle.
     */
    public Owner getOwner() {
        return this.owner;
    }
    /**
     * @param vIN - vIN of the Vehicle object.
     * Sets the vIN of the Vehicle.
     */
    public void setVIN(Integer vIN) {
        this.vIN = vIN;
    }
    /**
     * @param licensePlate - license plate of the Vehicle.
     * Sets the licensePlate of the Vehicle.
     */
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    /**
     * @param owner - owner of the Vehicle.
     * Sets the owner of the Vehicle.
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
