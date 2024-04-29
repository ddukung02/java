package test;

import java.util.Scanner;

public class test02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("두 값 입력");
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.println("두 값의 차이는");
		int c = Math.abs(a - b);
		System.out.println(c + "이다");

	}
}
