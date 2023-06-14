public class User extends Purchase {

	@Override
	public void Validation() {
	  //method's body
		System.out.println("2. You can't change this field.");
	}

	@Override
	public void AnswerFormation() {
	  //method's body
		System.out.println("4. Response received.");
	}

}