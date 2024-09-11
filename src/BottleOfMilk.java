public class BottleOfMilk extends Product{
    private int volume;

    public BottleOfMilk(String name, int price) {
        super(name, price);
        this.volume = 500;
    }

    public BottleOfMilk(String name, int price, int volume) {
        super(name, price);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "BottleOfMilk { name = " + getName() +
                ", volume = " + volume + " ml, price = " + getPrice() +
                " rub }";
    }


}
