package problem3;

/**
 * CS 5004 Spring 2021
 * Zengping Xu
 *
 * Represents a person with their first name and last name
 *
 */
public class Person {
    private String firstName;
    private String lastName;
    /**
     * Constructs a Person object and initializes it
     * to the given first name, last name
     * @param firstName the first name of this Account
     * @param lastName the last name of this Account
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    /**
     * Get the first name of this Person
     * @return the first name of this person
     */
    public String getFirstName() {
        return this.firstName;
    }
    /**
     * Get the last name of this Person
     * @return the last name of this person
     */
    public String getLastName() {
        return this.lastName;
    }

}