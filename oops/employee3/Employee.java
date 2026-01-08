package employee3;

public class Employee {
    protected String name;
    protected int id;

    // Constructor for Employee
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
    }
}