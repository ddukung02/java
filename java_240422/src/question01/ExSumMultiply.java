package question01;

import java.util.Scanner;

public class ExSumMultiply {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("100~999사이의 정수를 입력하시오");
		int a = scanner.nextInt();
		if(a<100||a>999) {
			System.out.println("범위를 벗어난 정수입니다");
		}
		else {
			int b= a/100;
			int c = (a/10)%10; 
			int d = a%10;
			System.out.println("합은 "+(b+c));
			System.out.println("곱은"+c*d);
			
		}
		scanner.close();
	}
		
	}

