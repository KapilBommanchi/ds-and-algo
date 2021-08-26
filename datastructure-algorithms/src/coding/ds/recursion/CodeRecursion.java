package coding.ds.recursion;

public class CodeRecursion {
	public static void getStringByValue(int value) {
		if (value >= 0) {
			getStringByValue(value - 1);
			System.out.println("Hello String " + value);
		}
	}

	public static Integer calculateFactorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * calculateFactorial(n - 1);
	}

	public static Integer findFibonacci(int n) {
		if (n < 0) {
			return 0;
		} else if (n == 1 || n == 2) {
			return n - 1;
		} else {
			return findFibonacci(n - 1) + findFibonacci(n - 2);
		}
	}

	public static String reverse(String value, int length) {
		if (length == 0) {
			return "";
		}
		return value.charAt(length - 1) + reverse(value, length - 1);
	}

	public static void main(String[] args) {
		getStringByValue(3);
		System.out.println("factorial value is :: " + calculateFactorial(10));
		System.out.println("fibonacci :: " + findFibonacci(5));
		System.out.println(reverse("ABCD", "ABCD".length()));
	}

}
