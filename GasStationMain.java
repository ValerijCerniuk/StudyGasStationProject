//Group exercise. GAS station.
//        Sukurti programele "GAS station".
//        Parodyti vartotojui meniu, kuriame jis gali pasirinkti kokio tipo degalus pils.
//        Nuskaityti vartotojo pasirinkima.
//        Atitinkamai pagal pasirinkima parinkti degalu kaina.
//        Paprasyti vartotojo ivesti koloneles numeri.
//        Ivesti kuro kieki.
//        Paskaiciuoti bendra suma.
//        Isspausdinti kasos ceki su visa su uzsipilymu susijusia informacija.
//        Naudoti geras praktikas, uzvadinimus, formatavima, net keleta skirtingu klasiu jei reikia atskirti logika.
public class GasStationMain {

    public static void main(String[] args) {
        Fuel[] fuelList = new Fuel[4];
        fuelList[0] = new Fuel("Benzinas 95", 1.40, 500);
        fuelList[1] = new Fuel("Benzinas 98", 1.50, 500);
        fuelList[2] = new Fuel("Dizelinas", 1.20, 500);
        fuelList[3] = new Fuel("Dujos", 0.80, 500);

        Fuel userChose = UserMenu.askForFuel(fuelList);
        int userAmounth = UserMenu.askForBuyingAmount();
        if ((userChose.getStoredAmount() - userAmounth) > 0) {
            userChose.setStoredAmount(userAmounth);
            new DisplayBill(userChose.getFuellType(), userChose.getPrice(), userAmounth, UserMenu.askForStationNo());
        } else {
            System.out.println("No fuel, wait for delivery!!!");
        }
    }
}
