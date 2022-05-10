public class BankAccount {
    private String accountHolder;
    private double accountBalance;

    public BankAccount (String accountHolder, double accountBalance) {
        this.accountBalance = accountBalance;
        this.accountHolder = accountHolder;
    }

    public double deposit(double depositAmount) {
        return accountBalance += depositAmount;
    }

    public double withdrawl(double withdrawlAmount) {
        return accountBalance -= withdrawlAmount;
    }

    public void accountInfo() {
        System.out.println("Account Holder: " + this.accountHolder + " Account Balance: " + this.accountBalance);
    }
}