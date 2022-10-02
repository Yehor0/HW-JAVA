package shops;

import java.util.Random;

public class ProductShop extends shop {
    public ProductShop() {
        super(new String[]{"Bread", "Sausage", "Butter", "Milk", "Potato"}, new int[]{110, 80, 70, 300, 40} , new boolean[]{true, true, true, true, true});
    }
}