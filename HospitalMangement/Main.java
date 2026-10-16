package HospitalMangement;
import HospitalMangement.doctor.Doctor;
import HospitalMangement.patient.Patient;

public class Main {
  public static void main(String[] args) {

        // Creating doctors
        Doctor d1 = new Doctor(101, "Dr. Ravi", "Cardiologist", 1000);
        Doctor d2 = new Doctor(102, "Dr. Priya", "Dermatologist", 800);

        // Creating patients
        Patient p1 = new Patient(201, "Arun", "Heart Disease", 45);
        Patient p2 = new Patient(202, "Meena", "Skin Allergy", 30);
        Patient p3 = new Patient(203, "Karthik", "Heart Disease", 50);

        // Assigning patients to doctors
        Doctor doctorForP1 = d1;
        Doctor doctorForP2 = d2;
        Doctor doctorForP3 = d1;

        // Display patient and doctor details
        System.out.println("===== PATIENT 1 =====");
        p1.display();
        System.out.println("\nTreating Doctor:");
        doctorForP1.display();

        System.out.println("\n===== PATIENT 2 =====");
        p2.display();
        System.out.println("\nTreating Doctor:");
        doctorForP2.display();

        System.out.println("\n===== PATIENT 3 =====");
        p3.display();
        System.out.println("\nTreating Doctor:");
        doctorForP3.display();

        // Count patients assigned to each doctor
        int patientsForD1 = 2;
        int patientsForD2 = 1;

        double totalD1 = patientsForD1 * d1.getConsultationFee();
        double totalD2 = patientsForD2 * d2.getConsultationFee();

        System.out.println("\n===== CONSULTATION FEE =====");
        System.out.println(d1.getName() + " collected: " + totalD1);
        System.out.println(d2.getName() + " collected: " + totalD2);
    }  
}
