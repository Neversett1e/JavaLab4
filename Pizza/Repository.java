package Pizza;
import java.util.ArrayList;
import java.util.List;
public class Repository {
    private List<Pizza> pizzas = new ArrayList<>();

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void removePizza(Pizza pizza) {
        pizzas.remove(pizza);
    }

    public void updatePizza(Pizza oldPizza, Pizza newPizza) {
        int index = pizzas.indexOf(oldPizza);
        if (index >= 0) {
            pizzas.set(index, newPizza);
        }
    }
}
