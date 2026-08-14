package Tutorial_2;
import java.util.Scanner;
public class Student{
    String name;
    int rollnumber;
    String department;
    void display(){
        System.out.println("====Student Details====\n");
        System.out.println("Name: "+ name);
        System.out.println("Roll Number: " + rollnumber);
        System.out.println("Department: " + department);
    }
}
 class StudentDemo{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of the student: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        int rollnumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Department: ");
        String department = sc.nextLine();
        
        Student s1 = new Student();
        s1.name = name;
        s1.rollnumber = rollnumber;
        s1.department = department;
        s1.display();
        sc.close();
    }

}