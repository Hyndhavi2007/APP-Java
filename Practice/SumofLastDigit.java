package Practice;
import java.util.Scanner;
public class SumofLastDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of transaction: ");
        int n = sc.nextInt();
        int sum = 0; 
        System.out.println("Enter transaction amounts: ");
        for(int i = 0; i< n; i++){
            int transaction = sc.nextInt();
            int second = (transaction /10) % 10;
            sum += second;
            System.out.println("the sum of last digits are "+ second);
        }
        System.out.println(sum);
      
        sc.close();
    }
}
