package question01;

import java.util.Scanner;

public class SumMultiply {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 두 개를 입력하시오");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println("두 수의 합은"+(a+b)+"입니다");
		System.out.println("두 수의 곱은"+(a*b)+"입니다");
		
		
		scanner.close();
		
	}
}
