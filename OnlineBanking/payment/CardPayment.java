package OnlineBanking.payment;
public class CardPayment implements Payment, OnlineTransaction {
    private String cardNumber;
    public CardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Payment of Rs." + amount +
                           " made using Card.");
        System.out.println("Card Number: " + cardNumber);
    }
}