package stringEndsWith;

public class Kata {

	public static void main(String[] args) {
		String str = "abc";
		String ending = "BC";
		Boolean match = solution(str, ending);
		System.out.println(match);
	}
	
	public static boolean solution(String str, String ending) {
		return str.endsWith(ending);
	}

}
