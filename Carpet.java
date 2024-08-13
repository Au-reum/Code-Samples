public class Carpet{

  public static void main(String[] args) {
     double carpetWidth = 10, carpetLength = 20, givenCent = 435.6, givenDollar = 5 ,area = 0, cents = 0, dollars = 0;

     area = carpetLength * carpetWidth;
     cents = givenCent/area;                
     dollars = area*givenDollar; 
     System.out.println("The carpet is " + area + " square ft and it costs " + givenDollar + " dollars per square foot.");          
     System.out.println("Therefore the carpet costs: $" + dollars + " and " + cents + " cents.");
  }
}
