package sec01.exam06;

public class StringConcatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "JDk" + 6.0;
		String str2 = str1 + "특징";
		System.out.println(str2);
		
		String str3 = "JDk" + 3 + 3.0;
		String str4 = 3 + 3.0 + "JDk";
		System.out.println(str3);
		System.out.println(str4);
	}

}
