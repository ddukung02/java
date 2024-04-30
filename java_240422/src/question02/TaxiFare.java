package question02;

import java.util.Scanner;

public class TaxiFare {
	public static void main(String[] args) {
		int fare ;
		int income = 0;
		int i=0;
		Scanner scanner = new Scanner(System.in);
		while (i<10) {
			System.out.println("요금을 입력하세요");
			fare = scanner.nextInt();
			income+=fare;
			i++;
			
		}
		System.out.println("총 수입은"+income+"입니다");
		scanner.close();
		
	}
}
