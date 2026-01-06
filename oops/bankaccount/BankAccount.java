package bankaccount;

class BankAccount {
    private String accountNumber;
    private double balance;

    // Parameterized constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if(initialBalance >= 0){
            this.balance = initialBalance;
        }
        else{
            this.balance = 0.00;
            System.out.println("Insufficient funds!");
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    // Method to display account details
    public void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.printf("Balance : %.2f\n", balance);
    }
}