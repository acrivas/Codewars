package isogram;

public class Isogram {

	public static void main(String[] args) {
		
		String str = "moOose";
		boolean result = isIsogram(str);
		System.out.println(result);

	}
	
	public static boolean isIsogram(String str) {
		boolean result = true;
		str = str.toLowerCase();
		int j;
		for(int i = 0; i < str.length(); i++) {
			j = i+1;
			while (result && j < str.length()){
				result = !(str.charAt(i) == str.charAt(j));
				j++;
			}
		}
		return result;
	}

}
