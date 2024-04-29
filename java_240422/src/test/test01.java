package test;

import java.util.Scanner;

public class test01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("원화 입력");
		int won = scanner.nextInt();

		double a = changeWonD(won);
		double b = changeWonE(won);
		System.out.println(won + "원은 $" + a + "이고");
		System.out.println(won + "원은 $" + b + "입니다");

	}

	public static double changeWonD(int won) {
		// TODO Auto-generated method stub
		double a = (double) won / 1200;
		return a;
	}

	public static double changeWonE(int won) {
		// TODO Auto-generated method stub
		double a = (double) won / 1500;
		return a;
	}

}
