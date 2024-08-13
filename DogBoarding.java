import java.util.Scanner;

public class DogBoarding {

  public static void main(String[] args) {
     final double DAY_RATE = 0.50;
     int weight;
     int days;
     double total;
     Scanner dog = new Scanner(System.in);
     System.out.print("Enter the dog's weight in pounds: ");
     weight = dog.nextInt();
     System.out.print("Enter the number of days to board: ");
     days = dog.nextInt();
     total = DAY_RATE + days + weight;
     System.out.print("The price to board a " + weight + " pound dog for " + days + " days is $" + total);
    }
}