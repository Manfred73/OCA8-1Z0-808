
public class IncrementDecrementOperatorsTest {

	public static void main(String[] args) {
		int[] xa1 = { 0, 1, 2, 3, 4 };
		int idx = 0;
		xa1[++idx] = xa1[idx] + 1000;
		for (int v : xa1) {
			System.out.println("> " + v);
		}

		System.out.println("**********");
		
		int[] xa2 = { 0, 1, 2, 3, 4 };
		idx = 0;
		xa2[idx++] = xa2[idx] + 1000;
		for (int v : xa2) {
			System.out.println("> " + v);
		}

	}
}
