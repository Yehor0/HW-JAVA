package shops;

import java.util.Random;

public class HomeAppliancesStore extends shop {
    public HomeAppliancesStore() {
        super(new String[]{"Sony", "Samsung", "Sharp", "Apple", "Acer"} , new int[]{100, 80, 70, 300, 40}, new boolean[]{true, true, true, true, true});
    }
}