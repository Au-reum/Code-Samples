import java.util.Scanner;

//Angela Christine

public class Dollars{ 

    public static void main(String[] args){
        int numTwenties, numTens, numFives, numOnes;
        Scanner conversion = new Scanner(System.in);
        System.out.print("Please enter a dollar amount: $");
        int dollarAmount = conversion.nextInt();

        numTwenties = dollarAmount/20;
        numTens = (dollarAmount - 20*numTwenties)/10;
        numFives = (dollarAmount - (10*numTens + 20*numTwenties))/5;
        numOnes = (dollarAmount - (10*numTens + 20*numTwenties + 5*numFives));

        System.out.println("You have entered  $" + dollarAmount );
        System.out.println("That is " + numTwenties + " twenties, " + numTens + " tens, " + numFives + " fives, and " + numOnes + " ones.");
    }
}