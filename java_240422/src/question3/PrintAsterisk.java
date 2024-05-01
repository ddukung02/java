package question3;

import java.util.Scanner;

public class PrintAsterisk {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a, count;
		System.out.println("정수 입력");
		count = 0;
		a = scanner.nextInt();
		for (int i = a; i>0; i--) {

			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
/*
 * 	for(int i=n;i>0;i++){
 * 		for(int j=0;j<i;j++{
 * 		
 */
			
		}

	}

}
