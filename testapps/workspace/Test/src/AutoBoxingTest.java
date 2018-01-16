import java.util.ArrayList;
import java.util.List;

public class AutoBoxingTest {

	public static void main(String[] args) {
		List<Double> weights = new ArrayList<>();
		weights.add(50.5);
		weights.add(new Double(60));
		weights.remove(50.5);
		double first = weights.get(0);
		System.out.println(first);
		//weights.add(50);
		
		glide(1, 2);
		
		play(4);
	}
	
	//public static String glide(int i1, int i2) {
	//	System.out.println("int");
	//	return "int";
	//}
	
	public static String glide(long l1, long l2) {
		System.out.println("long");
		return "long";
	}

	public static String glide(Integer i1, Integer i2) {
		System.out.println("Integer");
		return "Integer";
	}
	
	//public static void play(Integer i) {
	//	System.out.println("Integer");
	//}

	public static void play(long l) {
		System.out.println("long");
	}

	public static void play(Long l) {
		System.out.println("Long");
	}

	public static void play(Long... l) {
		System.out.println("Long...");
	}

}
