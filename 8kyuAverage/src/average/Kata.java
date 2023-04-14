package average;

public class Kata {

	public static void main(String[] args) {
		
		int[] arr = {2, 3};
		double av = find_average(arr);
		System.out.println(av);

	}
	
	public static double find_average(int[] array) {
		double av = 0;
		if (array.length != 0) {
			int sum = 0;
			for (Integer x : array) {
				sum = sum + x;
			}
			av = ((double) sum / (double) array.length);
		}
		return av;
	}
	

}
