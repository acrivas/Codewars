package twoToOne;

import java.util.Arrays;

public class TwoToOne {

	public static void main(String[] args) {
		String s1 = "gato";
		String s2 = "pepo";
		String output = longest(s1, s2);
		System.out.println(output);
	}

	public static String longest(String s1, String s2) {
		String output;
		if (s1.isEmpty() && s2.isEmpty()) {
			output = "";
		} else {
			char[] auxArray = s1.concat(s2).toCharArray();
			Arrays.sort(auxArray);
			output = "" + auxArray[0];
			for (int i = 0; i < auxArray.length - 1; i++) {
				if (auxArray[i] != auxArray[i + 1]) {
					output = output + auxArray[i + 1];
				}
			}
		}
		return output;
	}

}
