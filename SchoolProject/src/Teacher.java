public class Teacher { //Teacher class

    //Create private strings for the parameters of a new Teacher object
    private String firstName;
    private String lastName;
    private String subject;

    Teacher(String firstName, String lastName, String subject){//New teacher object constructor
        this.firstName = firstName; //private String firstName = String firstName from the parameter
        this.lastName = lastName; //private String lastName = String lastName from the parameter
        this.subject = subject; //private String subject = String subject from the parameter

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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    //Format when teacher object is printed
    public String toString() {
        return "Name: "+ this.firstName + " " + this.lastName + " | Subject: " + this.subject + "\n";
    }
}
