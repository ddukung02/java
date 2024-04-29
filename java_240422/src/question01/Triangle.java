package question01;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("삼각형의 세 변 길이를 입력하시오");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if((a+b)<=c || (a+c)<=b|| (b+c)<=a ) {
			System.out.println("삼각형이 될 수 없다 멍청아");
		}else {
			System.out.println("삼각형 가능");
		}
			scanner.close();
		}
	}

