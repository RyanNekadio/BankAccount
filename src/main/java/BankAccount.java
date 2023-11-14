import java.time.LocalDate;
import java.util.OptionalDouble;

public class BankAccount {

//    Bank account properties
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int accountNumber;
    private int balance;

//    Bank account constructor
    public BankAccount(
            String firstName,
            String lastName,
            LocalDate dateOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = 0;
        this.balance = 0;
    }

//    Getters and setters
    public String getFirstName(){
        return this.firstName;
    }

    public String setFirstName(String firstName) {
        this.firstName = firstName;
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String setLastName(String lastName){
        this.lastName = lastName;
        return this.lastName;
    }
}
