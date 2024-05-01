package question3;

import java.util.Scanner;

public class ForSample {
	public static void main(String[] args) {
		int sum = 0, a, i, j;

		Scanner scanner = new Scanner(System.in);

		System.out.println("정수입력");
		a = scanner.nextInt();

		for (i = 1; i < a + 1; i++) {
			sum += i;
			System.out.print(i);
			if (i != a)
				System.out.print("+");
		}
		System.out.println("=" + sum);
		scanner.close();
	}
}
