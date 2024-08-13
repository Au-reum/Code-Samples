public class Student { 
    private int studentID = 1234;
    int credits = 4;
    int points = 10;
    double gpa = 95.3;
public void setID(double ID) {
    ID = studentID;
}
public int getID() {
    return studentID;
}
public void setCredits(int credit) {
    credit = credits;
}
public int getCredits() {
    return credits;
}
public void setPoints(int point) {
    point = points;
}
public double getPoints() {
    return points;
}
public double calculateGPA(double gradepoint) {
    gradepoint = points/credits;
    return gradepoint;
}
public static void main(String[] args) {
        Student student = new Student();
        student.printMessage();
    }
    public void printMessage() {
    System.out.println("The student ID is: " + studentID);
    System.out.println("The number of credits is: " + credits);
    System.out.println("The number of points is: " + points);
    System.out.println("The GPA is: " + gpa);
  }
 }