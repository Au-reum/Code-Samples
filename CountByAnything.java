import java.util.Scanner; 

public class CountByAnything{
   public static void main(String[] args){
	Scanner value = new Scanner(System.in);
	double counter=0, increment, count;
	
	System.out.print("Value to count by: ");
	increment = value.nextDouble();
		
	for (count=increment; count < 500; count+=increment){
	System.out.print(count+"      ");
	counter++;
	if(counter%10==0){	
	  System.out.print("\n");
	}
   }
  }
 }