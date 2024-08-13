import java.util.Scanner;
 
//Angela Christine

public class TicketNumber {

  public static void main(String[] args) {
      int ticket = 0, removeLast = 0, lastDigit = 0;
      Scanner theTicket = new Scanner(System.in);
      System.out.print("Enter Ticket Number: ");
      ticket = theTicket.nextInt();
      
      removeLast = ticket/10;
      lastDigit = ticket%10;
      boolean ticketValidation = (removeLast % 7) == lastDigit;
      
      System.out.print("The ticket number is " + ticketValidation);
   }
}
      