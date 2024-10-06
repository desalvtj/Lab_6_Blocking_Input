import java.util.Scanner;
import java.lang.Math;

public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double recWidth = 0;
        double recHeight = 0;
        int recArea = 0;
        int recPerimeter = 0;
        int recDiagonal = 0;
        String trash = "";
        boolean doneWidth = false;
        boolean doneHeight = false;

        do {

            System.out.print("Enter the Width of the rectangle: ");
            if (in.hasNextDouble())
            { recWidth = in.nextDouble();
                in.nextLine();
                doneWidth = true;
            } else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + ". Please enter a valid number.");
            }

        }while(!doneWidth);

        do {

            System.out.print("Enter the Height of the rectangle: ");
            if (in.hasNextDouble())
            { recHeight = in.nextDouble();
                in.nextLine();
                doneHeight = true;
            } else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + ". Please enter a valid number.");
            }

        }while(!doneHeight);

        recArea = (int) (recHeight * recWidth);
        recPerimeter = (int) (recWidth + recWidth + recHeight + recHeight);
        recDiagonal = (int) Math.sqrt(recWidth * recWidth + recHeight * recHeight);

        System.out.println("With a Height of " + recHeight + " and a Width of " + recWidth + ", the area of the rectangle is " + recArea + ".");
        System.out.println("With a Height of " + recHeight + " and a Width of " + recWidth + ", the perimeter of the rectangle is " + recPerimeter + ".");;
        System.out.println("With a Height of " + recHeight + " and a Width of " + recWidth + ", the diagonal of the rectangle is " + recDiagonal + ".");;
    }

}
