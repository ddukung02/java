package question01;

import java.util.Scanner;

class Aaa{}
class Baa{}

// public class : 자바파일 안에 두개이상 존재시 오류
// JVM이 수 많은 class에서 public class 를 찾아감
public class ExCalculation {
//	method 여러개 사용해도 무관
	public static void aaa() {}
	public static void bbb() {}
//	JVA이 수많은 method에서 main메소드를 찾아감
	public static void main(String[] args) {
		
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 개의 실수를 입력하시오");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		
		if(a>b) {
			
			System.out.println("두 수의 덧셈은 "+(double)(a+b)+"입니다");
			System.out.println("두 수의 뺄셈은 "+(double)(a-b)+"입니다");
			System.out.println("두 수의 나눗셈은 "+(double)(a/b)+"입니다");
			System.out.println("두 수의 곱셈은 "+(double)(a*b)+"입니다");
		}else if(a<b) {
			System.out.println("두 수의 덧셈은 "+(double)(a+b)+"입니다");
			System.out.println("두 수의 뺄셈은 "+(double)(b-a)+"입니다");
			System.out.println("두 수의 곱셈은 "+(double)(a*b)+"입니다");
			System.out.println("두 수의 나눗셈은 "+(double)(b/a)+"입니다");
		}
			scanner.close();
		}
		
	}

