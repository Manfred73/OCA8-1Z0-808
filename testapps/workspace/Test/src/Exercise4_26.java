import java.util.ArrayList;
import java.util.List;

public class Exercise4_26 {

	public static void main(String[] args) {
		List<Integer> ages = new ArrayList<>();
		ages.add(Integer.parseInt("5"));	// returns primitive int, autoboxing applied
		ages.add(Integer.valueOf("6"));		// returns Integer, no autoboxing applied
		ages.add(7);						// autoboxing applied
		ages.add(null);
		for (Integer age : ages) {
			System.out.println(age);		// prints 5, 6, 7, null
		}
		for (int age : ages) {
			System.out.println(age);		// prints 5, 6, 7, throws NullPointerException because it tries unbox null into int
		}
	}
}
