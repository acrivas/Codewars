package oddOrEven;

public class Codewars {

	public static void main(String[] args) {
		
		int[] array = {};
		String result = oddOrEven(array);
		System.out.println(result);
		
	}
	
	public static String oddOrEven(int[] array) {
		String result;
		int sum = 0;
		int remainder;
		for(Integer x : array) {
			sum = sum + x;
		}
		remainder = sum % 2;
		if (remainder == 0) {
			result = "Even";
		} else {
			result = "Odd";
		}
		return result;
	}

}
