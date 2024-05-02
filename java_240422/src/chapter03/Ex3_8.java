package chapter03;
/*
 * 문자열에서 r 알파벳 갯수 구하기
 * 알파벳 대 / 소문자 상관 없음
 * toCarArray() 메소드 이용
 */
public class Ex3_8 {
	public static void main(String[] args) {
		int count=0;
		String str = "Programming is fun! Right?";
//		toCharArray() : 문자열에서 문자 하나씩 가지고 옴(P~?까지)
		char[] charArr = str.toCharArray();
		
		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i]=='R'||charArr[i]=='r') {
				
				count++;
			}
		}
		System.out.println(count);
		
		
		
	}
}
