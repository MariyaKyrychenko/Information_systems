public class ExternalDeliveryServiceStrategy implements PaymentStrategy {
 
    private String name;
    private String email;
    private String adress;
 
    public ExternalDeliveryServiceStrategy(String name, String email, String adress){
        this.name = name;
        this.email = email;
        this.adress = adress;
    }
 
    @Override
    public void pay(int amount) {
        System.out.println(amount + 20.00 + " paid for external delivery service.");
    }
 
}