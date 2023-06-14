public class OwnDeliveryServiceStrategy implements PaymentStrategy {
 
    private String name;
    private String cardNumber;
    private String cvv;
    private String date_of_expiry;
 
    public OwnDeliveryServiceStrategy(String name, String cardNumber, String cvv, String date_of_expiry){
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.date_of_expiry = date_of_expiry;
    }
    @Override
    public void pay(int amount) {
        System.out.println(amount + 10.00 + " paid for own delivery service");
    }
 
}