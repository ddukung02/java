package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test240503_4 {
	public static void main(String[] args) {
		multiple();
	}

	public static void multiple() {
	        try {
	            int number = readNumber();
	            System.out.printf("%d에 2를 곱하면 %d 입니다.", number, number * 2);
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	            multiple();
	        }
	    }

	private static int readNumber() {
        try {
            System.out.print("숫자를 입력해주세요 : ");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            return number;
        } catch (InputMismatchException e) {
            throw new IllegalArgumentException("[ERROR] 숫자를 입력해주세요.");
        }
	}
}