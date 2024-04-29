package chapter02;

import java.util.Scanner;

public class CoffeePrice {
	public static void main(String[] args) {
		System.out.println("무슨 커피 드릴까요?");
		Scanner scanner = new Scanner(System.in);
//		next():문자열 입력받는 메소드
		String order = scanner.next();
		int price=0;
		
		switch (order) {
		case "에스프레소":
		case "카푸치노":
		case "카페라떼":
			price = 3500;
			break;
		case "아메리카노":
			price = 2000;
			break;
			default:
				System.out.println("메뉴에 없습니다");
		}
		
		if(price!=0) {
		System.out.println("커피가격"+price);
		}
		scanner.close();
		
		
	}
}
