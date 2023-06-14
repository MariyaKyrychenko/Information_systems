public class Main {

	public static void main(String[] args) {

	  System.out.println("************ Product ************");		

		Purchase entity = new Product();
		entity.dataProcessing();
		System.out.println(" ");
		
		System.out.println("************ User ************");
		entity = new User();
		entity.dataProcessing();
		System.out.println(" ");
		
		System.out.println("************ Order ************");
		entity = new Order();
		entity.dataProcessing();
	}

}