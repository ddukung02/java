package question01;

import java.util.Scanner;

public class ExArea {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("삼각형의 밑변, 높이,0 혹은");
		System.out.println("사다리꼴의 윗변,아랫변,높이를 입력하시오");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if(c==0) {
			System.out.println("삼각형의 넓이는 "+a*b/2+"입니다");
		}else {
			int d = a+b;
			double e = d*c;
			double f = e/2;
			System.out.println("사다리꼴의 넓이는 "+f+"입니다");
		}
		scanner.close();
		
	}
}
