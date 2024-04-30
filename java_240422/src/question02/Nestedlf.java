package question02;

import java.util.Scanner;

public class Nestedlf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하시오(0~100)");
		int score = scanner.nextInt();
		System.out.println("학년을 입력하시오(1~4)");
		int grade = scanner.nextInt();
		
		if(grade<1||grade>4) {
			System.out.println("학년을 바르게 입력하시오");
		}
		else {
			if(score>=60) {
				System.out.println("합격입니다");
			}
			else {
				System.out.println("불합격");
			}
		}
	}
}
