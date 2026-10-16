package Tutorial_7;
class RemainingTime implements Runnable {

    public void run() {
        try {
            for (int i = 5; i >= 1; i--) {
                System.out.println(
                    Thread.currentThread().getName()
                    + " : Remaining time = " + i + " minutes"
                );
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class AutoSave implements Runnable {

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(
                    Thread.currentThread().getName()
                    + " : Auto-saving student answers"
                );
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class NetworkCheck implements Runnable {

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(
                    Thread.currentThread().getName()
                    + " : Checking network connection"
                );
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Online_Exam {
    public static void main(String[] args) {

        Thread t1 = new Thread(new RemainingTime());
        Thread t2 = new Thread(new AutoSave());
        Thread t3 = new Thread(new NetworkCheck());

        // Assigning thread names
        t1.setName("Timer Thread");
        t2.setName("AutoSave Thread");
        t3.setName("Network Thread");

        // Starting threads
        t1.start();
        t2.start();
        t3.start();
    }
}
