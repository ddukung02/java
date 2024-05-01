package question3;

import java.util.Scanner;

public class ContinueExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a, b, sum;

		a = 0;
		sum = 0;

		System.out.println("정수 입력 5개");

		for (int i = 0; i < 5; i++) {
			a = scanner.nextInt();
			if (a > 0) {
				sum += a;
			}
		}
		System.out.println(sum);

		scanner.close();

	}
}
