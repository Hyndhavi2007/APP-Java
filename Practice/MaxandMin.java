package Practice;
public class MaxandMin{
    public static void main (String[]args){
        int [] numbers = { 23,894,76,90,56,9};
        int minimum;
        int maximum;
        minimum = numbers[0];
        maximum = numbers[0];
        for(int i = 1; i < numbers.length;i++){
            if(numbers[i] < minimum){
                minimum = numbers[i];
            } else if( numbers[i] > maximum){
                maximum = numbers[i];
            }
        }
        System.out.println("The maximum number from the array is " + maximum);
        System.out.println("The minimum number from the array is " + minimum);
    }
}