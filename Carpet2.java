import java.util.Scanner;

//Angela Christine

public class Carpet2{

  public static void main(String[] args) {
     double carpetWidth = 0, carpetLength = 0, area = 0, carpetPrice = 0, price = 0, cents = 0, givenCents = 435.6;
     Scanner theCarpet = new Scanner(System.in);
     System.out.print("Enter a carpet width: ");
     carpetWidth = theCarpet.nextDouble();

     System.out.print("Enter a carpet length: ");
     carpetLength = theCarpet.nextDouble();

     System.out.print("Enter a carpet price per sqr foot: $");
     carpetPrice = theCarpet.nextDouble();

     area = carpetLength * carpetWidth;
     price = carpetPrice*area;
     cents = givenCents/area;
     System.out.println("The carpet is " + area + " wide");
     System.out.println("The carpet's cost is $" + price + " and " + cents + " cents.");
  }
}
 