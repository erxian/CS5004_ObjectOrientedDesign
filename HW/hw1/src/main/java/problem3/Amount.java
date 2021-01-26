package problem3;

/**
 * CS 5004 Spring 2021
 * Zengping Xu
 *
 * Represents the current account balance
 *
 */
public class Amount {
    private int dollar;
    private int cent;
    /**
     * Constructs a Amount object and initializes it
     * to the given dollar amount and cent amount
     * @param dollar - the dollar amount of this Amount
     * @param cent - the cent amount of this Amount
     */
    public Amount(int dollar, int cent) {
        int min = 0;
        int maxCent = 99;
        if (dollar < min) {
            this.dollar = 0;
        } else {
            this.dollar = dollar;
        }
        if (cent > maxCent) {
            this.cent = 0;
        } else {
            this.cent = cent;
        }
    }
    /**
     * Get the dollar amount of this Amount
     * @return the dollar amount of this Amount
     */
    public int getDollar() {
        return this.dollar;
    }
    /**
     * Get the cent amount of this Amount
     * @return the cent amount of this Amount
     */
    public int getCent() {
        return this.cent;
    }
    /**
     * @param amount - the deposit amount
     * @return the amount after deposit
     */
    public Amount deposit(Amount amount) {
        int maxCent = 99;
        int dollarToCent = 100;
        if (amount.getCent() + this.cent > maxCent) {
            Amount deepCopy = new Amount(amount.getDollar() + this.dollar + 1,
                    amount.getCent() + this.cent - dollarToCent);
            return deepCopy;
        } else {
            Amount deepCopy = new Amount(amount.getDollar() + this.dollar,
                    amount.getCent() + this.cent);
            return deepCopy;
        }
    }
    /**
     * @param amount - the withdraw amount
     * @return the amount after withdraw
     */
    public Amount withdraw(Amount amount) {
        int min = 0;
        int dollarToCent = 100;
        if (this.cent - amount.cent < min) {
            Amount deepCopy = new Amount(this.dollar - amount.getDollar() -1,
                    dollarToCent + this.cent - amount.getCent());
            return deepCopy;
        } else {
            Amount deepCopy = new Amount(this.dollar - amount.getDollar(),
                    this.cent - amount.getCent());
            return deepCopy;
        }
    }
}
