package application;

public class App {
	public static void main(String[] args) {
		
		//converting primitive types
		int intValue = 8;
		long longValue = intValue;
		//widening conversion
		
		System.out.println(longValue);
		
		long longValue2 = 12345;
		//int intValue2 = longValue2;
		//doesn't work
		
		int intValue3 = (int)longValue2;
		//have to "cast" to an int first
		
		System.out.println(intValue3);
		
		long longValue4 = 123456789123456789L;
		int intValue4 = (int)longValue4;
		
		System.out.println(intValue4);
		//doesn't look right because you can't
		//fit that many numbers in an int
		
		int intValue5 = 23;
		byte byteValue5 = (byte)intValue5;
		System.out.println(byteValue5);
		
	}
}
