package Tutorial_7;
class TransactionProcessing implements Runnable {

    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(
                    Thread.currentThread().getName()
                    + " : Transaction Processing - Execution " + i
                );
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class BalanceUpdating implements Runnable {

    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(
                    Thread.currentThread().getName()
                    + " : Balance Updating - Execution " + i
                );
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class SMSNotification implements Runnable {

    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(
                    Thread.currentThread().getName()
                    + " : SMS Notification - Execution " + i
                );
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
public class BankingApplication {
    public static void main(String[] args) {

        // Creating Thread objects
        Thread t1 = new Thread(new TransactionProcessing());
        Thread t2 = new Thread(new BalanceUpdating());
        Thread t3 = new Thread(new SMSNotification());

        // Assigning thread names
        t1.setName("Transaction Thread");
        t2.setName("Balance Thread");
        t3.setName("SMS Thread");

        // Starting threads
        t1.start();
        t2.start();
        t3.start();
    }
}
