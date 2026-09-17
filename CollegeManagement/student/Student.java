package  CollegeManagement.student;
public class Student {
    private int studentId;
    private String name;
    private String department;
    private String email;

    public Student(int studentId, String name, String department, String email) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
        this.email = email;
    }

    public void displayDetails() {
        System.out.println("Student ID : " + studentId);
        System.out.println("Name       : " + name);
        System.out.println("Department : " + department);
        System.out.println("Email      : " + email);
    }
}