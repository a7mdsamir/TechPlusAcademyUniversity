package university;

public class Employee extends Person {


    // 1- Attributes (instance variables)
    private double salary;
    private String department;



    // 2- Constructors
    public Employee(){
        fName = "N/A";
        lName = "N/A";
        dateOfBirth = new Date();
        id = 0000;
        salary = 1000;
        department = "N/A";
    }
    public Employee(String fName, String lName, Date dateOfBirth, int id, double salary, String department){
        this.fName = fName;
        this.lName = lName;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        this.salary = salary;
        this.department = department;

    }


    // 3- Behavior (methods)
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void increaseSalary(double b){
        salary = salary + b ;
    }


}
