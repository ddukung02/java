package chapter03;
/*
 * a~z 알파벳 소문자 출력
 */
public class DoWhileSample {

		public static void main(String[] args) {

			char c = 'a';
		do {
			System.out.print(c);
			c= (char)(c+1);
		} while (c<='z');
		
		
		
		}
}
