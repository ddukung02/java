package question01;

import java.util.Scanner;

public class DuvAndRemains {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("10~99사이의 정수를 입력하시오");
		int a = scanner.nextInt();
		if(a<10||a>99) {
			System.out.println("범위를 벗어난 정수입니다");
		}
		else {
			int b= a/10;
			int c = a%10;
			if(b==c) {
				System.out.println("십의 자리와 일의 자리가 같은 수이다");
			}else {
				System.out.println("십의 자리와 일의 자리가 다른 수이다");
			}
		}
		scanner.close();
	}
}
