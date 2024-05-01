package question3;

import java.util.Scanner;

public class Multiple {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = 0;
		boolean multiple = false;
		System.out.println("양의 정수를 입력하세요");
		number = scanner.nextInt();
		int a, b, c;
		a = number % 3;
		b = number % 5;
		c = number % 8;
		if (a == 0 || b == 0 || c == 0) {
			if (a == 0) {
				System.out.println("3의 배수이다");
				multiple = true;
			}
			if (b == 0) {
				System.out.println("5의 배수이다");
				multiple = true;
			}
			if (c == 0) {
				System.out.println("8의 배수이다");
				multiple = true;
			}
		} else {
			System.out.println("아니다");
		}

	}
}
