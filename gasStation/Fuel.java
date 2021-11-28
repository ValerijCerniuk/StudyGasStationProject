package gasStation;

public class Fuel {

    private String fuellType;
    private double price;
    private int storedAmounth;

    public Fuel(String fuellType, double price, int storedAmounth) {
        this.fuellType = fuellType;
        this.price = price;
        this.storedAmounth = storedAmounth;
    }

    public String getFuellType() {
        return fuellType;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Kuras{" +
                "degaluRusis='" + fuellType + '\'' +
                ", kaina=" + price +
                ", kiekis=" + storedAmounth +
                '}';
    }
}
