package shops;

import java.util.ArrayList;
import java.util.List;

public class Product_shop extends shop{
    shop shop = new shop();
    ArrayList array = new ArrayList<>();
    public Product_shop() {
        shop.discount(50 , true);
        shop.IsNotPresent(true);
        array.addAll(List.of(product));
    }
}