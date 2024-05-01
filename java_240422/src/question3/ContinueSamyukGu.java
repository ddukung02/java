package question3;

import java.util.Scanner;

public class ContinueSamyukGu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = 0, b = 0, c = 0, d = 0;
		System.out.println("수 입력");
		a = scanner.nextInt();

		for (int i = 1; i < a + 1; i++) {
			if (i % 3 == 0) {
				System.out.print("짝");
			} else {
				System.out.print(i);
			}

		}

	}
}
