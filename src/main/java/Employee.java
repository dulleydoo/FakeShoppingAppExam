public abstract class Employee extends Customer{
    private final double discount = .1;

    public Employee(String name, Clothing[] clothingItem, char size) {
        super(name, clothingItem, size);
    }

    public double getDiscount() {
        return discount;
    }
    public abstract void printEmpPriceAfterDisc(Clothing clothe);
}
