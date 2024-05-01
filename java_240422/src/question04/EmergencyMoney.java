package question04;

import java.util.Scanner;

public class EmergencyMoney {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int fam1 = 400000, fam2 = 600000, fam3 = 800000, fam4 = 1000000;
		int famNumber;
		int dollar100, dollar10, dollar;
		dollar = 1200;

		int a_dollar, b_dollar, c_dollar, d_dollar;

		a_dollar = fam1 / 1200;
		b_dollar = fam2 / 1200;
		c_dollar = fam3 / 1200;
		d_dollar = fam4 / 1200;

		System.out.println("가구수를 입력하시오");

		famNumber = scanner.nextInt();

		if (famNumber == 1) {
			dollar100 = a_dollar / 100;
			dollar10 = a_dollar % 100 / 10;
			if (dollar10 < 1) {
				System.out.println("100달라" + dollar100);
			} else {
				System.out.println("100달라" + dollar100 + "\t" + "10달라" + dollar10);
			}
		}
		if (famNumber == 2) {
			dollar100 = b_dollar / 100;
			dollar10 = b_dollar % 100 / 10;
			if (dollar10 < 1) {
				System.out.println("100달라" + dollar100);
			} else {
				System.out.println("100달라" + dollar100 + "\t" + "10달라" + dollar10);
			}
		}
		if (famNumber == 3) {
			dollar100 = c_dollar / 100;
			dollar10 = c_dollar % 100 / 10;
			if (dollar10 < 1) {
				System.out.println("100달라" + dollar100);
			} else {
				System.out.println("100달라" + dollar100 + "\t" + "10달라" + dollar10);
			}
		}
		if (famNumber == 4) {
			dollar100 = d_dollar / 100;
			dollar10 = d_dollar % 100 / 10;
			if (dollar10 < 1) {
				System.out.println("100달라" + dollar100);
			} else {
				System.out.println("100달라" + dollar100 + "\t" + "10달라" + dollar10);
			}
		}

		scanner.close();

	}
}
