import java.time.LocalDate;

public class BankAccount {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int accountNumber;
    private int balance;
    private String accountType;
    private int overdraft;

    public BankAccount(String firstName, String lastName, LocalDate dateOfBirth,
                       int accountNumber, String accountType, int overdraft){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.accountType = accountType;
        this.overdraft = overdraft;
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

    public int withdrawl(int amount){
        if(this.balance - amount < this.overdraft){
        return this.balance;
    }
        if(this.balance - amount >= this.overdraft){
            return this.balance - amount;
        }
        return 0;
    }

    public int payInterest(String accountType) {
        if (accountType.equals("Current")){
            return (int) (this.balance + (this.balance * 0.02f));
        }
        if (accountType.equals("Savings")){
            return (int) (this.balance + (this.balance * 0.07f));
        }
        return 0;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public String setAccountType(String accountType){
        return this.accountType = accountType;
    }

    public int getOverdraft(){
        return this.overdraft;
    }

    public int setOverdraft(int overdraft){
        return this.overdraft = overdraft;
    }
}
