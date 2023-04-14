package triangleTester;

public class TriangleTester {

	public static void main(String[] args) {
		
		int a = 7;
		int b = 2;
		int c = 2;
		boolean result = isTriangle(a, b, c);
		System.out.println(result);

	}
	
	public static boolean isTriangle(int a, int b, int c) {
		return ( a + b > c) && ( a + c > b) && ( b + c > a );
	}

}
