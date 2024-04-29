package test;

import java.util.Scanner;

public class FtoC {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("화씨온도를 입력하시오");
		double f = scanner.nextDouble();
		double g = (double)5/(double)9;
		double c = g*(f-32);
		System.out.println(c);
		
		System.out.println("섭씨온도를 입력하시오");
		double C = scanner.nextDouble();
		double h = (double)9/(double)5;
		double F = h*C+32;
		System.out.println(F);
		
	}
}
