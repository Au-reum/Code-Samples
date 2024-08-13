import java.util.Scanner;

public class CarpentryChoice {

    public static void main(String[] args) {
    String input = "";
    int num = 0, i;
    String[] items = {"table", "desk", "dresser", "entertainment center"};	
    int[] prices = {250, 325, 420,600};
    for ( i = 0; i < items.length; i++) {
       System.out.println(items[i]);
    }
    Scanner choice = new Scanner(System.in);
    System.out.print("Choose an item: ");
    input = choice.nextLine();
    if (input.equals("table")) {
      System.out.println("you chose the " + input + " with a price of $" + prices[0]);
    } else if (input.equals("desk")){
      System.out.println("you chose the " + input + " with a price of $" + prices[1]);
    } else if (input.equals("dresser")){
      System.out.println("you chose the " + input + " with a price of $" + prices[2]);
    } else if (input.equals("entertainment center")){
      System.out.println("you chose the " + input + " with a price of $" + prices[3]);
    } else {
      System.out.println("Invalid Input");
    }
  }
}