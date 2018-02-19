public class PassingArgumentsToMethodsTest {

	public static void add(int x) {
		x++;
		System.out.println("expect x in local method add to be '100' and is: " + x);
	}

	public static void change(int x) {
		x++;
		System.out.println("expect x in local method change to be '100' and is: " + x);
	}

	
	public static void add(StringBuilder sb) {
		sb.append(", world!");
		System.out.println("expect sb in local method add to be 'Hello, world!' and is: " + sb);
	}

	public static void change(StringBuilder sb) {
		sb = new StringBuilder("Goodbye");
		System.out.println("expect sb in local method change to be 'Goodbye' and is: " + sb);
	}
	
	public static void add(String s) {
		s += ", world!";
		System.out.println("expect s in local method add to be 'Hello, world!' and is: " + s);
	}

	public static void change(String s) {
		s = new String("Goodbye");
		System.out.println("expect s in local method change to be 'Goodbye' and is: " + s);
	}
	
	
	public static void main(String[] args) {
		int x = 99;
		add(x);
		System.out.println("expect x in caller to be '99' and is: " + x);
		System.out.println("================================================================");

		x = 99;
		change(x);
		System.out.println("expect x in caller to be '99' and is: " + x);
		System.out.println("================================================================");

		StringBuilder sb = new StringBuilder("Hello");
		add(sb);
		System.out.println("expect sb in caller to be 'Hello, world!' and is: " + sb);
		System.out.println("================================================================");
		
		sb = new StringBuilder("Hello");
		change(sb);
		System.out.println("expect sb in caller to be 'Hello' and is: " + sb);
		System.out.println("================================================================");

		String s = new String("Hello");
		add(sb);
		System.out.println("expect sb in caller to be 'Hello' and is: " + s);
		System.out.println("================================================================");
		
		s = new String("Hello");
		change(sb);
		System.out.println("expect s in caller to be 'Hello' and is: " + s);
		System.out.println("================================================================");
	}
}
