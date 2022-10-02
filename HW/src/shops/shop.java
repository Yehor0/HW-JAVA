package shops;

import java.util.Random;

public class shop{
    private Product[] products;
    private String[] product;
    private boolean[] isPresent;
    int[] price;
    public shop(String[] product, int[] price , boolean[] isPresent) {
        this.product = product;
        this.price = price;
        this.isPresent = isPresent;
        int y = rnd.nextInt(isPresent.length - 1);
        for (int i = 0; i < y; i++) {
            isPresent[rnd.nextInt(isPresent.length)] = false;
        }
        products = new Product[product.length];
        try {
            for (int i = 0; i < product.length; i++) {
                Product prod = new Product(product[i], price[i], isPresent[i]);
                products[i] = prod;
            }
        } catch (Exception e) {
            System.out.println("Some product don't have price or isPresent");
        }
    }
    Random rnd = new Random();
    public int getPrice(String str) {
        int price = 0;
        for ( int y = 0; y < products.length; y++) {
            if (str.equals(products[y].getName())) {
                price += products[y].getPrice();
            }
        }
        return price;
    }
    //@Override
    public void doesIsDiscount() {
        int x = rnd.nextInt(50) + 1;
        float o = x;
        int y = rnd.nextInt(products.length -1);
        int u;
        for (int k = 0; k < y; k++) {
            u = rnd.nextInt(products.length);
            products[u].setPrice((int) (products[u].getPrice() / (1 + (o/100))));
            System.out.println("На " + products[u].getName() + " знижка " + x + "%" + " = " + products[u].getPrice());
            x = rnd.nextInt(40) + 1;
            o =x;
        }
    }
    //@Override
    public boolean checkIsPresent(String str) {
        boolean Present = false;
        for (int y =0 ; y < products.length; y++) {
            if(str.equals(products[y].getName())) {
                if (products[y].isPresent()) {
                    Present = products[y].isPresent();
                    break;
                }}
        }
        return Present;
    }

    public Product[] getProducts() {
        Product ProductsReturns[] = new Product[products.length];
        for (int i =0; i < products.length;i++) {
            ProductsReturns[i] = products[i];
        }
        return products;
    }
}
