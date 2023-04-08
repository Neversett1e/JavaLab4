package Pizza;

public class meat extends Pizza{
    public meat(int price, int weight, int diameter, int caloricContent) {
        super(price, weight, diameter, caloricContent);
    }

    @Override
    public String toString() {
        return "Мясная, цена " + this.getPrice();
    }
}
