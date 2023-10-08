package duke.choice;

import java.util.Arrays;

public class ShopApp {
    public static void main(String[] args) {
        double tax = 0.2, total = 0;

        System.out.println("Welcome to Duke Choice Shop!");

        Customer customer = new Customer("Pinky", 3);

        System.out.println("Minimum Price: " + Clothing.MIN_PRICE);

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-shirt", 10.5, "S");
        Clothing[] items = {
                item1,
                item2,
                new Clothing("Green Scarf", 5, "S"),
                new Clothing("Blue T-shirt", 10.5, "S")
        };

        System.out.println("Customer Name: " + customer.getName());

        customer.addItems(items);
        Arrays.sort(customer.getItems()); // Arrays.sort relies on the Comparable interface and compareTo method in the Clothing class.
        for (Clothing item : customer.getItems()) {
            System.out.println(item.toString());
        }

        int avgPrice = 0;
        int count = 0;
        for (Clothing item : customer.getItems()) {
            if (item.getSize().equals("L")) {
                count++;
                avgPrice += item.getPrice();
            }
        }
        try {
            avgPrice = (count == 0) ? 0 : avgPrice / count;
            System.out.println("Average Price: " + avgPrice);

        } catch (ArithmeticException e) {
            System.out.println("Error Calculating Average Price: Don't divide by zero!");
        }
        System.out.println("Total: " + customer.getTotalClothingCost());
    }
}