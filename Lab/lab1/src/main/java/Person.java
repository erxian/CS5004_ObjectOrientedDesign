/**
 * CS 5004 Spring 2021
 * Zengping Xu
 *
 * Represents a Person with their first name and last name
 *
 */
public class Person {
    private String firstName;
    private String lastName;
    /**
     * Constructs a Person object and initializes it
     * to the given first name, last name
     * @param firstName the first name of this person
     * @param lastName the last name of this person
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    /**
     * Get the name of this person
     * @return the name of this person
     */
    public String getName() {
        return this.lastName + " " + this.firstName;
    }
}
