package people;
import shops.Products;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Wife {
    private Products list = new Products();
    protected int price = 0;
    private ArrayList priceAll = new ArrayList();
    private Random rnd = new Random();
    private ArrayList array = new ArrayList<>();
    private ArrayList all = new ArrayList();
    private int y;int u;

    protected ArrayList Give_And_Generate_list() {
        all.addAll(List.of(list.getProduct()));
        all.addAll(List.of(list.getTech()));
        for (int i = 0; i < list.getPricePr().length;i++ ) {
            priceAll.add(list.getPricePr(i));
        }
        for (int i = 0; i < list.getPriceTech().length;i++ ) {
            priceAll.add(list.getPriceTech(i));
        }
        int x = rnd.nextInt(all.size() - 1);
        if (x == 0 ) x = 1;
        for (int i = 0; i < x; i++) {
            y = rnd.nextInt(all.size() -1);
            array.add(all.get(y));
            u = (int) priceAll.get(y);
            price += u;
            all.remove(y);
        }
        return array;
    }
}
