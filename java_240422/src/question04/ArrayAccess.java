package question04;

import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = 0, count = 0;
		System.out.println("수입력 5개");

		int[] array;
		array = new int[5];

		for (int i = 0; i < 5; i++) {
			array[i] = scanner.nextInt();

		}

		for (int i = 0; i < 5; i++) {
			if (array[i] > array[count]) {
				a = array[i];
			}
		}

		System.out.println("가장 큰 수는"+a+"입니다");
		scanner.close();

	}
}
