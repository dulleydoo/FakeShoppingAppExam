public class Manager extends Employee implements Discountable{
    private final double DISCOUNT = .25;


    public Manager(String name, Clothing[] clothingItem, char size) {
        super(name, clothingItem, size);
    }

    @Override
    public double getDiscount() {
        return DISCOUNT;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "discount=" + DISCOUNT +
                '}';
    }

    @Override
    public double calcDiscount(Clothing clothe) {
        return clothe.getPrice() * DISCOUNT;

    }
    @Override
    public void printEmpPriceAfterDisc(Clothing clothe) {
        System.out.println(clothe.getPrice() - calcDiscount(clothe));
    }
}
