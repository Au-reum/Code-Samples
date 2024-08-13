import java.util.Scanner;

//Angela Christine

public class FahrenheitToCelsius { 

    public static void main(String[] args){
        int fahrenheit = 0;
        double celsius = 0;
        Scanner ftoc = new Scanner(System.in);
        System.out.print("Please enter a temperature in fahrenheit: ");
        fahrenheit = ftoc.nextInt();

        final double Constant = .5555556;
        celsius = (fahrenheit - 32)*Constant;

        System.out.println("You entered " + fahrenheit + " degrees fahrenheit.");
        System.out.println("This is equivalent to " + celsius + " degrees celsius.");
    }
} 