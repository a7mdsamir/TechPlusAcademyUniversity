package university;

public class Person
{

    // 1- Attributes (instance variables)
    protected String fName;
    protected String lName;
    protected Date dateOfBirth;
    protected int id;


    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    // 2- Constructors
    public Person(){

    }

    // 3- Behavior (methods)
    public String getName(){
        return fName + " " + lName;
    }




}
