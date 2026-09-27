import java.math.BigInteger;
import java.util.Scanner;

public class hello_world {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = scanner.nextInt();

		if (n < 0) {
			System.out.println("Factorial is only defined for non-negative numbers.");
		} else {
			System.out.println(n + "! = " + factorial(n));
		}

		scanner.close();
	}

	private static BigInteger factorial(int n) {
		BigInteger result = BigInteger.ONE;
		for (int i = 2; i <= n; i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		return result;
	}
}
