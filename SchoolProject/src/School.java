import java.util.ArrayList; //Import the Arraylist class

public class School { //School class
    ArrayList<Teacher> teachers = new ArrayList<>(); //Arraylist to store teachers
    ArrayList<Student> students = new ArrayList<>(); //Arraylist to store students

    //Create private strings for the parameters of a new School object
    private String schoolName;
    private String schoolAddress;
    private String schoolDistrict;

    School(String schoolName, String schoolAddress, String schoolDistrict){ //New school object constructor
        this.schoolName = schoolName; //private String schoolName = String schoolName from the parameter
        this.schoolAddress = schoolAddress; //private String schoolAddress = String schoolAddress from the parameter
        this.schoolDistrict = schoolDistrict; //private String schoolDistrict = String schoolDistrict from the parameter

    }

    //Getters and setters
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    public String getSchoolDistrict() {
        return schoolDistrict;
    }

    public void setSchoolDistrict(String schoolDistrict) {
        this.schoolDistrict = schoolDistrict;
    }


    //Methods
    public void addTeacher(Teacher teacher){ //addTeacher method
        teachers.add(teacher); //Add a teacher object to the teachers Arraylist
        }
    public void addStudent(Student student){ //addStudent method
        students.add(student); //Add a student object to the students Arraylist
    }
    public void deleteTeacher(Teacher teacher){ //deleteTeacher method
        teachers.remove(teacher); //Delete a teacher object from the teachers Arraylist
    }
    public void deleteStudent(Student student){ //deleteStudent method
        students.remove(student); //Delete a student object from the students Arraylist
    }
    public void showTeachers(){ //showTeachers method
        System.out.println(teachers); //Print the entire teachers Arraylist
    }
    public void showStudents(){ //showStudents method
        System.out.println(students); //Print the entire students Arraylist
    }

}