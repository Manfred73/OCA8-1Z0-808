
public class ArrayEqualityTest {

	public static void main(String[] args) {
		String[] bugs = { "cricket", "beetle", "ladybug" };
		String[] alias = bugs;
		String[] bugs2 = { "scutelleridae", "grasshopper", "stink bug" };
		String[] alias2 = bugs;
		String[] alias3 = bugs2;
		System.out.println(bugs.equals(alias));
		System.out.println(bugs2.equals(alias2));
		System.out.println(bugs2.equals(alias3));
		System.out.println(bugs.toString());
	}
}
