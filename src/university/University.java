package university;

public class University {
    public static void main(String[] args) {
        //Date date1 = new Date(1,1, 2000);
        Date date2 = new Date(2,2, 2004);

        Student student1 = new Student();
        student1.setfName("Ahmed");
        student1.setlName( "Samir");
        student1.setId( 1234);
        student1.setGpa( 2.3 );
        //student1.setDateOfBirth(date1); OR
        student1.setDateOfBirth(new Date(2,2, 2004) );

        Student student2 = new Student("Ali", "Ali", date2, 1256, 2.8);

        System.out.println(student1.getName() );
        System.out.println(student2.getName());
        System.out.println(student1.getDateOfBirth());
        System.out.println(student2.getDateOfBirth().getYear() );
        System.out.println(student2.getDateOfBirth().getYear() );
        System.out.println(student2.getDateOfBirth().getYear() );
        //System.out.println(student3.getSalary);

        //public static int counter ;
        System.out.println(student1.counter);
        System.out.println(student2.counter);
        System.out.println(Student.getCounter());
        System.out.println(Student.counter);



        Employee employee1 = new Employee("Omar", "Hany", new Date(2,8, 1994), 056, 5500, "HR");
        Employee employee2 = new Employee("Hady", "Mohamed", new Date(2,10, 1995), 056, 4000, "Teching");
        System.out.println(employee1.getName() );
        System.out.println(employee1.getSalary() );

    }
}