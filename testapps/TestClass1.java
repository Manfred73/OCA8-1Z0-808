public class TestClass1 {
	public static void main(String[] args) {
		// Add test code here
		float value1 = 102;
		float value2 = (int)102.0;
		//float value3 = 1f * 0.0;	// TestClass1.java:6: error: incompatible types: possible lossy conversion from double to float
									//					float value3 = 1f * 0.0;
									//									  ^
		float value4 = 1f * (short)0.0;
		float value5 = 1f * (boolean)0;	//TestClass1.java:10: error: incompatible types: int cannot be converted to boolean
										//					float value5 = 1f * (boolean)0;
                                        //											     ^
		
		// Add any print statements here
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		//System.out.println("value3: " + value3);
		System.out.println("value4: " + value4);
		//System.out.println("value5: " + value5);
	}
}
