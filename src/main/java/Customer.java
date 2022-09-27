import java.util.Arrays;

public abstract class Customer extends Person{
    private Clothing[] clothingItem;
    private char size;

    public Customer(String name, Clothing[] clothingItem, char size) {
        super(name);
        this.clothingItem = clothingItem;
        this.size = size;
    }

    public Customer(String name, char size) {
        super(name);
        this.size = size;
    }

    public Clothing[] getClothingItem() {
        return clothingItem;
    }

    public void setClothingItem(Clothing[] clothingItem) {
        this.clothingItem = clothingItem;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "clothingItem=" + Arrays.toString(clothingItem) +
                ", size=" + size +
                '}';
    }
}
