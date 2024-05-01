package question3;

import java.util.Scanner;

public class Tesla {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int dollar100,dollar10;
		
		System.out.println("테슬라 주식 갯수를 입력하시오");
		int tesla = scanner.nextInt();
		int stock = tesla*520;
		
		dollar100=stock/100;
		System.out.println("100달라"+dollar100+"장");
		
		dollar10=stock%100/10;
		if(dollar10==0) {
			
		}else {
			System.out.println("10달라"+dollar10+"장");
		}
		scanner.close();
	}
}
