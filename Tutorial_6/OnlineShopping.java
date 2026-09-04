package Tutorial_6;
interface Payment {
    void pay(double amount);
}
class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Credit Card.");
    }
}
class UPIPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using UPI.");
    }
}
class NetBankingPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Net Banking.");
    }
}
public class OnlineShopping {
    public static void main(String[] args) {
        Payment payment;
        payment = new CreditCardPayment();
        payment.pay(2500);
        payment = new UPIPayment();
        payment.pay(1500);
        payment = new NetBankingPayment();
        payment.pay(5000);
    }
}
