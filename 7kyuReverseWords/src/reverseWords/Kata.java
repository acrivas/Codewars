package reverseWords;

public class Kata {

	public static void main(String[] args) {
		
		String input = "This is an example";
		String output = reverseWords(input);
		System.out.println("input = " + input);
		System.out.println("output = " + output);

	}
	
	public static String reverseWords(final String original) {
		String output;
		String aux2;
		String[] aux3;
		int j;
		StringBuilder aux1 = new StringBuilder(original);
		aux1.reverse();
		aux2 = aux1.toString();
		aux3 = aux2.split(" ");
		j = aux3.length;
		String[] aux4 = new String[j];
		for(int i = 0; i < aux3.length; i++ ) {
			aux4[i] = aux3[j - 1];
			j--;
		}
		output = aux4[0] + " ";
		for (int i = 1; i < aux4.length; i++) {
			output = output + aux4[i] + " ";
		}
		output.trim();
		return output;
	}

}
