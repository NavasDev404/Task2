//1.1) Create a class Person with properties (name and age) with following features.
//a. Default age of person should be 18;
//b. A person object can be initialized with name and age;
//c. Method to display name and age of person

public class Person {

    public String name;
    public int age;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 18;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;  // Assign to instance variable
        this.age = age;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
