package OnlineBanking.payment;
public class UPIPayment implements SecurePayment, OnlineTransaction {

    private String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment of Rs." + amount +
                           " made using UPI.");
        System.out.println("UPI ID: " + upiId);
    }

    @Override
    public void verifyPayment() {
        System.out.println("UPI payment verified successfully.");
    }
}
