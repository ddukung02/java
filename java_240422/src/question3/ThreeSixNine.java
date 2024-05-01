package question3;

import java.util.Scanner;

public class ThreeSixNine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("10~99의 정수를 입력하세요");

		int a = scanner.nextInt();
		int a_temp1, a_temp2, a_temp3;
/*
 * count 369 갯수
 * num 입력받는 정수
 * a 10의 자리
 * b 1의 자리
 */
//		
		a_temp1 = a / 10 % 3;//십의자리
		a_temp2 = a % 10 % 3;//일의자리를 3으로 나눈 나머지
		a_temp3 = a % 10;//일의자리
		if (a_temp1 == 0 && a_temp2 == 0 && a_temp3 != 0) {
			System.out.println("박수짝짝");
		} else if (a_temp1 != 0 && a_temp2 == 0 && a_temp3 != 0) {
			System.out.println("박수짝");
		} else if (a_temp1 == 0) {
			System.out.println("박수짝");
		} else {
			System.out.println("해당안됨");
		}
		scanner.close();

	}
}
