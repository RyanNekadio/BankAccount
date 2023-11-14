import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//Bank account test class
public class BankAccountTest {
    private BankAccount account;

    @BeforeEach
        public void setUp() {
                account = new BankAccount(
                    "Ryan",
                    "Nekadio",
                    LocalDate.of(1997, 12, 28)
            );
        }

    @Test
    public void canReturnFirstName(){
        assertThat(account.getFirstName()).isEqualTo("Ryan");
    }

    @Test
    public void canSetFirstName(){
        assertThat(account.setFirstName("Ben")).isEqualTo("Ben");
    }

    @Test
    public void canReturnLastFirstName(){
        assertThat(account.getLastName()).isEqualTo("Nekadio");
    }

    @Test
    public void canSetLastName(){
        assertThat(account.setLastName("Adams")).isEqualTo("Adams");
    }

}
