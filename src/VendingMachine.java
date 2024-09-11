import java.util.ArrayList;
import java.util.List;

public interface VendingMachine {
    Product getProduct(String name);

    Product getProduct(String name, int volume, double temperature);

//    private Integer money;
//    private List<Product> products;
//
//    public VendingMachine() {
//        this.money = 0;
//        this.products = initProduct();
//    }
//
//    public Product getProduct(String name){
//        for (Product elem : products){
//            if (elem.getName().equals(name)){
//                money += elem.getPrice();
//                return elem;
//            }
//        }
//        return null;
//    }
//
//    private List<Product> initProduct(){
//        List<Product> products = new ArrayList<>();
//        products.add(new Product("Хлеб", 50));
//        products.add(new Product("Молоко", 70);
//        products.add(new Product("Вода", 40));
//        return products;
//    }

}
