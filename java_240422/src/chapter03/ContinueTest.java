package chapter03;

/*
 * 특정 문자를 찾는다
 * 찾은 객수를 출력
 * life is cool. l은 두개
 */
public class ContinueTest {
	public static void main(String[] args) {
		
		int count = 0;
		String s = "no news is good news";
		//알파벳 n의 갯수 구하기
		//charAt(0) : 첫번째 문자
		System.out.println(s.length());
		for (int i = 0; i <s.length(); i++) {
			System.out.println(s.charAt(i));
			
			if(s.charAt(i) !='n') {
				continue;
		}
			count++;
		}
		System.out.println("문장에서 발견된 n의 갯수"+count);
	}
}
