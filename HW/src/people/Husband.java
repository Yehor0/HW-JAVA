package people;

import shops.*;

import java.util.ArrayList;

public class Husband {
    private Wife wife = new Wife();
    public Husband(Wife wife) {
        this.wife = wife;
    }
    private int AllPrice;
    private ArrayList DidntPresent = new ArrayList();
    private String str;
    private HomeAppliancesStore shopTech = new HomeAppliancesStore();
    private ProductShop shopProd = new ProductShop();
    private ArrayList NeedToBuy = wife.giveAndGenerateList();
    public void showNeedBuy() {
        System.out.println("Should buy : ");
        for (int i = 0; i < NeedToBuy.size(); i++) {
            System.out.println(NeedToBuy.get(i));
        }
    } public ArrayList goShop() {
        ArrayList Was = new ArrayList();
        System.out.println("\n Total list : ");
        for (int i =0; i < shopProd.getProducts().length;i++) {
            System.out.printf(shopProd.getProducts()[i].getName());
            System.out.println(" - " + shopProd.getProducts()[i].getPrice());
        }
        for (int i =0; i < shopTech.getProducts().length;i++) {
            System.out.printf(shopTech.getProducts()[i].getName());
            System.out.println(" - " + shopTech.getProducts()[i].getPrice());
        }
        System.out.println();
        shopProd.doesIsDiscount();
        shopTech.doesIsDiscount();
        for (int i =0; i < NeedToBuy.size();i++) {
            str = (String) NeedToBuy.get(i);
            if (shopTech.checkIsPresent(str) || shopProd.checkIsPresent(str)) {
                //System.out.println(str);
                Was.add(str);
            } else {
                this.AllPrice -= shopProd.getPrice(str);
                this.AllPrice -= shopTech.getPrice(str);
                this.DidntPresent.add(NeedToBuy.get(i));
            }
        }
        for (int i =0; i < NeedToBuy.size();i++) {
            str = (String) NeedToBuy.get(i);
            this.AllPrice += shopProd.getPrice(str);
            this.AllPrice += shopTech.getPrice(str);
        }
        return Was;
    }
    protected ArrayList whatDidNotWas() {
        return DidntPresent;
    }
    protected int getPrice() {
        return AllPrice;
    }
}