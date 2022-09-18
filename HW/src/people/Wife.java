package people;
import shops.Products;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Wife {
    Products list = new Products();
    private int price = 0;
    ArrayList priceAll = new ArrayList();
    Random rnd = new Random();
    private ArrayList array = new ArrayList<>();
    private ArrayList all = new ArrayList();
    private int y;

    protected ArrayList Give_And_Generate_list() {
        all.addAll(List.of(list.getProduct()));
        all.addAll(List.of(list.getTech()));
        for (int i = 0; i < list.getPricePr().length; i++) {
            priceAll.add(list.getPricePr()[i]);
        }
        for (int i = 0; i < list.getPriceTech().length; i++) {
            priceAll.add(list.getPriceTech()[i]);
        }
        int x = rnd.nextInt(all.size() - 1) + 1;
        for (int i = 0; i < x; i++) {
            y = rnd.nextInt(all.size() - 1) + 1;
            this.array.add(all.get(y));
            this.price += (int) priceAll.get(i);
            all.remove(y);
        }
        return array;
    }
}
