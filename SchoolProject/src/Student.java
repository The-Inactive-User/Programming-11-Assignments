public class Student { //Student class

    //Create private strings for the parameters of a new Student object
    private String firstName;
    private String lastName;
    private String grade;
    private int id;

    private static int x = 1;


    Student(String firstName, String lastName, String grade){ //New student object constructor
        this.firstName = firstName; //private String firstName = String firstName from the parameter
        this.lastName = lastName;  //private String lastName = String lastName from the parameter
        this.grade = grade; //private String grade = String grade from the parameter
        this.id = x; //private String id = int x
        x++; //Every time a new student object is created, x increases by 1
    }


    //Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Format when student object is printed
    public String toString() {
        return "Name: " + this.firstName + " " + this.lastName + " | Grade: " + this.grade + " | ID: " + this.id +"\n";
    }
}
