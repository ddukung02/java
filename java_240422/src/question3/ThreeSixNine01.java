package question3;

import java.util.Scanner;

public class ThreeSixNine01 {
	public static void main(String[] args) {

		int a, b, num, count;
		count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("369369~369");
		num = scanner.nextInt();

		a = num / 10;
		b = num % 10;

		if (a % 3 == 0) {
			count++;
		}
		if (b % 3 == 0 && b != 0) {
			count++;
		}

		if (count == 2) {
			System.out.println("짝짝");
		} else if (count == 1) {
			System.out.println("짝");
		} else {
			System.out.println("해당없음");
		}

	}
}
