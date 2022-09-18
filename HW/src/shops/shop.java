package shops;

import java.util.ArrayList;
import java.util.Random;

public class shop extends Products{
    Random rnd = new Random();
 protected void discount() {
     float x;
     int y = rnd.nextInt(pricePr.length);
     int u;
     for (int k=0; k < y; k++) {
         x = rnd.nextInt(50 -1) +1 /100;
         u = rnd.nextInt(pricePr.length);
         pricePr[u] *= x;
     }
     y = rnd.nextInt(priceTech.length);
     for (int k=0; k < y; k++) {
         x = rnd.nextInt(50 -1) +1 /100;
         u = rnd.nextInt(priceTech.length);
         priceTech[u] *= x;
     }
    }
    public void IsNotPresent() {
        int y = rnd.nextInt(isPresentPr.length /2);
        int x;
        for (int k=0; k < y; k++) {
            x = rnd.nextInt(isPresentPr.length);
            isPresentPr[x] = false;
        }
        y = rnd.nextInt(isPresentTech.length / 2);
        for (int k=0; k < y; k++) {
            x = rnd.nextInt(isPresentTech.length);
            isPresentTech[x] = false;
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
}
