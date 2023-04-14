package printerErrors;

public class Printer {

	public static void main(String[] args) {
		
		String s="aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
		String errorRate = printerError(s);
		System.out.println(errorRate);

	}
	
	public static String printerError(String s) {
		String errorRate;
		int errors = 0;
		int l = s.length();
		for(int i = 0; i < l; i++) {
			if (s.charAt(i) > 'm') {
				errors++;
			}
		}
		errorRate = Integer.toString(errors) + "/" + Integer.toString(l);
		return errorRate;
	}

}
