public class Main { //Main class

    public static void main(String[] args) {

    //Create a new School object with parameters
    School DavidThompson = new School("David Thompson Secondary School","1755 E 55th Ave, Vancouver", "District #39");


    //Create 3 new Teacher objects with parameters
    Teacher Adam = new Teacher("Adam","Lai", "Mathematics");
    Teacher John = new Teacher("John","Macleod", "English");
    Teacher Nancy = new Teacher("Nancy","Fulton", "Science");


    //Creates 10 new Student objects with parameters
    Student Jack = new Student("Jack", "Li","9");
    Student Brian = new Student("Brian", "Nguyen","8");
    Student Zach = new Student("Zach", "Wong","11");
    Student Ben = new Student("Ben", "Williams","10");
    Student Emily = new Student("Emily", "Park","11");
    Student Alex = new Student("Alex", "Singh","12");
    Student Jeffrey = new Student("Jeffrey", "Chu","9");
    Student Lucas = new Student("Lucas", "Lee","8");
    Student Jennifer = new Student("Jennifer", "Ngo","10");
    Student Olivia = new Student("Olivia", "Anderson","12");


    System.out.println(DavidThompson.getSchoolName()); //Using the schoolName getter in the School class to get the school name
    System.out.println(DavidThompson.getSchoolAddress()); //Using the schoolAddress getter in the School class to get the school address
    System.out.println(DavidThompson.getSchoolDistrict()); //Using the schoolDistrict getter in the School class to get the school district
    System.out.println("\n"); //Print new line

    // Using the .addTeacher method in the School class to add the teachers
    DavidThompson.addTeacher(Adam);
    DavidThompson.addTeacher(John);
    DavidThompson.addTeacher(Nancy);

    // Using the .addStudent method in the School class to add the students
    DavidThompson.addStudent(Jack);
    DavidThompson.addStudent(Brian);
    DavidThompson.addStudent(Zach);
    DavidThompson.addStudent(Ben);
    DavidThompson.addStudent(Emily);
    DavidThompson.addStudent(Alex);
    DavidThompson.addStudent(Jeffrey);
    DavidThompson.addStudent(Lucas);
    DavidThompson.addStudent(Jennifer);
    DavidThompson.addStudent(Olivia);


    System.out.println("List of Teachers: ");
    DavidThompson.showTeachers(); //Using the .showTeachers method in the School class to show all the teachers stored in the Arraylist
    System.out.println("List of Students: ");
    DavidThompson.showStudents(); //Using the .showStudents method in the School class to show all the students stored in the Arraylist

    //Using the .deleteStudent method in the School class to delete the student
    DavidThompson.deleteStudent(Jack);
    DavidThompson.deleteStudent(Emily);
    //Print out which students were removed
    System.out.println("Removed "+Jack.getFirstName()+" "+Jack.getLastName()+" (in Grade "+Jack.getGrade()+") and "+Emily.getFirstName()+" "+Emily.getLastName()+ " (in Grade "+Emily.getGrade()+")");

    //Using the .deleteTeacher method in the School class to delete the teacher
    DavidThompson.deleteTeacher(John);
    //Print out which teacher was removed
    System.out.println("Removed "+John.getFirstName()+" "+John.getLastName()+" ("+John.getSubject()+")\n");

    System.out.println("-----------------------------------------------------------------------------------");


    System.out.println(DavidThompson.getSchoolName());
    System.out.println(DavidThompson.getSchoolAddress());
    System.out.println(DavidThompson.getSchoolDistrict());
    System.out.println("\n");
    System.out.println("List of Teachers: ");
    DavidThompson.showTeachers();
    System.out.println("List of Students: ");
    DavidThompson.showStudents();
    }
}
