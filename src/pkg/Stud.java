package pkg;

public class Stud {
    private String firstName;
    private String lastName;
    private int age;
    private double cgpa;
    private String dept;

    public Stud(String firstName, String lastName, String dept, int age, double cgpa) {
        setFirstName(firstName);
        setLastName(lastName);
        setDept(dept);
        setAge(age);
        setCGPA(cgpa);
    }

    public String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDept() {
        return dept;
    }

    private void setDept(String dept) {
        this.dept = dept;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public double getCGPA() {
        return cgpa;
    }

    private void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }

    public String getCollege() {
        return "NIE";
    }
}
