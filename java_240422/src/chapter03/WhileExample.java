package chapter03;

import java.util.Scanner;

/*
 * 정수를 입력 받음
 * 입력받은 갯수와 평균 출력
 * 마지막에 -1을 입력 중단
 */
public class WhileExample {
	public static void main(String[] args) {
		int count = 0;
		int sum=0;
		
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요");
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		while(n!=-1) {
//			 sum = sum+n;
			sum += n;
//			입력받은 갯수를 증가
			n = scanner.nextInt();
			count++;
		}
//		시작하자마자 -1입력
		if (count==0) {
			System.out.println("입력된 수가 없습니다");
		} else {
			System.out.println("정수의 갯수는"+count+"개 이며");
			System.out.println("평균은 " +(double)sum/count+"이다");

		}
		
		scanner.close();
	}
}
