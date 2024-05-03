package question06;

import java.util.Scanner;

public class PrintAlphabet01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력하시오");
		String s=scanner.next();
		char b =s.charAt(0);
		for(int i='a';i<b+1;i++) {
			for(int j='a';j<b+1;j++) {
			System.out.print((char)j);
			}
			System.out.println();
		}
	}
}