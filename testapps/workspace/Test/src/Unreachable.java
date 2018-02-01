
public class Unreachable {

	public static void main(String[] args) {
		int hoursOfDay = 10;
		if (hoursOfDay < 15) {
			 System.out.println("hoursOfDay " + hoursOfDay + " < 15");
		} else if (hoursOfDay < 11) {
			 System.out.println("hoursOfDay " + hoursOfDay + " < 11");
		} else {
			System.out.println("");
		}
	}
}
