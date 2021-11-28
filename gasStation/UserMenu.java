package gasStation;

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

import java.util.Scanner;

public class UserMenu {

    public static int askForStationNo() {
        int stationNo = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please chose station from 1 to 4");
        boolean isRunning = true;
        while (isRunning) {
            int userChose = scanner.nextInt();
            if (userChose >= 1 && userChose <= 4) {
                stationNo = userChose;
                isRunning = false;
            } else {
                System.out.println("Please chose station from 1 to 4");
            }
        }
        return stationNo;
    }

    public static String askForFuelType() {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Please Chose GAS type \n"
                    + "1 for Benzinas 95\n"
                    + "2 for Benzinas 98\n"
                    + "3 for Dizelinas\n"
                    + "4 for Dujos\n"
                    + "5 to END OPERATION");
            int userChose = scanner.nextInt();
            if (userChose >= 0 && userChose <= 5) {
                if (userChose == 1) {
                    return "Benzinas 95";
                } else if (userChose == 2) {
                    return "Benzinas 98";
                } else if (userChose == 3) {
                    return "Dizelinas";
                } else if (userChose == 4) {
                    return "Dujos";
                } else if (userChose == 5) {
                    System.out.println("Have a good day!");
                    System.exit(0);
                } else {
                    System.out.println("Please chose station from 1 to 5");
                }
            }
        }
        return "NoN";
    }
    public static int askForBuyingAmount(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many liters?");
        return scanner.nextInt();
    }
}





