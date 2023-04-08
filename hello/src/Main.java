import java.util.ArrayList;
import java.util.Scanner;
import Pizza.Pizza;
import Pizza.pepperoni;
import Pizza.cheese;
import Pizza.meat;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Pizza> pizzas = new ArrayList<>();

        Pizza pepperoni1 = new pepperoni(14, 9, 22, 1900);
        Pizza pepperoni2 = new pepperoni(15, 10, 25, 2000);
        Pizza pepperoni3 = new pepperoni(13, 11, 27, 2400);
        Pizza cheese1 = new cheese(25, 23, 45, 5000);
        Pizza cheese2 = new cheese(35, 33, 45, 6000);
        Pizza cheese3 = new cheese(45, 33, 55, 7000);
        Pizza meat1 = new meat(25, 23, 45, 5000);
        Pizza meat2 = new meat(35, 33, 55, 6000);
        Pizza meat3 = new meat(45, 43, 65, 7000);

        pizzas.add(pepperoni1);
        pizzas.add(pepperoni2);
        pizzas.add(pepperoni3);
        pizzas.add(cheese1);
        pizzas.add(cheese2);
        pizzas.add(cheese3);
        pizzas.add(meat1);
        pizzas.add(meat2);
        pizzas.add(meat3);

        int i = 0;
        while (i != 3) {
            System.out.println("1) Вывести количество пицц, вес которых превышает заданный.");
            System.out.println("2) Вывести цену каждой пиццы, диаметр которой превышает заданный.");
            System.out.println("3) Выход.");
            i = scan.nextInt();
            int count = 0;
            if (i == 1) {
                System.out.println("Введите вес");
                int weight = scan.nextInt();
                for(Pizza pizza : pizzas){
                    if(pizza.getWeight() > weight) {
                        count++;
                    }
                }
                System.out.println(count);
            }
            else if(i == 2) {
                System.out.println("Введите диаметр");
                int diameter = scan.nextInt();
                for(Pizza pizza : pizzas){
                    if(pizza.getDiameter() > diameter) {
                        System.out.println(pizza);
                    }
                }
            }
            else if(i == 3) {
                break;
            }
            else {
                System.out.println("Введено не верное значение");
            }
        }

    }
}