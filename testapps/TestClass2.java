public class TestClass2 {
	public static void main(String[] args) {
		// Add test code here
		int x = 0;
		while(++x < 5) { x+=1; }
		String message = x > 5 ? "Greater than" : "Less Than";
		
		// Add any print statements here
		System.out.println(message+","+x);
	}
}
