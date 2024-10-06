import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        final int MINI_TRIP = 100;
        double fullTank = 0;
        double fuelEfficiency = 0;
        double gasPrice = 0;
        double drivePrice = 0;
        double fullTrip = 0;
        String trash = "";
        boolean doneTank = false;
        boolean doneEfficiency = false;
        boolean doneGas = false;

        do {

            System.out.print("Enter the fuel tank size for your vehicle: ");
            if (in.hasNextDouble())
               { fullTank = in.nextDouble();
                in.nextLine();
                doneTank = true;
               } else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + ". Please enter a valid number.");
                      }

            }while(!doneTank);

        do {

            System.out.print("Enter the fuel efficiency in miles per gallon for your vehicle: ");
            if (in.hasNextDouble())
            { fuelEfficiency = in.nextDouble();
                in.nextLine();
                doneEfficiency = true;
            } else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + ". Please enter a valid number.");
            }

        }while(!doneEfficiency);

        do {

        System.out.print("Enter the current cost of a gallon of fuel for your vehicle: ");
        if (in.hasNextDouble())
        { gasPrice = in.nextDouble();
            in.nextLine();
            doneGas = true;
        } else {
            trash = in.nextLine();
            System.out.println("You entered " + trash + ". Please enter a valid number.");
        }

    }while(!doneGas);

        drivePrice = MINI_TRIP / fuelEfficiency * gasPrice;
        fullTrip = fullTank * fuelEfficiency;

        System.out.println("At the current fuel price of " + gasPrice + ", it would cost you " + drivePrice + " dollars to travel 100 miles.");
        System.out.println("On a full tank of gas, you can travel " + fullTrip + " miles.");



    }

}
