
public class MethodOverloadingTest {

	public static void main(String[] args) {
		//fly(new int[] {1, 2, 3} );
		//fly(1, 2, 3);
		//fly(new Integer(3));
		fly((int)123L);
	}

	//public static void fly(int[] lengths) {
	//	System.out.println(lengths.length);
	//}

	//public static void fly(int...lengths) {
	//	System.out.println(lengths.length);
	//}
	
	public static void fly(int numMiles) {
		System.out.println("primitive int");
	}
	
	//public static void fly(Integer numMiles) {
	//	System.out.println("object Integer");
	//}
}
