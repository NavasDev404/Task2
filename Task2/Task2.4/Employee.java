public class Employee extends Person {
    // Additional attributes for Employee
    private String employeeID;
    private double salary;

    // Constructor for Employee
    public Employee(String name, int age, String employeeID, double salary) {
        super(name, age); // Call the constructor of the base class Person
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Method to display Employee details
    public void displayEmployeeDetails() {
        // Display Person details using the base class method
        super.displayPersonDetails();
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary:" + salary);
    }
}
