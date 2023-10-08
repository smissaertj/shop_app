package duke.choice;

public class Customer {
    private String name;
    private String size;
    private Clothing[] items;

    public Customer(String name, int measurement) {
        this.name = name;
        this.setSize(measurement);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(int measurement) {
        switch (measurement) {
            case 1, 2, 3:
                this.size = "S";
                break;
            case 4, 5, 6:
                this.size = "M";
                break;
            case 7, 8, 9:
                this.size = "L";
                break;
            default:
                this.size = "XL";
        }
    }

    public double getTotalClothingCost() {
        double total = 0;
        for (Clothing item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void addItems(Clothing[] items) {
        this.items = items;
    }

    public Clothing[] getItems() {
        return items;
    }

}