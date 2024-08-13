import java.util.Scanner;

public class CarpentryChoice2 {

    public static void main(String[] args) {
    String input = "";
    int num = 0, i;
    String[] items = {"table", "desk", "dresser", "entertainment center"};	
    int[] prices = {250, 325, 420,600};
    for ( i = 0; i < items.length; i++) {
       System.out.println(items[i] + " $" + prices[i]);
    }
    Scanner choice = new Scanner(System.in);
    System.out.print("Choose an item: ");
    input = choice.nextLine();
    if (input.equals("table")||(input.equals("tab"))) {
      System.out.println("you chose the " + items[0] + " with a price of $" + prices[0]);
    } else if (input.equals("desk")||(input.equals("des"))) {
      System.out.println("you chose the " + items[1] + " with a price of $" + prices[1]);
    } else if (input.equals("dresser")||(input.equals("dre"))) {
      System.out.println("you chose the " + items[2] + " with a price of $" + prices[2]);
    } else if (input.equals("entertainment center")||(input.equals("ent"))) {
      System.out.println("you chose the " + items[3] + " with a price of $" + prices[3]);
    } else {
      System.out.println("Invalid Input");
    }
  }
}