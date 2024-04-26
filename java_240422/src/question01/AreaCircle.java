package question01;

import java.util.Scanner;

public class AreaCircle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("원의 반지름을 입력하시오");
		int radius = scanner.nextInt();
		double area = radius*radius*3.14;
		System.out.println("원의 면적은"+area+"입니다");
		scanner.close();
	}
}
