import java.util.Scanner;

public class CtoFConverter
{
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        double tempC = 0;
        double tempF = 0;
        final double CONVERSION = 1.8;
        final int CONSTANT = 32;
        String trash = "";
        boolean goodNum = false;

        do {
            System.out.print("Enter temperature in Celsius to convert: ");
            if (in.hasNextDouble())
               {tempC = in.nextDouble();
               in.nextLine();
               tempF = tempC * CONVERSION + CONSTANT;
               goodNum = true;

               System.out.println(tempC + "Celsius converted to Fahrenheit is " + tempF +" Fahrenheit.");
               }
            else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + ". Please enter a valid number.");

                 }


            } while (!goodNum);

    }
}