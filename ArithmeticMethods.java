public class ArithmeticMethods {

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
    int x = 10;
    int y = 20;
    displayNumberPlus10(10, 20);
    displayNumberPlus100(10, 20);
    displayNumberPlus1000(10,20);
    }
}