public class Order extends Purchase {

	@Override
	public void Validation() {
	  //method's body
		System.out.println("2. The object has been validated.");
	}

	@Override
	public void AnswerFormation() {
	  //method's body
		System.out.println("4. Response received (including JSON-representation).");
	}

}