package question01;

import java.util.Scanner;

public class Won2Dollar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("원화를 입력하세요");
		double won = scanner.nextInt();
		double a = won/1100;
		System.out.println(won+"원은 $"+a+"입니다");
	
		scanner.close();
	}
}
