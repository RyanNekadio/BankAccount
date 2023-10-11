import java.time.LocalDate;

public class BankAccount {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int accountNumber;
    private int balance;

    public BankAccount(String firstName, String lastName, LocalDate dateOfBirth,
                       int accountNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String setFirstName(String name){
        return this.firstName = name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String setLastName(String name) {
        return this.lastName = name;
    }

    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public LocalDate setDateOfBirth(LocalDate dateOfBirth){
        return this.dateOfBirth = dateOfBirth;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public int setAccountNumber(int number) {
        return this.accountNumber = number;
    }

    public int getBalance() {
        return this.balance;
    }

    public int setBalance(int number){
        return this.balance = number;
    }

    public int deposit(int amount) {
        return this.balance += amount;
    }

    public int withdrawal(int amount){
        return this.balance -= amount;
    }

    public double payInterest() {
        return this.balance + (this.balance * 0.05);
    }

}
