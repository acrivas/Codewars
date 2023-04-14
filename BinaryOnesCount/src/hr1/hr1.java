package hr1;

import java.util.Scanner;

public class hr1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a positive integer number");
		int n = sc.nextInt();
		int output;
		while(n<0) {
			System.out.println("Number is not positive, please type a positive integer number");
			n = sc.nextInt();
		}
		output = getOnesFromBinary(n);
		System.out.println("manual count = " + output);
		System.out.println("count with Integer class = " + countBits(n));
		sc.close();
				
	}

	public static int getOnesFromBinary(int n) {
		int ones = 0;
		if (n != 0) {
			StringBuilder bynaryNumber = new StringBuilder();
			while (n > 0) {
				bynaryNumber.append(n % 2);
				n = n / 2;
			}
			bynaryNumber.reverse();
			for (int i = 0; i < bynaryNumber.length(); i++ ) {
				if (bynaryNumber.charAt(i) == '1') {
					ones++;
				} 
			}
		}		
		return ones;
	}
	
	public static int countBits(int n) {
		int ones = Integer.bitCount(n);
		return ones;
	}
}
