package shops;

import java.util.Random;

public class Product_shop extends shop {
    Random rnd = new Random();

    public Product_shop() {
        int y = rnd.nextInt(isPresentPr.length - 1);
        for (int i = 0; i < y; i++) {
            super.isPresentPr[rnd.nextInt(isPresentPr.length)] = false;
        }
    }
    @Override
    public int Get_Price(String str) {
        int price = 0;
        for ( int y = 0; y < product.length; y++) {
            if (str.equals(product[y])) {
                price += pricePr[y];
            }
        }
        return price;
    }
    public void DoesIsDiscount() {
        int x = rnd.nextInt(40) + 1;
        float o = x;
        int y = rnd.nextInt(pricePr.length);
        int u;
        for (int k = 0; k < y; k++) {
            u = rnd.nextInt(pricePr.length);
            super.pricePr[u] *= 1 - (o/100);
            System.out.println("На " + product[u] + " знижка " + x + "%" + " = " + pricePr[u]);
            x = rnd.nextInt(40) + 1;
            o=x;
        }
    }
    @Override
    public boolean CheckIsPresent(String str) {
        boolean Present = false;
        for (int y =0 ; y < product.length; y++) {
            if(str.equals(product[y])) {
                if (isPresentPr[y] == true) {
                    Present = isPresentPr[y];
                    break;
                }}
        }
        return Present;
    }
}