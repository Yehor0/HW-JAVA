package people;
import java.util.Random;
import java.util.ArrayList;

public class Wife {
    Random rnd = new Random();
    private int y;
    private String[] all = {"Bread" , "Sausage" , "Butter" , "Milk" , "Potato" , "Sony" , "Samsung" , "Sharp" , "Apple" , "Acer"};
    public void GiveListForBuy() {
        ArrayList array = new ArrayList<>();
        int x = rnd.nextInt(all.length - 1) + 1;
        for (int i = 0;i <= x ;i++) {
            y = rnd.nextInt(all.length - 1) + 1;
            array.add(all[y]);
        }
        for (int i =0; i <= array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}