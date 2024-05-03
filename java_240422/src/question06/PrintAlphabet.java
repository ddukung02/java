package question06;

import java.util.Scanner;

public class PrintAlphabet {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력하시오");
		String s=scanner.next();
		char b =s.charAt(0);
		char count='a';
		for(int i=0;i<b-'a'+1;i++) {
			for(int j=0;j<b-'a'+1-i;j++) {
				System.out.print((char)(count+j));
			}
			
			System.out.println();
			
		}
	}
}