public class HotDrink extends Product{
    private int volume;
    private double temperature;

    public HotDrink(String name, int price) {
        super(name, price);
        this.volume = 400;
        this.temperature = 89;
    }

    public HotDrink(String name, int price, int volume, double temperature) {
        super(name, price);
        this.volume = volume;
        this.temperature = temperature;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink { " + "name = " + getName() + ", price = " + getPrice() +
                " rub, volume = " + volume +
                " ml, temperature = " + temperature +
                " }";
    }
}
