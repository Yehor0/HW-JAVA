package shops;

public class Products {
    protected String[] product = {"Bread" , "Sausage" , "Butter" , "Milk" , "Potato"};
    protected int[] pricePr = {110 , 80 , 70 , 300 , 40};
    protected String[] tech = {"Sony" , "Samsung" , "Sharp" , "Apple" , "Acer"};
    Boolean[] isPresentPr = {true , true,true , true ,true};
    Boolean[] isPresentTech = {true , true,true , true ,true};
    protected int[] priceTech = {100 , 80 ,70 , 300 , 40};

    public String[] getProduct() {
        return product;
    }
    public String getProduct(int i) {
        return product[i];
    }

    public int getPricePr(int i) {
            return pricePr[i];
    }
    public int getPriceTech(int i) {
        return priceTech[i];
    }
    public String getTech(int i) {
        return tech[i];
    }

    public int[] getPricePr() {
        return pricePr;
    }

    public int[] getPriceTech() {
        return priceTech;
    }

    public String[] getTech() {
        return tech;
    }

}
