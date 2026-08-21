package Tutorial_3;
import java.util.Scanner;
public class Attendance {
    public static void main(String [] args){
        int n = 0;
        int [] attendance = new int[7];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the attendance value (1 for present & 0 for absent): ");
        for(int i = 0; i< 7; i++){
            attendance[i] = sc.nextInt();
            n += attendance[i];
        }
        if(((double)n / 7) * 100 >= 75){
            System.out.println("Eligible for Exam!");
        } else {
            System.out.println("Not Eligible!");
        }
        sc.close();
    }
}
