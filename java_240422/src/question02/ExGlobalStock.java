package question02;

import java.util.Scanner;

public class ExGlobalStock {
	public static void main(String[] args) {
		
		int buy=0,sell=0;
		double	tax=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("매수금액을 입력하세요");
		buy = scanner.nextInt();
		System.out.println("매도금액을 입력하세요");
		sell = scanner.nextInt();
		
		if(buy<sell) {
			tax = (double)(sell-buy)*0.22;
			System.out.println("양도세"+tax);
		}else {
			System.out.println("양도세 "+tax);
		}
		
		scanner.close();
		
	}
}
