package question01;

import java.util.Scanner;

public class ExRectangle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("사각형의 가로와 세로 길이를 입력하세요");
		int width= scan.nextInt();
		int height= scan.nextInt();
		
		int rectangleArea =width*height;
		
		System.out.println("사각형의 면적은"+rectangleArea+"입니다");
		
		scan.close();
		
	
				
	}
}
