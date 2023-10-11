import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    BankAccount account = new BankAccount("Ryan", "Nekadio",
            LocalDate.of(1997, 12, 28), 12345678);

    @Test
    public void canReturnFirstName(){
        String result = account.getFirstName();
        String expected = "Ryan";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetFirstName(){
        String result = account.setFirstName("Ash");
        String expected = "Ash";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canReturnLastName(){
        String result = account.getLastName();
        String expected = "Nekadio";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetLastName(){
        String result = account.setLastName("Ketchum");
        String expected = "Ketchum";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canReturnDateOfBirth(){
        LocalDate result = account.getDateOfBirth();
        LocalDate expected = LocalDate.of(1997, 12, 28);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetDateOfBirth(){
        LocalDate result = account.setDateOfBirth(LocalDate.of(2000, 5, 13));
        LocalDate expected = LocalDate.of(2000, 5, 13);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canReturnAccountNumber(){
        int result = account.getAccountNumber();
        int expected = 12345678;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetAccountNumber(){
        int result = account.setAccountNumber(24681012);
        int expected = 24681012;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canReturnBalance(){
        int result = account.getBalance();
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetBalance(){
        int result = account.setBalance(200);
        int expected = 200;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canReturnDeposit(){
        int result = account.deposit(90);
        int expected = 90;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canReturnWithdrawal(){
        account.deposit(90);
        int result = account.withdrawal(50);
        int expected = 40;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canReturnPayInterest(){
        account.deposit(600);
        double result = account.payInterest();
        double expected = 630;
        assertThat(result).isEqualTo(expected);
    }

}
