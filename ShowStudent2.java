class ShowStudent2 { 
    public static void main(String[] args){
    Student pupil = new Student();
    pupil.setIdNumber(9999);
    pupil.setPoints(12);
    pupil.setHours(3);

    pupil.showIdNumber();
    pupil.showPoints();
    pupil.showHours();
    System.out.println("Your grade point average is: " + pupil.getGradePoint());
   }
}