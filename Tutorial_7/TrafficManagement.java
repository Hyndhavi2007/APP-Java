package Tutorial_7;
class TrafficJunction extends Thread {

    private String junctionName;
    private int delay;

    public TrafficJunction(String junctionName, int delay) {
        this.junctionName = junctionName;
        this.delay = delay;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 3; i++) {

            System.out.println(
                Thread.currentThread().getName()
                + " - Traffic Status: "
                + getTrafficStatus()
            );

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }

    private String getTrafficStatus() {

        if (junctionName.equals("Junction 1")) {
            return "Heavy Traffic";
        } 
        else if (junctionName.equals("Junction 2")) {
            return "Moderate Traffic";
        } 
        else {
            return "Light Traffic";
        }
    }
}

public class TrafficManagement {

    public static void main(String[] args) {

        TrafficJunction j1 =
            new TrafficJunction(
                "Junction 1",
                1000
            );

        TrafficJunction j2 =
            new TrafficJunction(
                "Junction 2",
                1500
            );

        TrafficJunction j3 =
            new TrafficJunction(
                "Junction 3",
                2000
            );

        j1.setName("Traffic Junction 1");
        j2.setName("Traffic Junction 2");
        j3.setName("Traffic Junction 3");

        j1.start();
        j2.start();
        j3.start();
    }
}