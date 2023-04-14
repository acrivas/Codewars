package exesAndOhs;

public class XO {

	public static void main(String[] args) {
		
		String str = "zpzpzpp";
		boolean xEqualsO = getXO (str);
		System.out.println(xEqualsO);

	}
	
	public static boolean getXO (String str) {
		boolean same;
		int x = 0;
		int o = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'x' || str.charAt(i) == 'X') {
				x = x + 1;
			} else if (str.charAt(i) == 'o' || str.charAt(i) == 'O') {
				o = o + 1;
			}
		}
		same = (x == o);	
		System.out.println("x = " + x);
		System.out.println("o = " + o);
		return same;
	}

}
