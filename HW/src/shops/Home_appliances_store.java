package shops;

import java.util.ArrayList;
import java.util.List;

public class Home_appliances_store extends shop{
    public Home_appliances_store() {
        int y = rnd.nextInt(isPresentTech.length);
        for (int i = 0; i < y; i++) {
            super.isPresentPr[rnd.nextInt(isPresentTech.length)] = false;
        }
    }
    public void DoesIsDiscount() {
        int x = rnd.nextInt(40) + 1;
        float o = x;
        int y = rnd.nextInt(priceTech.length);
        int u;
        for (int k = 0; k < y; k++) {
            u = rnd.nextInt(priceTech.length);
            super.pricePr[u] *= 1 - (o/100);
            x = rnd.nextInt(40) + 1;
            o=x;
        }
    }
        @Override
        public int Get_Price(String str) {
        int price = 0;
            for (int y =0 ; y < tech.length; y++) {
                if(str.equals(tech[y])) {
                    price += priceTech[y];
                }
            }
            return price;
        }
        @Override
        public boolean CheckIsPresent(String str) {
            boolean Present = false;
            for (int y = 0; y < tech.length; y++) {
                if (str.equals(tech[y])) {
                    if (isPresentTech[y] == true) {
                        Present = isPresentTech[y];
                        break;
                    }
                }
            }
            return Present;
        }
    }