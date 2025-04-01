public class PracticeProblem {

	public static int sum(String x, int total) {
		if (x.equals("")) return total;
		else return sum(x.substring(1), total + x.charAt(0) - 48);
	}

	public static int sumOfDigits(int x) {
		if (x < 0) x *= -1;
		String num = Integer.toString(x);
		return sum(num, 0);
	}

	public static int factorial(int n) {
		if (n < 0) return 0;
		if (n == 0) return 1;
		return n*factorial(n - 1);
	}

}
