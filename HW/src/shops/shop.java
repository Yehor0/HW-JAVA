package shops;

import java.util.ArrayList;
import java.util.Random;

public class shop extends Products{
    Random rnd = new Random();

    public void IsDiscount() {

    }
    public boolean CheckIsPresent(String str) {
     boolean Present = false;
            for (int y =0 ; y < product.length; y++) {
                if(str.equals(product[y])) {
                    if (isPresentPr[y] == true) {
                    Present = isPresentPr[y];
                    break;
                }}
            }
        for (int y =0 ; y < tech.length; y++) {
            if(str.equals(tech[y])) {
            if (isPresentTech[y] == true) {
                    Present = isPresentTech[y];
                    break;
                }}
        }
        return Present;
    }
    public int Get_Price(String str) {
        int price = 0;
        for (int y =0 ; y < product.length; y++) {
            if(str.equals(product[y])) {
                price += pricePr[y];
            }
        }
        for (int y =0 ; y < tech.length; y++) {
            if(str.equals(tech[y])) {
                price += priceTech[y];
            }
        }
        return price;
    }
}
