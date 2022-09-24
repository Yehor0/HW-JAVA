package shops;

import java.util.Random;

public class shop extends Products{
    Random rnd = new Random();
    public void DoesIsDiscount() {
        int x = rnd.nextInt(60) + 1;
        float o = x;
        int y = rnd.nextInt(priceTech.length);
        int u;
        for (int k = 0; k < y; k++) {
            u = rnd.nextInt(priceTech.length);
            super.pricePr[u] *= 1 - (o/100);
            x = rnd.nextInt(40) + 1;
            o=x;
        }
        x = rnd.nextInt(40) + 1;
         o = x;
         y = rnd.nextInt(pricePr.length);
        for (int k = 0; k < y; k++) {
            u = rnd.nextInt(pricePr.length);
            super.pricePr[u] *= 1 - (o/100);
            System.out.println("На " + product[u] + " знижка " + x + "%" + " = " + pricePr[u]);
            x = rnd.nextInt(40) + 1;
            o=x;
        }
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
