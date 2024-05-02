package chapter03;

import java.util.Scanner;

public class DivideZeroHandling {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int dividend;
		int divisor;
		
		while(true) {
		System.out.print("분자 입력");
		dividend = scanner.nextInt();
		System.out.print("분자 입력");
		divisor = scanner.nextInt();
		
		try {
//			불능이 발생할 수 있는 실행문
			System.out.println(dividend+"를 "+divisor +"로 나누면 몫은 "+dividend/divisor+"입니다");
			break;
//			오류 발생시 처리(try에서 발생시)
		} catch (Exception e) {
			System.out.println("0으로 나눌수 없습니다 ! 다시 입력하세요");
			
		}
		
		
		}
		scanner.close();
	}
}
