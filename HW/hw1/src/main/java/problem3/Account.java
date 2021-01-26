package problem3;

/**
 * CS 5004 Spring 2021
 * Zengping Xu
 *
 * Represents a BANK customer account with the holder's name
 * and her/his current balance
 *
 */
public class Account {
    private Person person;
    private Amount amount;
    /**
     * Constructs an Account object and initializes it
     * to the given person and amount
     * @param person - the holder's name of this Account
     * @param amount - the current balance of this Account
     */
    public Account(Person person, Amount amount) {
        this.person = person;
        this.amount = amount;
    }
    /**
     * Get the name of this account
     * @return the the name of this account
     */
    public Person getPerson() {
        return this.person;
    }
    /**
     * Get the amount of this account
     * @return the the amount of this account
     */
    public Amount getAmount() {
        return this.amount;
    }
    /**
     * @param number - the deposit Amount
     * deposit number to the amount of this account
     * @return the a new Account after deposite
     */
    public Account deposit(Amount number) {
        Account deepCopy = new Account(
                new Person(this.person.getFirstName(), this.person.getFirstName()),
                this.amount.deposit(number));
        return deepCopy;
    }
    /**
     * @param number - the deposit Amount
     * withdraw number to the amount of this account
     * @return the a new Account after withdraw
     */
    public Account withdraw(Amount number) {
        Account deepCopy = new Account(
                new Person(this.person.getFirstName(), this.person.getFirstName()),
                this.amount.withdraw(number));
        return deepCopy;
    }
}

