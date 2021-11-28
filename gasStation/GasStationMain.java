package gasStation;

public class GasStationMain {

    public static void main(String[] args) {
        double userFuelPrice = 0;
        int userStationNr;
        int userAmounth;

        Fuel benzinas95 = new Fuel("Benzinas 95", 1.40, 500);
        Fuel benzinas98 = new Fuel("Benzinas 98", 1.50, 500);
        Fuel dizelis = new Fuel("Dizelinas", 1.20, 500);
        Fuel dujos = new Fuel("Dujos", 0.80, 500);
        Fuel[] fuelList = new Fuel[4];
        fuelList[0] = benzinas95;
        fuelList[1] = benzinas98;
        fuelList[2] = dizelis;
        fuelList[3] = dujos;

        String userFuelType = UserMenu.askForFuelType();
        for (Fuel fuel : fuelList) {
            if (fuel.getFuellType().equalsIgnoreCase(userFuelType)) {
                userFuelPrice = fuel.getPrice();
            }
        }
            userStationNr = UserMenu.askForStationNo();
            userAmounth = UserMenu.askForBuyingAmount();

            new DisplayBill(userFuelPrice, userAmounth, userStationNr);
        }
}
