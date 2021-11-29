import java.util.Scanner;

public class UserMenu {

    public static int askForStationNo() {
        int stationNo = 0;
        System.out.println("Please chose station from 1 to 4");
        boolean isRunning = true;
        while (isRunning) {
            int userChose = 0;
            try {
                Scanner scanner = new Scanner(System.in);
                userChose = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Wrong !!!");
            }
            if (userChose >= 1 && userChose <= 4) {
                stationNo = userChose;
                isRunning = false;
            } else {
                System.out.println("Please chose station from 1 to 4");
            }
        }
        return stationNo;
    }

    public static Fuel askForFuel(Fuel[] fuel) {

        while (true) {
            System.out.print("Please Chose GAS type\n");
            System.out.printf("1 for %s price: %f$\n", fuel[0].getFuellType(), fuel[0].getPrice());
            System.out.printf("2 for %s price: %f$\n", fuel[1].getFuellType(), fuel[1].getPrice());
            System.out.printf("3 for %s price: %f$\n", fuel[2].getFuellType(), fuel[2].getPrice());
            System.out.printf("4 for %s price: %f$\n", fuel[3].getFuellType(), fuel[3].getPrice());
            System.out.print("5 to END OPERATION\n");
            int userChose = 0;
            try {
                Scanner scanner = new Scanner(System.in);
                userChose = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Wrong !!!");
            }
            if (userChose > 0 && userChose < 5) {
                return fuel[userChose - 1];
            } else if (userChose == 5) {
                System.out.println("Have a good day!");
                System.exit(0);
            } else {
                System.out.println("Please chose from 1 to 5");
            }
        }
    }

    public static int askForBuyingAmount() {
        boolean isRunning = true;
        int userChose = 0;
        while (isRunning) {
            System.out.println("How many liters?");
            try {
                Scanner scanner = new Scanner(System.in);
                userChose = scanner.nextInt();
                isRunning = false;
            } catch (Exception e) {
                System.out.println("Wrong !!!");
            }
        }return userChose;
    }
}





