import people.Husband;
import people.Wife;

public class Main {
    public static void main(String[] args) {
        Wife wife = new Wife();
        Husband Husband= new Husband(wife);
        Husband.showNeedBuy();
        wife.showWhatBuyAndDidNotBuy(Husband);
        wife.showPrice(Husband);
    }
}