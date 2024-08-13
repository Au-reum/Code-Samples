public class EightInts {
	public static void main(String[] args) {
     int[] integerForward = { 5, 10, 11, 4, 6, 3, 1, 9};
      for (int i = 0; i < integerForward.length; ++i) {
        System.out.print(integerForward[i] + "  ");
      }
	  System.out.println("");
	  for(int i = integerForward.length -1; i >= 0; i--) {
        System.out.print(integerForward[i] + "  ");
      }
    }
}