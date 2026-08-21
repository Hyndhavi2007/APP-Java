package Tutorial_3;
class Car {
    String modelName;
    double price;
    // Default constructor
    Car() {
        modelName = "Not Available";
        price = 0;
    }
    // Constructor with model name
    Car(String modelName) {
        this.modelName = modelName;
        price = 0;
    }
    // Constructor with model name and price
    Car(String modelName, double price) {
        this.modelName = modelName;
        this.price = price;
    }
    void display() {
        System.out.println("Model Name : " + modelName);
        System.out.println("Price : " + price);
        System.out.println();
    }
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("BMW");
        Car car3 = new Car("Audi", 5000000);
        car1.display();
        car2.display();
        car3.display();
    }
}
