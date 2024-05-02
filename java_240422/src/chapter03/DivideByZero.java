package chapter03;

import java.util.Scanner;

public class DivideByZero {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int dividend;
		int divisor;
		
		System.out.print("분자 입력");
		dividend = scanner.nextInt();
		System.out.print("분자 입력");
		divisor = scanner.nextInt();
		
//		분자 입력10
//		분자 입력0
//		Exception in thread "main" java.lang.ArithmeticException: / by zero
//			at chapter03.DivideByZero.main(DivideByZero.java:23)
		
		System.out.println(dividend+"를 "+divisor +"로 나누면 몫은 "+dividend/divisor+"입니다");
		scanner.close();
		
		
	}
}
