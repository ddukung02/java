package test;

import java.util.Scanner;

public class Test240503_7 {
	public static void main(String[] args) {
		int a1;String b="";
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력해라");
		a1 = scanner.nextInt();
		
		b=(a1>=64)?"1":"";
		System.out.print(b);
		b=(a1>=32)?"1":"";
		System.out.print(b);
		b=(a1>=16)?"1":"";
		System.out.print(b);
		b=(a1>=8)?"1":"";
		System.out.print(b);
		b=(a1>=4)?"1":"";
		System.out.print(b);
		b=(a1>=2)?"1":"";
		System.out.print(b);
		b=(a1>=1)?"1":"";
		System.out.print(b);
		
		
	}
}
