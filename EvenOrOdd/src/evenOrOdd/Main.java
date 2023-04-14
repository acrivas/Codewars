package evenOrOdd;

public class Main {

	public static void main(String[] args) {
		
		int number = -1;
		String result = even_or_odd(number);
		System.out.println(result);

	}
	
	public static String even_or_odd(int number) {
		String result;
		if (number % 2 == 0) {
			result = "Even";
		} else {
			result = "Odd";
		}
		return result;
	}

}
