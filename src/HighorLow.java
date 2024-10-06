import java.util.Scanner;
import java.util.Random;

public class HighorLow
{
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    Random generator = new Random();
    int val = 0;
    int userGuess = 0;
    String trash = "";
    boolean doneGuess = false;

        do {

            System.out.print("Guess a number between 1 and 10: ");
            if (in.hasNextInt())
            { userGuess = in.nextInt();
                in.nextLine();
                if(userGuess >= 1 && userGuess <= 10)
                {
                    System.out.println("Your guess is " + userGuess + ".");
                    doneGuess = true;
                }
                else
                {
                    System.out.println("Sorry, you entered " + userGuess + ", which is out of range.");
                }


            } else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + ". Please enter a valid number.");
            }

        }while(!doneGuess);

        val = generator.nextInt(10) + 1;

        if (val > userGuess)
        {
            System.out.println("The secret number was " + val + " and you guessed " + userGuess + ". You guessed too low!");
        }
        else if(val < userGuess)
        {
            System.out.println("The secret number was " + val + " and you guessed " + userGuess + ". You guessed too high!");
        }
        else
        {
            System.out.println("The secret number was " + val + " and you guessed " + userGuess + ". Perfect guess!!");
        }


    }
}


