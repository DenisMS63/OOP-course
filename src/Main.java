import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BottleOfMilk milk = new BottleOfMilk("Вкусное молоко", 100);
        BottleOfMilk milk1 = new BottleOfMilk("Деревенское молоко", 210, 1000);

        System.out.println(milk);
        System.out.println(milk1);

        Product greenTea = new HotDrink("Green tea", 50);
        Product coffee = new HotDrink("Coffee with milk", 100, 300, 90);

        System.out.println(greenTea);
        System.out.println(coffee);

        List<Product> productList = new ArrayList<>();
        productList.add(milk);
        productList.add(milk1);
        productList.add(greenTea);
        productList.add(coffee);

        System.out.println(productList);

        HotDrinkVendingMachine hotDrinkVendingMachine = new HotDrinkVendingMachine(productList);
        System.out.println(hotDrinkVendingMachine.getProduct("Coffee with milk", 300, 90));
        System.out.println(hotDrinkVendingMachine.getProduct("Coffee with milk", 400, 90));

    }
}
