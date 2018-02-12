import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ArrayTest {

	public static void main(String[] args) {
		char[]c = new char[2];
		
		ArrayList l = new ArrayList();
	
		List<Integer> ages = new ArrayList<>();
		
		// Four ways to declare and initialize arrays:
		int[] numbers2 = new int[] { 42, 55, 99 }; // initialize in declaration without defining size
		int[] numbers3 = {42, 55, 99}; // or use anonymous array; no need to specify type and size (Java already knows the type of the initial values and also the size)
		int[] numbers4 = new int[3]; numbers4[0] = 42; numbers4[1] = 55; numbers4[2] = 99; // or declare array with size and then assign values separately using index
		int[] numbers5; numbers5 = new int[3]; numbers5[0] = 42; numbers5[1] = 55; numbers5[2] = 99; // or declare and initialize size separately; then assign values separately using index
	}
}
