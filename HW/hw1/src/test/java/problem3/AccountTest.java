package problem3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {
    private Account beyonce;

    @Before
    public void setUp() throws Exception {
            beyonce = new Account(new Person("beyonce", "Lee"),
                    new Amount(10000, 50));
    }

    @Test
    public void getPerson() {
        assertEquals(beyonce.getPerson().getFirstName(), "beyonce");
        assertEquals(beyonce.getPerson().getLastName(), "Lee");
    }

    @Test
    public void getAmount() {
        assertEquals(beyonce.getAmount().getDollar(), 10000);
        assertEquals(beyonce.getAmount().getCent(), 50);
    }

    @Test
    public void deposit() {
        Amount firstAmount = new Amount(1, 10);
        Account newAccount = beyonce.deposit(firstAmount);
        assertEquals(beyonce.getAmount().getDollar(), 10000);
        assertEquals(beyonce.getAmount().getCent(), 50);
        assertEquals(newAccount.getAmount().getDollar(), 10001);
        assertEquals(newAccount.getAmount().getCent(), 60);

        Amount secondAmount = new Amount(-5, 120);
        Account sameAccount = beyonce.deposit(secondAmount);
        assertEquals(beyonce.getAmount().getDollar(), 10000);
        assertEquals(beyonce.getAmount().getCent(), 50);
        assertEquals(sameAccount.getAmount().getDollar(), 10000);
        assertEquals(sameAccount.getAmount().getCent(), 50);
    }

    @Test
    public void withdraw() {
        Amount firstAmount = new Amount(1, 10);
        Account newAccount = beyonce.withdraw(firstAmount);
        assertEquals(beyonce.getAmount().getDollar(), 10000);
        assertEquals(beyonce.getAmount().getCent(), 50);
        assertEquals(newAccount.getAmount().getDollar(), 9999);
        assertEquals(newAccount.getAmount().getCent(), 40);

        Amount secondAmount = new Amount(-5, 120);
        Account sameAccount = beyonce.withdraw(secondAmount);
        assertEquals(beyonce.getAmount().getDollar(), 10000);
        assertEquals(beyonce.getAmount().getCent(), 50);
        assertEquals(sameAccount.getAmount().getDollar(), 10000);
        assertEquals(sameAccount.getAmount().getCent(), 50);
    }
}