package basicOperations;

public class BasicOperations {

	public static void main(String[] args) {

		String op = "-";
		int v1 = 49;
		int v2 = 7;
		int result = basicMath(op, v1, v2);
		System.out.println(result);

	}

	public static int basicMath(String op, int v1, int v2) {

		int result;
		if (op.equals("+")) {
			result = v1 + v2;
		} else if (op.equals("-")) {
			result = v1 - v2;
		} else if (op.equals("*")) {
			result = v1 * v2;
		} else if (op.equals("/")) {
			result = v1 / v2;
		} else {
			result = 0;
			System.out.println("Wrong operation, wrong result, try again.");
		}

		return result;
	}

}
