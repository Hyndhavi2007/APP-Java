package Tutorial_4;
import java.util.Scanner;
class Student {
    int rollNo;
    String name;
    int[] marks = new int[3];
    double attendance;
    Student(int rollNo, String name, int m1, int m2, int m3, double attendance) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks[0] = m1;
        this.marks[1] = m2;
        this.marks[2] = m3;
        this.attendance = attendance;
    }
    double calculateAverage() {
        int total = 0;
        for (int i = 0; i < 3; i++) {
            total += marks[i];
        }
        return total / 3.0;
    }
    void display() {
        int total = 0;
        for (int i = 0; i < 3; i++) {
            total += marks[i];
        }
        double average = total / 3.0;
        String result = (average >= 50) ? "Pass" : "Fail";
        String scholarship = (average >= 75 && attendance >= 80)
                ? "Eligible"
                : "Not Eligible";
        String performance = (average >= 85)
                ? "Excellent"
                : "Good";
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Result: " + result);
        System.out.println("Scholarship: " + scholarship);
        System.out.println("Performance: " + performance);
        System.out.println("Attendance: " + attendance + "%");
        System.out.println();
    }
}

public class StudentPerfomance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Student " + (i + 1) + " details:");

            System.out.print("Roll Number: ");
            int rollNo = sc.nextInt();

            sc.nextLine();

            System.out.print("Student Name: ");
            String name = sc.nextLine();

            System.out.print("Mark 1: ");
            int m1 = sc.nextInt();

            System.out.print("Mark 2: ");
            int m2 = sc.nextInt();

            System.out.print("Mark 3: ");
            int m3 = sc.nextInt();

            System.out.print("Attendance Percentage: ");
            double attendance = sc.nextDouble();

            students[i] = new Student(
                    rollNo, name, m1, m2, m3, attendance
            );

            System.out.println();
        }

        System.out.println("----- STUDENT PERFORMANCE -----");

        double highestAverage = -1;
        String highestStudent = "";

        for (int i = 0; i < 5; i++) {
            students[i].display();

            double average = students[i].calculateAverage();

            if (average > highestAverage) {
                highestAverage = average;
                highestStudent = students[i].name;
            }
        }

        System.out.println("----- HIGHEST AVERAGE -----");
        System.out.println("Student Name: " + highestStudent);
        System.out.println("Highest Average: " + highestAverage);

        sc.close();
    }
}