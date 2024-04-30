package question02;

import java.util.Scanner;

public class ExStock {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("코스피 지수를 입력하세요(1800~2500)");
		int kospi = scanner.nextInt();
		if (kospi > 2500 || kospi < 1800) {
			System.out.println("코스피 지수를 올바르게 입력하세요");
		} else {
			System.out.println("환율을 입력하세요(1100~1200)");
			int rate = scanner.nextInt();
			if (kospi > 2500 || kospi < 1800 || rate > 1200 || rate < 1100) {
				System.out.println("지수와 환율을 똑바로 입력하세요");
			} else {

				if (rate >= 1150) {
					if (kospi >= 2200) {
						System.out.println("상승장");
					} else if (kospi < 2000) {
						System.out.println("하락장");
					} else {
						System.out.println("횡보장");
					}
				} else {
					if (kospi >= 2300) {
						System.out.println("상승장");
					} else if (kospi < 2000) {
						System.out.println("하락장");
					} else {
						System.out.println("횡보장");
					}
				}
			}
		}
	}
}