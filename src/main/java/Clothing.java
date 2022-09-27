public class Clothing extends Customer{
    private String description;
    private double price;

    public Clothing(String name, char size, String description, double price) {
        super(name, size);
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return getName();
    }
}
