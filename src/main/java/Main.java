import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ShopApp shopApp = new ShopApp();

        Clothing shirt = new Clothing("polo shirt", 'S', "tight fit", 49.99);
        Clothing pants = new Clothing("polo pants", 'M', "loose fit", 59.99);
        Clothing boxers = new Clothing("polo boxers", 'M', "compressions", 19.99);

        Clothing[] managerCart = {shirt, pants, boxers};
        Manager manager1 = new Manager("Steve", managerCart, 'M');


        Clothing[] employeeCart = {shirt, pants, boxers,};
        HourlyEmployee employee1 = new HourlyEmployee("Josh", employeeCart, 'M');

        System.out.println(shopApp.calcTotal(managerCart));

        System.out.println("This " + shirt + " is " + shopApp.isAFit(manager1, shirt));

        employee1.printEmpPriceAfterDisc(shirt);
        employee1.printEmpPriceAfterDisc(pants);

        manager1.printEmpPriceAfterDisc(shirt);
        manager1.printEmpPriceAfterDisc(pants);

        ArrayList<Clothing> listOfClothes = new ArrayList<>();
        listOfClothes.add(shirt);
        listOfClothes.add(pants);
        listOfClothes.add(boxers);

        for (Clothing clothes : listOfClothes) {
            System.out.println(clothes);
        }

        shopApp.printEmployeeName(employee1);
        shopApp.printEmployeeName(manager1);
    }
}
