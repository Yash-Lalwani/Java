package employee2;

public class Employee {
    public String name;
    protected int employeeId;
    private double salary;

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Invalid salary");
            this.salary = 0;
            return;
        }
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public Employee (String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        if (salary < 0) {
            this.salary = 0.0;
            System.out.println("Invalid salary");
        }
        else {
            this.salary = salary;
        }
    }

    public void displayEmployeeDetails() {
        System.out.println("Name : " + name);
        System.out.println("Employee Id : " + employeeId);
        System.out.printf("Salary : %.2f\n" , salary);
    }
}