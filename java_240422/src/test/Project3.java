package test;

import java.util.Scanner;

public class Project3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 정수를 입력하시오");
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		int c = Math.abs(a - b);
		
		int f=0;
		
		if (a > b) {
			while (c >= 0) {
				System.out.println(b);
				--c;
				f=f+b;
				++b;
			}
		}
		if (b > a) {
			while (c >= 0) {
				System.out.println(a);
				--c;
				f=f+a;
				++a;
			}
		}

		System.out.println("두 정수 사이의 합은 "+f+"입니다");
		
	}
}