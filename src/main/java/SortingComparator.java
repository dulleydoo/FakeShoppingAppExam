import java.util.Comparator;

public class SortingComparator implements Comparator<Clothing> {
    @Override
    public int compare(Clothing clothingItem1, Clothing clothingItem2) {
        if(clothingItem1.getPrice() > clothingItem2.getPrice()){
            return 1;
        }
        return -1;
    }
}
