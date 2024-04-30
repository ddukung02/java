package question01;

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두 개의 정수를 입력하시오");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
			if(	(a>=100&&a<=200)&& ( b>=100&&b<=200 ) ) {
				System.out.println("("+a+","+b+") 은 사각형 안에 들어있음");
			}
			else {
				System.out.println("사각형 안에 없음");
			}
		scanner.close();
		}
	}