package people;
import shops.Product;

import java.util.Random;
import java.util.ArrayList;

public class Wife {
    private String[] product = {"Bread" , "Sausage" , "Butter" , "Milk" , "Potato" , "Sony" , "Samsung" , "Sharp" , "Apple" , "Acer"};
    private int[] price = {110 , 80 , 70 , 300 , 40 , 100 , 80 ,70 , 300 , 40};
    protected int AllPrice = 0;
    private Random rnd = new Random();
    private ArrayList array = new ArrayList<>();
    private int y;
    private ArrayList<Product> ProdObj = new ArrayList<>();


    protected ArrayList giveAndGenerateList() {
        for (int i = 0; i < product.length; i++) {
            Product prod = new Product(product[i], price[i]);
            ProdObj.add(prod);
        }
        int x = rnd.nextInt(ProdObj.size() - 1);
        if (x == 0 ) x = 1;
        for (int i = 0; i < x; i++) {
            y = rnd.nextInt(ProdObj.size() - 1);
            array.add(ProdObj.get(y).getName());
            ProdObj.remove(y);
                AllPrice += ProdObj.get(y).getPrice();
            }
        return array;
    }
    public void showWhatBuyAndDidNotBuy(Husband husband) {
        ArrayList heBought = husband.goShop();
        System.out.println("\n Bought :");
            for (int i =0; i < heBought.size();i++) {
                System.out.println(heBought.get(i));
            }
        ArrayList heDidNotBought = husband.whatDidNotWas();
        for (int i =0; i < heDidNotBought.size();i++) {
            System.out.printf("\n Didn't was : " + heDidNotBought.get(i));
        }
        System.out.println();
    }
    public void showPrice(Husband Husband) {
        System.out.println();
        System.out.println("Total price with discount : " + Husband.getPrice());
    }
}
