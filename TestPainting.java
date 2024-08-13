import java.util.Scanner;

public class TestPainting {

public static void main(String[] args) {
Painting pt1 = new Painting();
Painting pt2 = new Painting();
Painting pt3 = new Painting();
Scanner value1= new Scanner(System.in);

System.out.print("Title of Painting: ");
 String pt1Title = value1.nextLine();
System.out.print("Artist: ");
 String pt1Artist = value1.nextLine();
System.out.print("Medium of Painting: ");
 String pt1Medium = value1.nextLine();
System.out.print("Price of Painting: $");
 double pt1Price = value1.nextDouble();
System.out.println(" ");

Scanner value2= new Scanner(System.in);
System.out.print("Title of Painting: ");
 String pt2Title = value2.nextLine();
System.out.print("Artist: ");
 String pt2Artist = value2.nextLine();
System.out.print("Medium of Painting: ");
 String pt2Medium = value2.nextLine();
System.out.print("Price of Painting: $");
 double pt2Price = value2.nextDouble();
System.out.println(" ");

pt1.setPrice(pt1Price);
pt2.setPrice(pt2Price);

System.out.println("The " + pt1Medium + " painting of " + pt1Artist + ", with the title \"" + pt1Title + "\" sells for $" + pt1Price + ", including the $" + pt1.getGalleryCommission() + " gallery's commission. ");
System.out.println(" ");
System.out.println("The " + pt2Medium + " painting of " + pt2Artist + ", with the title \"" + pt2Title + "\" sells for $" + pt2Price + ", including the $" + pt2.getGalleryCommission() + " gallery's commission. ");
System.out.println(" ");
System.out.println("The " + pt3.getMedium() + " painting of " + pt3.getArtist() + ", with the title \"" + pt3.getTitle() + "\" sells for $" + pt3.getPrice() + ", including the $" + pt3.getGalleryCommission() + " gallery's commission. ");
System.out.println(" ");
System.out.println("P.S: The gallery automatically charges a 20% commission on all its available paintings.");
}
}

