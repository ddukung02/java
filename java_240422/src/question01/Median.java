package question01;

import java.util.Scanner;

public class Median {
	public static void main(String[] args) {
		System.out.println("중복되지 않는 정수 3개를 입력하세용");
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		
		
		if(a==b||b==c||c==a) {
			System.out.println("중복되잖아 머저리야");
		}
		else  {
			if(a>b&&a<c||a>c&&a<b) {
				System.out.println("중간값은"+a+"입니다");
			}
			else if(b>a&&b<c||b>c&&b<a) {
				System.out.println("중간값은 "+b+"입니다");
			}
			else {
				System.out.println("중간값은 "+c+"입니다");
			}
		}
		
		scanner.close();
		
	}
}
