import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine{
    private final List<Product> productList;
    private int money;

    public HotDrinkVendingMachine(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product elem : productList) {
            if (elem.getName().equals(name)) {
                money += elem.getPrice();
                return elem;
            }
        }
        return null;
    }

    @Override
    public Product getProduct(String name, int volume, double temperature) {
        for (Product elem : productList) {
            if (elem.getName().equals(name) && elem.getVolume() == volume && elem.getTemperature() == temperature) {
                money += elem.getPrice();
                return elem;
            }
        }
        return null;
    }

}
