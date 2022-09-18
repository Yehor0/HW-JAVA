package people;

import shops.Home_appliances_store;
import shops.Product_shop;
import shops.shop;

import java.util.ArrayList;
import java.util.Random;

public class Husband {
    private int AllPrice;
    Random rnd = new Random();
    private Wife wife = new Wife();
    private String str;
    private Home_appliances_store shopTech = new Home_appliances_store();
    private shop shop = new shop();
    private Product_shop shopProd = new Product_shop();
    private ArrayList NeedToBuy = wife.Give_And_Generate_list();
    public void Show() {
        shopProd.discount(rnd.nextInt(50) + 1 , true );
        shopTech.discount(rnd.nextInt(50) + 1 , false );
        System.out.println("Total list : ");
        for (int i =0; i < NeedToBuy.size();i++) {
            str = (String) NeedToBuy.get(i);
            System.out.printf(str);
            System.out.println(" - " + shop.Get_Price(str));
        }
        System.out.println();
        System.out.println("Bought:");
        shop.IsNotPresent();
        for (int i =0; i < NeedToBuy.size();i++) {
            str = (String) NeedToBuy.get(i);
            if (shopProd.CheckIsPresent(str)) {
                System.out.println(str);
            } else {
                AllPrice -= shopProd.Get_Price(str);
            }
        }
        for (int i =0; i < NeedToBuy.size();i++) {
            str = (String) NeedToBuy.get(i);
            AllPrice += shopProd.Get_Price(str);
        }
        System.out.println();
        System.out.println("Total price :");
        System.out.println(AllPrice);



        //System.out.println(wife.give_price());
    //go shop
    }
}