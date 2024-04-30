package question02;

import java.util.Scanner;

public class ArithmeticExlf {
	public static void main(String[] args) {
		int res = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 입력");
		int a = scanner.nextInt();
		System.out.println("연산자 입력");
		String s = scanner.next();

		if (s.length() > 2) {
			System.out.println("연산자는 한글자만 입력하세요");
		} 
		else if(false==s.equals("+")&&false==s.equals("*")&&false==s.equals("-")&&false==s.equals("/")) {
			System.out.println("연산자를 똑바로 입력하세요");
			return;
		}
		else {
			System.out.println("숫자 입력");
			int b = scanner.nextInt();

			if (s.equals("+")) {
				res = a + b;
			}
			else if (s.equals("-")) {
				res = a - b;
			}
			else if (s.equals("*")) {
				res = a * b;
			}
			else if (s.equals("/") && b != 0) {
				res = a / b;
			} else if (b == 0) {
				System.out.println("0으로 나눌수 없습니다");
				return;
			}
			System.out.println(a+s+b+"의 계산 결과는"+res);
			scanner.close();
		}
	}
	}

