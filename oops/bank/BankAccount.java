package bank;

class BankAccount {
    private String name;
    private double balance;

    public BankAccount (String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdrawal(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance in account");
            return false;
        }
        balance -= amount;
        return true;
    }
}