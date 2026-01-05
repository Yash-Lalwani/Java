package student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int rollNumber = sc.nextInt();

        Student stu = new Student();
        stu.setDetails(name, rollNumber);
        stu.displayDetails();
        
        sc.close();
    }
}