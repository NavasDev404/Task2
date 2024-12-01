public class Person {
    // Attributes
    protected String name;
    protected int age;

    // Constructor for Person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display Person details
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
