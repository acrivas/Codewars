package reverseWords;

public class KataVer2 {

	public static void main(String[] args) {
		
		String input = "The quick brown fox jumps over the lazy dog.";
		String output = reverseWords(input);
		System.out.println("input = " + input);
		System.out.println("output = " + output);

	}
	
	public static String reverseWords(final String original) {
		String[] originalArray = original.split(" ");
		StringBuilder word = new StringBuilder(original.length());
		StringBuilder reversedWord = new StringBuilder(original.length());
		int words = 1;
		for (int i = 0; i < original.length(); i++) {
			if(original.charAt(i) == ' ') {
				words++;
			}
		}
		StringBuilder[] outputArray = new StringBuilder[words];
		for(int i = 0; i < words; i++) {
			outputArray[i] = word.append(originalArray[i]).reverse();
			word.delete(0, original.length());
		}
		String output = outputArray[0] + " ";
		for (int i = 1; i < outputArray.length; i++) {
			output = output + outputArray[i] + " ";
		}
		return output.trim();
	}

}
