package sec03.exam01;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		String str = "1234";
		int num = Integer.parseInt(str);
		System.out.println(num);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);
	}

}
