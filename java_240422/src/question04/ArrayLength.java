package question04;

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {

		int sum = 0;
		int[] arr;

		Scanner scanner = new Scanner(System.in);

		System.out.println("배열의 길이를 입력");
		int length = scanner.nextInt();
		arr = new int[length];
		System.out.println("정수를  " + length + "개 입력하세요");
		for (int i = 0; i < length; i++) {
			arr[i] = scanner.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("평균은" + (double)sum / length + "입니다");

		scanner.close();
	}
}
