public class Manager extends Employee implements Discountable{
    private final double discount = .25;


    public Manager(String name, Clothing[] clothingItem, char size) {
        super(name, clothingItem, size);
    }

    @Override
    public double getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "discount=" + discount +
                '}';
    }

    @Override
    public double calcDiscount(Clothing clothe) {
        return clothe.getPrice() * getDiscount();

    }
    @Override
    public void printEmpPriceAfterDisc(Clothing clothe) {
        System.out.println(clothe.getPrice() - calcDiscount(clothe));
    }
}
