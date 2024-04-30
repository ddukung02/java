package question01;

import java.util.Scanner;

public class SeasonExlf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("달을 입력하세요(1~12)");
		int a = scanner.nextInt();
		
		if(a>=3&&a<=5) {
			System.out.println("봄");
		}
		else if(a>=6&&a<=8) {
			System.out.println("여름");
		}
		else if(a>=9&&a<=11) {
			System.out.println("가을");
		}
		else if(a==12||a==1||a==2) {
			System.out.println("겨울");
		}else {
			System.out.println("달을 올바르게 입력하세요");
		}
		scanner.close();
	}
}
