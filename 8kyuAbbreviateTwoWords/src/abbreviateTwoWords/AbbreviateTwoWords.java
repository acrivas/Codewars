package abbreviateTwoWords;

public class AbbreviateTwoWords {

	public static void main(String[] args) {
		
		String name = "john D";
		String initials = abbrevName(name);
		System.out.println(initials);

	}
	
	public static String abbrevName(String name) {
		String nameUC = name.toUpperCase().trim().replaceAll(" ", ".");
		StringBuilder initials = new StringBuilder(nameUC.substring(0, 1));
		initials.append(".");
		int i = 1;
		while (nameUC.charAt(i) != '.') {
			i++;
		}
		initials.append(nameUC.charAt(i+1));
		String initialsOutput = initials.toString();
		return initialsOutput;
	}

}
