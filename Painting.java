public class Painting {
     String title;
	 String artist;
	 String medium;
	 double price;
	 double galleryCommission;
	 double galleryCommissionRate = 0.2;
	 
    public Painting() {
		title ="Woah dude this lit";
		artist = "ACDJ";
		medium = "Abstract";
		price = 100000.20;
		galleryCommission = price*galleryCommissionRate;
	}
    public void setTitle(String title) {
		this.title = title;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public void setMedium(String medium) {
		this.medium = medium;
	}
	public void setPrice(double price) {
		this.price = price;
		galleryCommission = price*galleryCommissionRate;
	}
	public String getTitle() {
		return title;
	}
	public String getArtist() {
		return artist;
	}
	public String getMedium() {
		return medium;
	}
	public double getPrice() {
		return price;
	}
	public double getGalleryCommission() {
		return galleryCommission;
	}
	public void displayGalleryCommissionRate() {
		System.out.println("Gallery Comm rate: " + galleryCommissionRate);
	}
public static void main(String[] args) {
    Painting paint = new Painting();
    paint.printMessage();
	}
    public void printMessage() {
    System.out.println("The painting name is: " + title);
    System.out.println("The painting artist is: " + artist);
	System.out.println("The painting medium is: " + medium);
	System.out.println("The initial painting price is: " + price);
	System.out.println("The gallery commission rate is: " + galleryCommissionRate);
	System.out.println("The overall painting price including the commission rate is: " + galleryCommission);
    }
}