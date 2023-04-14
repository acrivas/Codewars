package disembowelTrolls;

public class Troll {

	public static void main(String[] args) {
		
		String in;
		String out;
		in = "This website is for losers LOL!";
		out = disemvowel(in);
		System.out.println(out);

	}
	
	public static String disemvowel(String str) {
		String outArr[];
		String outStr;
		outArr = str.split("[aeiouAEIOU]");
		outStr = outArr[0];
		for(int i = 1; i < outArr.length; i++ ) {
			outStr = outStr.concat(outArr[i]);
		}
		return outStr;
	}

}
