public class Fuel {
    private String fuellType;
    private double price;
    private int storedAmount;

    public Fuel(String fuellType, double price, int storedAmount) {
        this.fuellType = fuellType;
        this.price = price;
        this.storedAmount = storedAmount;
    }

    public String getFuellType() {
        return fuellType;
    }

    public double getPrice() {
        return price;
    }

    public int getStoredAmount() {
        return storedAmount;
    }

    public void setStoredAmount(int amount) {
        this.storedAmount -= amount;
    }
}
