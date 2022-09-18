package people;

import shops.Home_appliances_store;
import shops.Product_shop;
import shops.shop;

import java.util.ArrayList;

public class Husband {
    private Wife wife = new Wife();
    String str;
    private Home_appliances_store shopTech = new Home_appliances_store();
    Product_shop shopProd = new Product_shop();
    //int price = wife.give_price();
    private ArrayList NeedToBuy = wife.Give_And_Generate_list();
    public void Show() {
        for (int i =0; i < NeedToBuy.size();i++) {
            System.out.println(NeedToBuy.get(i));
        }
        System.out.println();
        for (int i =0; i < NeedToBuy.size();i++) {
            str = (String) NeedToBuy.get(i);
            shopProd.IsNotPresent();
            if (shopProd.CheckIsPresent(str)) {
                System.out.println(str);
            } else {
                continue;
            }
        }

        //System.out.println(wife.give_price());
    //go shop
    }
    public void Go_Shop() {

    }
}