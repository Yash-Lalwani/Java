package employee;

import java.util.*;

class Employee {
    private int salary; // to store the salary of employee
    
    public String employeeName; // to store the name of employee
    
    // Method to set the employee name as given input
    public void setName(String s) {
        employeeName = s;
    }
    
    // Method to set the salary as given input
    public void setSalary(int val) {
        salary = val;
    }
    
    // Method to get the salary of the employee
    public int getSalary() {
        return salary;
    }
}
