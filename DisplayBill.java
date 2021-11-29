public class DisplayBill {
    public DisplayBill(String fuelType, double price, int amount, int stationNr) {
        System.out.println("_________________");
        System.out.println("You buy " + amount + " Liters\n"
                + "of " + fuelType + "\n"
                + "For " + price + " per litre\n"
                + "You pay: " + amount * price + "$\n"
                + "at STATION " + stationNr );
        System.out.println("_________________");
    }
}
