public class ShoppingCartTest {
 
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
 
        Item item1 = new Item("Burger", 50);
        Item item2 = new Item("Sandwich", 40);
 
        cart.addItem(item1);
        cart.addItem(item2);
 
        cart.pay(new SelfDeliveryStrategy("Some Name", 543));
        cart.pay(new ExternalDeliveryServiceStrategy("Some Name", "myemail@example.com", "Adress Example 45, 6"));
        cart.pay(new OwnDeliveryServiceStrategy("Some Name", "1234567890123456", "789", "10/11"));
    }
 
}