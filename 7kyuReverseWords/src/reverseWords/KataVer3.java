//NO FUNCIONA CON UN INPUT " ".

package reverseWords;

public class KataVer3 {

	public static void main(String[] args) {

		String input = "   ";
		String output = reverseWords(input);
		System.out.println("input = " + input);
		System.out.println("output = " + output);

	}

	public static String reverseWords(final String original) {
		int j = 0;
		boolean workable = false;
		String output = original;
		String aux;
		while (j < original.length() && !workable) {
			if (original.charAt(j) != ' ') {
				workable = true;
			}
			j++;
		}
		if (workable) {
			String[] originalArray = original.split(" ");
			int maxWordLength = originalArray[0].length();
			for (int i = 1; i < originalArray.length; i++) {
				if (originalArray[i].length() > maxWordLength) {
					maxWordLength = originalArray[i].length();
				}
			}
			StringBuilder word = new StringBuilder(maxWordLength);
			StringBuilder reversedWord = new StringBuilder(maxWordLength);
			String[] outputArray = new String[originalArray.length];
			for (int i = 0; i < originalArray.length; i++) {
				reversedWord = word.append(originalArray[i]).reverse();
				outputArray[i] = reversedWord.toString();
				word.delete(0, maxWordLength);
			}
			aux = outputArray[0] + " ";
			for (int i = 1; i < outputArray.length; i++) {
				aux = aux + outputArray[i] + " ";
			}
			output = aux.trim();
		} 
		return output;
	}

}
