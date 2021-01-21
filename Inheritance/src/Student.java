import java.io.StringReader;

public class Student extends Person {


    private int studentID;
    private int grade;
    private double gpa;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getGrade() {
        return grade;
    }

    public Student(String name, int age, int height, int weight, int studentID, int grade, double gpa) {
        super(name, age, height, weight);
        this.studentID = studentID;
        this.grade = grade;
        this.gpa = gpa;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void show() {

        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getHeight());
        System.out.println(getWeight());
        System.out.println(getStudentID());
        System.out.println(getGrade());
        System.out.println(getGpa());


    }

}
