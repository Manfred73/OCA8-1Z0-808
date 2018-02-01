
public class BasicForLoop {

	public static void main(String[] args) {
		int x = 0;
		long y = 10;
		for (y = 0, x = 4; x < 5 && y < 10; x++, y++) {
			System.out.println(x +  " ");
		}
		
		int t;
		int a = 0;
		int b = 0;
		int c = 0;
		for (t = (int) (Math.random() * 10.0); a < 5; a++, b += 10, sayHello()) {
			System.out.println("tick... " + t + " / b: " + b);
		}
	}
	public static void sayHello() {
		System.out.println("Hello");
	}
}
