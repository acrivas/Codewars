package maps;

public class Maps {

	public static void main(String[] args) {
		
		int[] input = {1, 2, 3};
		for(Integer x : input) {
			System.out.println(x);
		}
		int[] output = map(input);
		for(Integer x : output) {
			System.out.println(x);
		}

	}
	
	public static int[] map(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr[i]*2;
		}
		return arr;
	}

}
