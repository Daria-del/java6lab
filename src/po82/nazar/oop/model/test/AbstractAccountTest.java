package po82.nazar.oop.model.test;

import org.junit.Test;
import po82.nazar.oop.model.AbstractAccount;
import po82.nazar.oop.model.Account;
import po82.nazar.oop.model.Exceptions.InvalidAccountNumberException;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class AbstractAccountTest {

    Account a;
    Account equal;

    public AbstractAccountTest() throws InvalidAccountNumberException {
        a = new AbstractAccount("787931893712" , LocalDate.now().plusYears(1));
        equal = new AbstractAccount("7031231284124", LocalDate.now().plusYears(1));
    }

    @Test
    public void testToString() {
        System.out.println(a.toString());
    }

    @Test
    public void testEquals() {
        System.out.println(a.equals(equal));
    }

    @Test
    public void testHashCode() {
        System.out.println(a.hashCode());
        System.out.println(equal.hashCode());
    }

}
