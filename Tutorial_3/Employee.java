package Tutorial_3;
class Employee {
    int employeeId;
    String employeeName;
    double salary;
    // Constructor - EMployee
    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }
    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Salary : " + salary);
    }
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Rahul", 45000);
        emp.displayDetails();
    }
}