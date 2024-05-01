package question02;

import java.util.Scanner;

public class ComputeBalance {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int purchaseAmount;
		int balance = 0;

		System.out.println("구매금액을 입력 하세요");
		purchaseAmount = scanner.nextInt();

		if (purchaseAmount >= 300000) {
			balance = purchaseAmount - 30000;
		} else if (purchaseAmount < 300000 && purchaseAmount >= 100000) {
			balance = purchaseAmount - 5000;
		} else if (purchaseAmount < 100000) {
			balance = purchaseAmount;
		} else {
			System.out.println("똑바로 입력하셈");
		}
		System.out.println("청구금액은" + balance);
		scanner.close();

	}
}
