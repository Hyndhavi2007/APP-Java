package CollegeManagement.course;
public class Course {
    private String courseId;
    private String courseName;
    private int credits;
    private String faculty;

    public Course(String courseId, String courseName, int credits, String faculty) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
        this.faculty = faculty;
    }

    public void displayDetails() {
        System.out.println("Course ID   : " + courseId);
        System.out.println("Course Name : " + courseName);
        System.out.println("Credits     : " + credits);
        System.out.println("Faculty     : " + faculty);
    }
}
