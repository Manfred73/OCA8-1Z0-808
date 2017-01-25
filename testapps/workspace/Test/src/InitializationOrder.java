public class InitializationOrder {
	public InitializationOrder() {
		System.out.println("Number before changing it in constructor should be 4 and is: " + number);
		number = 5;
		System.out.println("Number after changing it in constructor should be 5 and is: " + number);
	}

	public static void main(String[] args) {
		InitializationOrder io = new InitializationOrder();
		System.out.println("Number after calling constructor should be 5 and is: " + io.number);
	}
	
	private int number = 3;

	{ 
		System.out.println("Number before changing it in instance initializer should be 3 and is: " + number);
		number = 4;
		System.out.println("Number after changing it in instance initializer should be 4 and is: " + number);
	}
}
