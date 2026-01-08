package employee2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        System.out.print("name = ");
        String name = sc.nextLine();
        System.out.print("employeeId = ");
        int employeeId = sc.nextInt();
        System.out.print("salary = ");
        double salary = sc.nextDouble();
        System.out.print("newSalary = ");
        double newSalary = sc.nextDouble();

        // Create an Employee object
        Employee employee = new Employee(name, employeeId, salary);

        // Get and print the salary
        System.out.printf("Salary : %.2f\n", employee.getSalary());

        // Update the salary
        employee.setSalary(newSalary);

        // Display employee details
        employee.displayEmployeeDetails();

        sc.close();
    }
}
