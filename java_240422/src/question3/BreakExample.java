package question3;

import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = null;
		System.out.println("exit를 입력하면 종료합니다");

		while (true) {
			System.out.println(">>");
			s = scanner.next();
			if (s.equals("exit"))
				break;

		}
		System.out.println("종료");
		scanner.close();
	}
}
