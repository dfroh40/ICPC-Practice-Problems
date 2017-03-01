import java.util.Scanner;

public class ProblemH {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int inputs = console.nextInt();
		for (int i = 0; i < inputs; i++) {
			int n = console.nextInt();
			while (n > 0) {
				int base = base(n);
				if (base != 0) {
					System.out.println(base);
				} else {
					System.out.println("No such base");
				}
				n = console.nextInt();
			}
		}
		System.out.println("done");
		console.close();
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i <= (int) Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int base(int n) {
		if (n <= 6) {
			if (n != 3) {
				return 0;
			}
			return 4;
		} 
		else if (n % 3 == 0) {
			return (n / 3 - 1);
		} 
		else if (isPrime(n - 3)) {
			return (n - 3);
		} 
		else {
			int min = 0;
			for (int i = 4; i <= n - 3; i++) {
				if (n % i == 3) {
					min = i;
					break;
				}
			}
			return min;
		}
	}
}
