public abstract class Purchase {

	public final void dataProcessing(){
		getObject();
		Validation();
		RequestFormation();
		AnswerFormation();
		System.out.println("---- The data has been processed ----");
	}

	private void getObject() {
		//method's body
		System.out.println("1. The object has been received.");
	}

	public abstract void Validation();
	public abstract void AnswerFormation();

	private void RequestFormation() {
		//method's body	
		System.out.println("3. Your request has been processed.");
	}
}