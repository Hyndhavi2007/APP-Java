package OnlineBanking;
import OnlineBanking.account.Account;
import OnlineBanking.account.SavingsAccount;
import OnlineBanking.account.CurrentAccount;
import OnlineBanking.payment.Payment;
import OnlineBanking.payment.UPIPayment;
import OnlineBanking.payment.CardPayment;
import OnlineBanking.payment.OnlineTransaction;
public class Main {
    public static void main(String[] args) {
        System.out.println("===== ACCOUNT DETAILS =====");
        Account account;
        account = new SavingsAccount(
            1001,
            "Arun Kumar",
            50000,
            6.5
        );
        account.displayDetails();
        System.out.println();
        account = new CurrentAccount(
            2001,
            "Priya Sharma",
            75000,
            25000
        );
        account.displayDetails();
        System.out.println("\n===== PAYMENT DETAILS =====");
        Payment payment;
        UPIPayment upi = new UPIPayment("arun@upi");
        upi.verifyPayment();
        upi.pay(2500);
        System.out.println();
        payment = new CardPayment("XXXX-XXXX-XXXX-1234");
        payment.pay(5000);
        System.out.println("\n===== ONLINE TRANSACTION CHECK =====");
        if (upi instanceof OnlineTransaction) {
            System.out.println("UPI Payment is an online transaction.");
        }
        if (payment instanceof OnlineTransaction) {
            System.out.println("Card Payment is an online transaction.");
        }
    }
}
