package bank;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        BankAccount ba1 = new BankAccount("Yash", 1000);
        System.out.println("Name on the Acc. : " + ba1.getName());
        System.out.println("Balance : " + ba1.getBalance());
         
        ba1.setName(name);
        ba1.deposit(1500);

        System.out.println("New Name on the Acc. : " + ba1.getName());
        System.out.println("updated Balance : " + ba1.getBalance());

        ba1.withdrawal(500);
        System.out.println("updated Balance : " + ba1.getBalance());

        sc.close();
    }
}