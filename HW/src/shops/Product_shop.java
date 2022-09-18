package shops;

import java.util.ArrayList;
import java.util.List;

public class Product_shop extends shop{
    ArrayList array = new ArrayList<>();
    ArrayList<Integer> price = new ArrayList<Integer>(pricePr.length);
    public Product_shop() {
        array.addAll(List.of(product));
        for (int i =0 ; i < pricePr.length; i++) {
            price.add(pricePr[i]);
        }
    }

    public ArrayList getArray() {
        return array;
    }

    public ArrayList<Integer> getPrice() {
        return price;
    }
}