package CollegeManagement;
import CollegeManagement.student.Student;
import CollegeManagement.course.Course;
public class Main {
    public static void main(String[] args) {

        Student student = new Student(
            101,
            "Arun Kumar",
            "Computer Science",
            "arun@gmail.com"
        );

        Course course = new Course(
            "CS101",
            "Java Programming",
            4,
            "Dr. Ravi"
        );

        System.out.println("===== STUDENT INFORMATION =====");
        student.displayDetails();

        System.out.println("\n===== COURSE INFORMATION =====");
        course.displayDetails();
    }
}