package Tutorial_3;
import java.util.Scanner;
public class Supermarket{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int prices[] = new int[5];
        int Total = 0;
        for(int i = 0; i< 5; i++){
            prices[i] = sc.nextInt();
            Total += prices[i];
        }
        if(Total < 5000){
            System.out.println("No discount");
            System.out.println("The total bill: "+ Total);
        } else{
            System.out.println("Discount Applicable");
            System.out.println("Total Bill : "+ Total);
        }
        sc.close();
    }
}