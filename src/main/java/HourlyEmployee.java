public class HourlyEmployee extends Employee implements Discountable {
    private final double discount = .1;


    public HourlyEmployee(String name, Clothing[] clothingItem, char size) {
        super(name, clothingItem, size);
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
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
