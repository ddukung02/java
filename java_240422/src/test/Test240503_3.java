package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test240503_3 {

	public static void main(String[] args) {

		int a;
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력하세요");
		b();

	}

	static void b() {
		while(true) {
		try {
			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			for (int i = 0; i < a; i++) {
				System.out.print(a);
			}
			System.out.println("끝");

		} catch (Exception e) {
			System.out.println("잘못입력");

		}
	}
	}
}
