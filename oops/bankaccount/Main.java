package bankaccount;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            
        // Input account number and initial balance
        String accountNumber = sc.nextLine();
        double balance = sc.nextDouble();

        // Create a BankAccount object with the use of parameterised constructor
        BankAccount account = new BankAccount(accountNumber, balance);

        // Deposit money
        double addBalance = sc.nextDouble();
        account.deposit(addBalance);

        // Withdraw money
        double withdrawBalance = sc.nextDouble();
        account.withdraw(withdrawBalance);

        // Display account details
        account.displayDetails();

        sc.close(); // Close the scanner
    }
}
