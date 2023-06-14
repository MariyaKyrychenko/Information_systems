public class SelfDeliveryStrategy implements PaymentStrategy {
 
    private String name;
    private int id_order;
 
    public SelfDeliveryStrategy(String name, int id_order){
        this.name = name;
        this.id_order = id_order;
    }
    
    @Override
    public void pay(int amount) {
        System.out.println(amount + 0.00 + " paid for self-delivery");
    }
 
}