package chapter02;

import java.util.Scanner;

/*
 * 시간을 이볅 받아서 임금 계산
 */
public class Pay {
	public static void main(String[] args) {
		
		final int RATE = 10000;
		int hour ;
		double pay;//1시간 임금을 시간에 곱한값(급여)
		
		System.out.println("시간을 입력하시오 : ");
		Scanner scanner = new Scanner(System.in);
		
		hour= scanner.nextInt();
//		8시간 초과 : 1.5배
		if (hour>8) {
			pay = RATE*8+(RATE*(hour-8)*1.5);
		} else {
			pay = hour*RATE;
		}
		
		System.out.println("임금은"+pay+"이다");
		
		
	}
}
