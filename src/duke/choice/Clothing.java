package duke.choice;


import java.util.Arrays;

public class Clothing implements Comparable<Clothing> {
    public final static int MIN_PRICE = 10;
    public final static double TAX_RATE = 0.2;

    private String description;
    private double priceExTax;
    private String size = "M";

    public Clothing(String description, double priceExTax, String size) {
        this.setDescription(description);
        this.setPrice(priceExTax);
        this.setSize(size);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return priceExTax + (priceExTax * TAX_RATE);
    }

    public void setPrice(double priceExTax) {
        if (priceExTax < MIN_PRICE) {
            priceExTax = MIN_PRICE;
        }
        this.priceExTax = priceExTax;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Item: " + this.getDescription() + ", Size: " + this.getSize() + ", Price: " + this.getPrice();
    }

    @Override
    public int compareTo(Clothing item) {
        return this.description.compareTo(item.description);
    }
}
