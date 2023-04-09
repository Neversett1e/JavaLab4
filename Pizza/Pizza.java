package Pizza;

public abstract class Pizza {
    private final int price;
    private final int weight;
    private final int diameter;
    private final int caloricContent;

    public Pizza(int price, int weight, int diameter, int caloricContent) {
        this.price = price;
        this.weight = weight;
        this.caloricContent = caloricContent;
        this.diameter = diameter;
    }

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
}

