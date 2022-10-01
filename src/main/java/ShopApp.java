import java.util.ArrayList;
import java.util.Collections;

public class ShopApp {
    public static double calcTotal(Clothing[] clothes) {
        int i;
        double total = 0.0;
        for (i = 0; i < clothes.length-1; i++) {
            total += clothes[i].getPrice();
        }return total;
    }
    public static boolean isAFit(Customer customer, Clothing clothe){
        if (customer.getSize() == clothe.getSize()) {
            return true;
        }
            return false;
        }

    public static void sortAndPrintClothingByPrice(ArrayList<Clothing> clothe){
        //sort
        Collections.sort(clothe, new SortingComparator());
        for(Clothing c: clothe){
            System.out.println(c.getPrice());
        }
        //Collections.sort(clothe);
        //loop through and printing the price for each one


    }
    public static void printEmployeeName(Employee employee){
        System.out.println(employee.getName());

    }
    public static void discAmtOff(Discountable[] discountables, Clothing clothe){
        for (int i = 0; i < discountables.length;i++ )
            System.out.println(discountables[i].calcDiscount(clothe));

    }


}
