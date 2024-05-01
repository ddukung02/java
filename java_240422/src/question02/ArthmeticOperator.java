package question02;

import java.util.Scanner;

public class ArthmeticOperator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int time, minute, second, second_temp;
		time = 0;
		minute = 0;
		second = 0;
		second_temp = 0;
		System.out.println("정수를 입력하세요");
		second_temp = scanner.nextInt();

		time = second_temp / 3600;
		minute = second_temp / 60 % 60;
		second = second_temp - time * 3600 - minute * 60;

		System.out.println(second_temp+"초는" + time + "시간" + minute + "분" + second + "초 입니다");

		scanner.close();

	}
}
