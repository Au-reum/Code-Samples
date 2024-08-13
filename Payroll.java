import java.util.Scanner;

//Angela Christine

public class Payroll{	

   public static void main(String[] args){		
      double hours = 0, rate = 0, grosspay = 0, netpay = 0, withholdingtax = 0, tax = 0.15;		
      Scanner thetax = new Scanner(System.in);		
      System.out.print("Enter hourly pay rate: ");		
      rate = thetax.nextInt();		
      System.out.print("Enter hours worked: ");		
      hours = thetax.nextInt();	

      grosspay = (hours * rate);
      withholdingtax = (grosspay * tax);
      netpay = (grosspay - withholdingtax);
	
      System.out.println("You worked " + hours + " hours with an $" + rate + " hourly rate.");		
      System.out.println("Gross pay: " + grosspay);				
      System.out.println("Withholding tax: $" + withholdingtax);			
      System.out.println("Net pay: " + netpay);
   }
}