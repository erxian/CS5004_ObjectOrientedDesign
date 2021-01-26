package problem3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AmountTest {
    private Amount basic;

    @Before
    public void setUp() throws Exception {
        basic = new Amount(25, 45);
    }

    @Test
    public void getDollar() {
        assertEquals(basic.getDollar(), 25);
    }

    @Test
    public void getCent() {
        assertEquals(basic.getCent(), 45);
    }

    @Test
    public void deposit() {
        Amount firstAmount = new Amount(15, 56);
        Amount newAmount = basic.deposit(firstAmount);
        assertEquals(basic.getDollar(), 25);
        assertEquals(basic.getCent(), 45);
        assertEquals(newAmount.getDollar(), 41);
        assertEquals(newAmount.getCent(), 1);

        Amount secondAmount = new Amount(-5, 120);
        Amount badAmount = basic.deposit(secondAmount);
        assertEquals(basic.getDollar(), 25);
        assertEquals(basic.getCent(), 45);
        assertEquals(badAmount.getDollar(), 25);
        assertEquals(badAmount.getCent(), 45);
    }

    @Test
    public void withdraw() {
        Amount firstAmount = new Amount(10, 50);
        Amount newAmount = basic.withdraw(firstAmount);
        assertEquals(basic.getDollar(), 25);
        assertEquals(basic.getCent(), 45);
        assertEquals(newAmount.getDollar(), 14);
        assertEquals(newAmount.getCent(), 95);

        Amount secondAmount = new Amount(-5, 120);
        Amount badAmount = basic.withdraw(secondAmount);
        assertEquals(basic.getDollar(), 25);
        assertEquals(basic.getCent(), 45);
        assertEquals(badAmount.getDollar(), 25);
        assertEquals(badAmount.getCent(), 45);
    }
}