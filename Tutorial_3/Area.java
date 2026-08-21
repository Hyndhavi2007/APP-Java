package Tutorial_3;
class Area {
    // Area of square
    double calculateArea(int side) {
        return side * side;
    }
    // Area of rectangle
    double calculateArea(int length, int breadth) {
        return length * breadth;
    }
    // Area of circle
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
        Area obj = new Area();

        System.out.println("Area of Square : " + obj.calculateArea(5));
        System.out.println("Area of Rectangle : " + obj.calculateArea(10, 5));
        System.out.println("Area of Circle : " + obj.calculateArea(7.0));
    }
}