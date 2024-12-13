package university;

public class Student extends Person {

    // 1- Attributes (instance variables)
    private double gpa;
    public static int counter ;


    // 2- Constructors
    public Student(){
        fName = "N/A";
        lName = "N/A";
        dateOfBirth = new Date();
        id = 0000;
        gpa = 0;
        counter++;
    }
    public Student(String fName, String lName, Date dateOfBirth, int id, double gpa){
        this.fName = fName;
        this.lName = lName;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        this.gpa = gpa;
        counter ++;
    }


    // 3- Behavior (methods)
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void increaseGPA(double b){
        gpa = gpa + b ;
    }

    public static int getCounter(){
        return counter;
    }


}
