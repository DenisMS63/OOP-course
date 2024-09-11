import java.util.List;

public class BottleOfWaterVendingMachine implements VendingMachine {

    private final List<Product> productsList;
    private int money;

    public BottleOfWaterVendingMachine(List<Product> productsList) {
        this.productsList = productsList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product elem : productsList) {
            if (elem.getName().equals(name)) {
                money += elem.getPrice();
                return elem;
            }
        }
        return null;
    }

    @Override
    public Product getProduct(String name, int volume, double temperature) {
        return null;
    }

    public BottleOfWater getProduct(String name, int volume){
        for (Product el : productsList){
            if (el instanceof BottleOfWater){       // является ли el соответствующим классом
                if (el.getName().equals(name) && ((BottleOfWater) el).getVolume() == volume){
                    return (BottleOfWater) el;
                }
            }
        }
        return null;
    }

}
