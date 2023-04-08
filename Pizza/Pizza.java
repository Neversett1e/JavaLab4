package Pizza;

public abstract class Pizza {
    private int price;
    private int weight;
    private int diameter;
    private int caloricContent;

    public int getPrice() {
        return price;
    }
    public int getWeight() {
        return weight;
    }
    public int getDiameter() {
        return diameter;
    }
    public int getCaloricContent() {
        return caloricContent;
    }

    public Pizza(int price, int weight, int diameter, int caloricContent) {
        this.price = price;
        this.weight = weight;
        this.caloricContent = caloricContent;
        this.diameter = diameter;
    }
}
