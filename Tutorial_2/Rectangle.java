package Tutorial_2;
public class Rectangle {
    int length;
    int breadth;
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    void display(){
        System.out.println("Length of the rectangle: " + length);
        System.out.println("Breadth of the Rectangle: " + breadth);
        int area = length * breadth;
        System.out.println("Area of the Rectangle: " + area );
    }
    public static void main(String[]args){
        Rectangle r1 = new Rectangle(100,200);
        r1.display();
    }
}
