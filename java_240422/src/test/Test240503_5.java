package test;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test240503_5 {

	public static void main(String[] args) {
		multiple();
	}
	
	static void multiple() {
		
		try {
			int number = scan();
			System.out.println(number);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			multiple();
		}
	}
	
	static int scan() {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("입력하셈");
			int number = scanner.nextInt();
			return number;
		} catch (InputMismatchException e) {
			throw new IllegalArgumentException("에러");
		}
	}
	
	
	
	
}
