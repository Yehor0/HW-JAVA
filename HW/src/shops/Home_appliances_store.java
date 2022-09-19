package shops;

import java.util.ArrayList;
import java.util.List;

public class Home_appliances_store extends shop{
    shop shop = new shop();
    ArrayList array = new ArrayList<>();
    public Home_appliances_store() {
        shop.discount(60 , false);
        shop.IsNotPresent(false);
        array.addAll(List.of(product));
    }
}
