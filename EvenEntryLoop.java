import java.util.Scanner;

public class EvenEntryLoop {

    public static void main(String[] args) {
    int number = 0;
    Scanner entry = new Scanner(System.in);
    while (true) {
    System.out.print("Enter a number: ");
    number = entry.nextInt();
    if (number == 999) {
      System.out.println("Bye!");
      break;
    }   
    if (number % 2 == 0) {
       System.out.println("Good job!");
    } else {
       System.out.println("Wrong input! Try again.");
    }
   }
  }
}