package people;

import shops.*;

import java.util.ArrayList;

public class Husband {
    private int AllPrice;
    private ArrayList DidntPresent = new ArrayList();
    private Products list = new Products();
    private Wife wife = new Wife();
    private String str;
    private Home_appliances_store shopTech = new Home_appliances_store();
    private Product_shop shopProd = new Product_shop();
    private ArrayList NeedToBuy = wife.Give_And_Generate_list();
    public void Show() {
        System.out.println("Should buy : ");
        for (int i =0 ; i < NeedToBuy.size(); i++) {
            System.out.println(NeedToBuy.get(i));
        }
        System.out.println("\n Total list : ");
        int x = list.getProduct().length;
        for (int i =0; i < x;i++) {
            System.out.printf(list.getProduct(i ));
            System.out.println(" - " + list.getPricePr(i));
        }
        x = list.getTech().length;
        for (int i =0; i < x; i++) {

            System.out.printf(list.getTech(i));
            System.out.println(" - " + list.getPriceTech(i));
        }
        System.out.println();
        shopProd.DoesIsDiscount();
        shopTech.DoesIsDiscount();
        System.out.println("\n Bought:");
        for (int i =0; i < NeedToBuy.size();i++) {
            str = (String) NeedToBuy.get(i);
            if (shopTech.CheckIsPresent(str) || shopProd.CheckIsPresent(str)) {
                System.out.println(str);
            } else {
                AllPrice -= shopProd.Get_Price(str);
                AllPrice -= shopTech.Get_Price(str);
                DidntPresent.add(NeedToBuy.get(i));
            }
           //
        }
        for (int i =0;i < DidntPresent.size(); i++) {
            System.out.printf("\n Wasn't : " + DidntPresent.get(i));
        }
        for (int i =0; i < NeedToBuy.size();i++) {
            str = (String) NeedToBuy.get(i);
            AllPrice += shopProd.Get_Price(str);
            AllPrice += shopTech.Get_Price(str);
        }
        System.out.println('\n');
        System.out.println("Total price :");
        System.out.println(AllPrice);



    }
}