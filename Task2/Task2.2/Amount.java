import java.util.Scanner;

public class Amount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5]; // Array to store product objects

        // Accepting product information from the user
        System.out.println("Enter details for 5 products:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Product ID: ");
            int pid = scanner.nextInt();
            System.out.print("Enter Product Price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter Product Quantity: ");
            int quantity = scanner.nextInt();

            products[i] = new Product(pid, price, quantity); // Create a new Product object
        }

        // Find the product with the highest price
        int highestPricePid = findHighestPricePid(products);
        System.out.println("Product ID with the highest price: " + highestPricePid);

        // Calculate and display the total amount spent
        double totalAmountSpent = calculateTotalAmountSpent(products);
        System.out.println("Total amount spent on all products: " + totalAmountSpent);
    }

    // Method to find the product ID with the highest price
    public static int findHighestPricePid(Product[] products) {
        double maxPrice = 0;
        int pid = -1;

        for (Product product : products) {
            if (product.price > maxPrice) {
                maxPrice = product.price;
                pid = product.pid;
            }
        }
        return pid;
    }

    // Method to calculate the total amount spent on all products
    public static double calculateTotalAmountSpent(Product[] products) {
        double total = 0;

        for (Product product : products) {
            total += product.price * product.quantity; // Total spent on each product
        }
        return total;
    }
}
