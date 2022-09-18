package shops;

public class Products {
    public String[] product = {"Bread" , "Sausage" , "Butter" , "Milk" , "Potato"};
    int[] pricePr = {110 , 80 , 70 , 300 , 40};
    String[] tech = {"Sony" , "Samsung" , "Sharp" , "Apple" , "Acer"};
    Boolean[] isPresentPr = {true , true,true , true ,true};
    Boolean[] isPresentTech = {true , true,true , true ,true};
    int[] priceTech = {100 , 80 ,70 , 300 , 40};

    public String[] getProduct() {
        return product;
    }

    public int[] getPricePr() {
        return pricePr;
    }

    public String[] getTech() {
        return tech;
    }

    public int[] getPriceTech() {
        return priceTech;
    }
}
