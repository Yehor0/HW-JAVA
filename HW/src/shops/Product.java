package shops;

public class Product {
    private String name;
    private int price;
    private boolean IsPresent;
    Product(String name, int price, boolean IsPresent ) {
        this.name = name;
        this.price = price;
        this.IsPresent = IsPresent;
    }
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPresent(boolean present) {
        IsPresent = present;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return price;
    }

    public boolean isPresent() {
        return IsPresent;
    }

}
