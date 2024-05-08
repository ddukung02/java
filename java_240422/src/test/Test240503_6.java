package test;

import java.util.Scanner;

public class Test240503_6 {
	public static void main(String[] args) {
		int result=0,temp=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력하세요 정수한개");
		int a = scanner.nextInt();
		int sum=0;
		result = (a==0)?0:++sum;
		temp = a%2;
		System.out.println(a);
		System.out.println(temp);
		
		result = (temp==0)?0:1;
		System.out.println(result);
		
	}
}
