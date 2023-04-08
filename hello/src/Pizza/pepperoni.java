package Pizza;

public class pepperoni extends Pizza {

    public pepperoni(int price, int weight, int diameter, int caloricContent) {
        super(price, weight, diameter, caloricContent);
    }

    @Override
    public String toString() {
        return "Пепперони, цена " + this.getPrice();
    }
}
