package question02;

import java.util.Scanner;

public class ArithmeticExSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int res = 0;

		System.out.println("숫자 입력");
		int a = scanner.nextInt();
		System.out.println("연산자 입력");
		String s = scanner.next();
		System.out.println("숫자 입력");
		int b = scanner.nextInt();
		
		switch(b) {
		case 0:
			System.out.println("0으로 나눌수 없습니다");
			break;
		}
		switch (s) {
		case "+":
			res=a+b;
			break;
		case "-":
			res=a-b;
			break;
		case "*":
			res=a*b;
			break;
		case "/":
			if(b==0) {
				System.out.println("0으로 나눌수 없습니다");
			}else {
			res=a/b;
			break;
			}
		default:{
			System.out.println(a+s+b+"는"+res);
			break;
		}
			
		}
		
		
		scanner.close();
	
	}
}
