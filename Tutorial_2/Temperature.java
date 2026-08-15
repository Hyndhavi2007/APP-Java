package Tutorial_2;
public class Temperature {
    float celsius;
    Temperature(float celsius){
        this.celsius = celsius;
    }
    void Fahrenheit(){
        System.out.println("Temperature in celsius: " + celsius);
         float fahrenheit = (9.0f/ 5.0f  * celsius) + 32;
         System.out.println("Temperature in fahrenheit: " + fahrenheit);
    }
    public static void main(String [] args){
        Temperature T1 = new Temperature(35);
        T1.Fahrenheit();
    }
}
