package Pizza;

public class cheese extends Pizza{
    public cheese(int price, int weight, int diameter, int caloricContent) {
        super(price, weight, diameter, caloricContent);
    }

    @Override
    public String toString() {
        return "Сырная, цена " + this.getPrice();
    }
}
