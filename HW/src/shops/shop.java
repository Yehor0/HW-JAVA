package shops;

import java.util.ArrayList;
import java.util.Random;

public class shop extends Products{
    Random rnd = new Random();

public void discount(int d , boolean IsProd) {
    if (IsProd) {
        float x;
        int y = rnd.nextInt(pricePr.length);
        int u;
        for (int k=0; k < y; k++) {
         x = rnd.nextInt(d) +1;
         x /= 100;
         u = rnd.nextInt(pricePr.length);
         pricePr[u] *= x;
     }
    } else if (!IsProd) {
        float x;
        int y = rnd.nextInt(priceTech.length);
        int u;
        for (int k=0; k < y; k++) {
         x = rnd.nextInt(d) +1;
         x /= 100;
         u = rnd.nextInt(priceTech.length);
         priceTech[u] *= x;
     }
    }
}
    public void IsNotPresent(boolean IsProd) {
        int x;
        int y;
        if (IsProd) {
            y = rnd.nextInt(isPresentPr.length);
            for (int k = 0; k < y; k++) {
                x = rnd.nextInt(isPresentPr.length);
                isPresentPr[x] = false;
            }
        }else {
            y = rnd.nextInt(isPresentTech.length);
            for (int k = 0; k < y; k++) {
                x = rnd.nextInt(isPresentTech.length);
                isPresentTech[x] = false;
            }
        }
    }
    public boolean CheckIsPresent(String str) {
     boolean Present = false;
            for (int y =0 ; y < product.length; y++) {
                if(str.equals(product[y])) {
                    Present = isPresentPr[y];
            }
        }
        for (int y =0 ; y < tech.length; y++) {
            if(str.equals(tech[y])) {
                Present = isPresentTech[y];
            }
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
