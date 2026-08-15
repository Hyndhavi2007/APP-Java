package Tutorial_2;
public class SchoolSystem {
    String name;
    int age;
    void display(){
        System.out.println("Name of the Student : " + name);
        System.out.println("Age of the Student: " + age);
    }
    public static void main(String[]args){
        SchoolSystem S1 = new SchoolSystem();
        SchoolSystem S2 = new SchoolSystem();
        S1.name = "Ram";
        S2.name = "Lakshanma";
        S1.age = 18;
        S2.age = 20;
        S1.display();
        S2.display();
    }
}
