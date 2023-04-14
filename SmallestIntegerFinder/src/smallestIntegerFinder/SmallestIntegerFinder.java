package smallestIntegerFinder;

public class SmallestIntegerFinder {

	public static void main(String[] args) {
		
		int[] intArray = {34, -345, -1, 100};
		int min = findSmallestInt(intArray);
		System.out.println(min);

	}
	
	public static int findSmallestInt(int[] args) {
		int min = args[0];
		for(int x : args) {
			if (x < min) {
				min = x;
			}
		}
		return min;
	}

}
