public abstract class Employee extends Customer{
    private final double DISCOUNT = .10;

    public Employee(String name, Clothing[] clothingItem, char size) {
        super(name, clothingItem, size);
    }

    public double getDiscount() {
        return DISCOUNT;
    }
    public abstract void printEmpPriceAfterDisc(Clothing clothe);//method signatures
}
