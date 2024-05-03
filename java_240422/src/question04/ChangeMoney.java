package question04;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int money=0;
		int money50000=0;
		int money10000=0;
		int money5000=0;
		int money1000=0;
		int money500=0;
		int money100=0;
		int money50=0;
		int money10=0;
		int money1=0;
		
		System.out.println("금액을 입력해라");
		
		money = scanner.nextInt();
		
		
			while(money>=50000) {
				money50000++;
				money-=50000;
			}
			while(money>=10000) {
				money10000++;
				money-=10000;
			}
			while(money>=5000) {
				money5000++;
				money-=5000;
			}
			while(money>=5000) {
				money5000++;
				money-=5000;
			}
			while(money>=1000) {
				money1000++;
				money-=1000;
			}
			while(money>=500) {
				money500++;
				money-=500;
			}
			while(money>=100) {
				money100++;
				money-=100;
			}
			while(money>=50) {
				money50++;
				money-=50;
			}
			while(money>=10) {
				money10++;
				money-=10;
			}
			while(money>0) {
				money1++;
				money--;
			}
		
		System.out.println("오만원짜리는"+money50000+"장");
		System.out.println("만원짜리는"+money10000+"장");
		System.out.println("오천원짜리는"+money5000+"장");
		System.out.println("천원짜리는"+money1000+"장");
		System.out.println("오백원짜리는"+money500+"장");
		System.out.println("백원짜리는"+money100+"장");
		System.out.println("오십원짜리는"+money50+"장");
		System.out.println("십원짜리는"+money10+"장");
		System.out.println("일원짜리는"+money1+"장");
	}
}
