package Tutorial_2;
public class StudentRegistrationSystem{
    String name;
    int rollnumber;
    StudentRegistrationSystem(String name, int rollnumber){
        this.name = name;
        this.rollnumber = rollnumber;
    }
    void display(){
        System.out.println("Student Name: " + name);
        System.out.println("Student Roll Number: " + rollnumber);
    } 
    public static void main(String[]args){
        StudentRegistrationSystem S1 = new StudentRegistrationSystem("Ram", 120);
        S1.display();
    }
}
