package chapter02;

import java.util.Scanner;

public class AssignmentIncDecOperator {
	public static void main(String[] args) {
		int a=3,b=3,c=3;
		
//		a=a+3;
		a+=3;
		b*=3;
		c%=2;
		System.out.println("a="+a+",b="+b+",c="+c);
//		 6 9 1
		int d=3;
//		 3
		a=d++;
		System.out.println("a="+a+",d="+d);
		a=++d;
		System.out.println("a="+a+",d="+d);
		a=d--;
		System.out.println("a="+a+",d="+d);
		a=--d;
		System.out.println("a="+a+",d="+d);
	}
}
