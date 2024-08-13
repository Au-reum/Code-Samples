import java.util.Scanner;

//Angela Christine

public class Fees{

  public static void main(String[] args) {
     double creditHours = 0, givenHours = 0, totalCredit = 85, athleticFee = 65, moneyOnBooks = 0, totalFees = 0;
     Scanner theFees = new Scanner(System.in);
     System.out.print("Enter number of Credit Hours: ");
     givenHours = theFees.nextDouble();
     System.out.print("Enter amount of money spent on books: ");
     moneyOnBooks = theFees.nextDouble();

     creditHours = givenHours*totalCredit;
     totalFees = creditHours + moneyOnBooks + athleticFee;
     System.out.println("with a $" + totalCredit + " per credit hour, your total credit hours is $" + creditHours);
     System.out.println("with the additional $65 athletic fee");
     System.out.println("The total amount of fees are: $" + totalFees);
  }
}
     

     