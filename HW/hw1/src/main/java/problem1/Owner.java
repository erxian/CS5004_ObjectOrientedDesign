package problem1;

/**
 *  CS 5004 Spring 2021
 *  Zengping Xu
 *
 * Owner means who has this vehicle, including his/her first name,
 * last name and phone-number.
 */

public class Owner {
    private String firstName;
    private String lastName;
    private String phoneNum;
    /**
     * Constructor that creates a new Owner object with the specified
     * firstName, lastName and phoneNum.
     * @param firstName - first name of the Owner object.
     * @param lastName - last name of the Owner object.
     * @param phoneNum - phone number of the Owner object.
     */
    public Owner(String firstName, String lastName, String phoneNum){
        int charValid = 10;
        this.firstName = firstName;
        this.lastName = lastName;
        if (phoneNum.length() == charValid) {
            this.phoneNum = phoneNum;
        } else {
            this.phoneNum = "0";
        }
    }
    /**
     * Returns the name of the Owner.
     * @return the name of the Owner.
     */
    public String getName() {
        return this.lastName + " " + this.firstName;
    }
    /**
     * Returns the phone number of the Owner.
     * @return the phone number of the Owner.
     */
    public String getPhoneNum() {
        return this.phoneNum;
    }
}
