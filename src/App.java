public class App {
    public static void main(String[] args) throws Exception {

        BankAccount account = new BankAccount("Denise", 500);
        account.deposit(100);

        account.accountInfo();

        BankAccount miku = new BankAccount("Miku", 5000);
        BankAccount gumi = new BankAccount("Gumi", 300);

        miku.withdrawl(100);
        gumi.deposit(100);

        miku.accountInfo();
        gumi.accountInfo();

        Product gas = new Product(4.10, 18, "Gallon of gas");
        gas.productInfo();
        gas.totalCost();
        
    }
}
