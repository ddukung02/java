package question01;

import java.util.Scanner;

public class ExExchange {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		final double DOLLAR = 1200;
		final double EUR = 1500;
		System.out.println("원화를 입력하세요");
		double won = scanner.nextDouble();
		
		System.out.println(won+"원은 $"+won/DOLLAR+"입니다");
		System.out.println(won+"원은 E"+won/EUR+"입니다");
		
	}
}
