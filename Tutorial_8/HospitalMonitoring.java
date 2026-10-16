package Tutorial_8;
class EmergencyAlert extends Thread {
    public void run() {
        System.out.println(getName() + " - Priority: " + getPriority());
        for (int i = 1; i <= 3; i++) {
            System.out.println("Emergency Alert: Checking critical patient...");
        }
    }
}

class VitalMonitor extends Thread {
    public void run() {
        System.out.println(getName() + " - Priority: " + getPriority());
        for (int i = 1; i <= 3; i++) {
            System.out.println("Vital Monitor: Checking vital signs...");
        }
    }
}

class ReportGenerator extends Thread {
    public void run() {
        System.out.println(getName() + " - Priority: " + getPriority());
        for (int i = 1; i <= 3; i++) {
            System.out.println("Report Generator: Preparing report...");
        }
    }
}

public class HospitalMonitoring {
    public static void main(String[] args) {

        EmergencyAlert emergency = new EmergencyAlert();
        VitalMonitor vital = new VitalMonitor();
        ReportGenerator report = new ReportGenerator();

        emergency.setName("EmergencyAlert");
        vital.setName("VitalMonitor");
        report.setName("ReportGenerator");

        emergency.setPriority(Thread.MAX_PRIORITY); // 10
        vital.setPriority(Thread.NORM_PRIORITY);     // 5
        report.setPriority(Thread.MIN_PRIORITY);     // 1

        emergency.start();
        vital.start();
        report.start();
    }
}