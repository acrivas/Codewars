package stringRepeat;

public class Solution {

	public static void main(String[] args) {
		
		String string = "Hello";
		int repeat = 3;
		String concatString = repeatStr(repeat, string);
		System.out.println(concatString);

	}
	
	public static String repeatStr(final int repeat, final String string) {
		String concatString = "";
		for (int i = 0; i < repeat; i++) {
			concatString = concatString.concat(string);
		}
		return concatString;
	}

}
