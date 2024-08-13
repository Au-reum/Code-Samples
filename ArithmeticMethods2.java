import java.util.Scanner;

public class ArithmeticMethods2 {

static void displayNumberPlus10(int x, int y) {
        System.out.println("Number plus 10: ");
        System.out.println(x + 10);
        System.out.println(y + 10);
        }
static void displayNumberPlus100(int x, int y) {
        System.out.println("Number plus 100: ");
        System.out.println(x + 100);
        System.out.println(y + 100);
        }
static void displayNumberPlus1000(int x, int y) {
        System.out.println("Number plus 1000: ");
        System.out.println(x + 1000);
        System.out.println(y + 1000);
        }
public static void main (String[] args) {
    int x, y;
    Scanner givenNumber = new Scanner(System.in);
    System.out.print("Enter first number: ");
    x = givenNumber.nextInt();
    System.out.print("Enter second number: ");
    y = givenNumber.nextInt();
    displayNumberPlus10(x, y);
    displayNumberPlus100(x, y);
    displayNumberPlus1000(x,y);
    }
}