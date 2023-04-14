package classScores;

public class Kata {

	public static void main(String[] args) {
		
		int[] classPoints = {100, 40, 34, 57, 29, 72, 57, 88};
		int yourPoints = 75;
		boolean amIBetter = betterThanAverage(classPoints, yourPoints);
		System.out.println(amIBetter);

	}
	
	public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
		float average;
		int sum = 0;
		for(int x: classPoints) {
			sum = sum + x;
		}
		average = (sum + yourPoints)/(classPoints.length + 1);
		return yourPoints > average;
	}

}
