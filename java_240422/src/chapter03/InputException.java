package chapter03;

import java.util.Scanner;

/*
 * 정수 3개 입력받음
 * 정수가 아니면 패스
 * 3개의 합 출력
 * 예외처리 이용
 *  */
public class InputException {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("정수 3개를 입력하시오");
		int sum =0,n=0;
		
		for(int i =0; i<3;i++) {
			System.out.println(">>");
			try {
				n= scanner.nextInt();
			} catch (Exception e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				scanner.next();// 정수가 아닌것 패스
				i--;
				continue;//합계 누적 방지
			
			}
			sum+=n;
		}
		System.out.println("합은"+sum);
	}
}
