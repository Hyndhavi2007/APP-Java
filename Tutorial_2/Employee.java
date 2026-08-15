package Tutorial_2;
public class Employee {
    String name;
    int employeeId;
    void display(){
        System.out.println("======Employee Details=====");
        System.out.println("Name of the Employee: " + name);
        System.out.println("Employee ID of " + name + "is " + employeeId);
    }
    public static void main(String[]args){
        Employee E1 = new Employee();
        Employee E2 = new Employee();
        E1. name = "Narayana";
        E2.name = "Shiva";
        E1.employeeId = 12345;
        E2.employeeId = 12346;
        E1.display();
        E2.display();

    }
}
