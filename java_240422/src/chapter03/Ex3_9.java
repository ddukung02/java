package chapter03;

/*
 * 구구단을 배열로 생성
 * 값을 넣어본다 ex>2*7 = 14; 9*4 = 36
 */
public class Ex3_9 {
	public static void main(String[] args) {
//		정수타입의 2차원 배열 선언 (1차원은 열로 구성, 1차원이 2개이상 가지고 행으로 구성)
//		2차원 배열 선언, 생성(9행 9열)
//		int[][] gugudan=new int[9][9]; //인덱스 0~8까지
		int[][] gugudan=new int[10][10]; //인덱스 0~9까지
		
		for (int i = 1; i < 9; i++) {
			for (int j = 1; j < 9; j++) {
				gugudan[i][j] = i*j;
				System.out.println(gugudan[i][j]);
			}
		}
		
		System.out.println("2 X 7 = "+gugudan[2][7]);
		
		
	}
}
