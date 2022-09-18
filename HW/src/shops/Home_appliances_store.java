package shops;

import java.util.ArrayList;
import java.util.List;

public class Home_appliances_store extends shop{
    ArrayList array = new ArrayList<>();
    ArrayList<Integer> price = new ArrayList<Integer>(priceTech.length);
    public Home_appliances_store() {
        array.addAll(List.of(product));
        for (int i =0 ; i < priceTech.length; i++) {
            price.add(priceTech[i]);
        }
    }
    public ArrayList getArray() {
        return array;
    }

    public ArrayList<Integer> getPrice() {
        return price;
    }
}
