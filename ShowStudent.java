import java.util.Scanner;

class ShowStudent{

public static void main (String args[]) {
	int idNumber, points, hours;
    Student pupil = new Student();
	Scanner input = new Scanner(System.in);
	System.out.print("Please Enter your ID Number: ");
	idNumber = input.nextInt();
	System.out.print("Please Enter points earned: ");
	points = input.nextInt();
	System.out.print("Please Enter credit hours: ");
	hours = input.nextInt();

	pupil.setIdNumber(idNumber);
	pupil.setPoints(points);
	pupil.setHours(hours);

	pupil.showIdNumber();
	pupil.showPoints();
	pupil.showHours();
	System.out.println("Your grade point average is: " + pupil.getGradePoint());
   }
}