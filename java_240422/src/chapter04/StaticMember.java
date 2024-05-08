package chapter04;

import java.util.Scanner;

class CurrencyConverter{
//	자기 클래스 에서만 접근
//	멤버 변수는 일반적으로 private 많이 사용(보안)
//	getter, setter 메소드 사용해서 멤버변수 사용	
	
	private static double rate;
	public static void setRate(double rate) {
//		매개변수를 static 멤버로 저장
		CurrencyConverter.rate = rate;
	}
	public static double toDollar(double won) {
		return won/rate;
	}
	public static double toKWR(double dollar) {
		return dollar*rate;
	}
}

public class StaticMember {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("한율 (1달러)>>");
		double rate = scanner.nextDouble();
		
		CurrencyConverter.setRate(rate);
		System.out.println("백만원은 $"+CurrencyConverter.toDollar(1000000)+"입니다");
		System.out.println("백만원은 $"+CurrencyConverter.toKWR(100)+"원입니다");
		
	}
}
