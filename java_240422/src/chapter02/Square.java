package chapter02;

//1. public class 찾아감
public class Square {
//	void:리턴 타입(반환할것이 없다)
//	2.main 메소드 찾아감
	public static void main(String[] args) {
		int n=4;
//		square();	//메소드 호출부
//		square(4);	//메소드 호출부
//		3.메소드 호출
//		ctrl 클릭 = 단어선택

//		square(n);	//메소드 호출부
		int s = square(n);	//메소드 호출부
//		4.메소드 호출됨
		System.out.println("한 변의 길이가 "+n+"인 정사각형의 넓이"+s);
	}
//	호출부에서 파라미터가 있으면 오류
//	shift tab 내어쓰기
//	public static void square() { //메소드 정의부
//	int legnth : int 타입의 매개변수 (인자,파라미터) : n->length로 받음
//	int : 리턴타입
	public static int square(int length) { //메소드 정의부
//		return ""; //타입 불일치시 오류(String)
//		return 0; //타입 불일치시 오류(String)
		return length*length;
//		5.length를 제곱해서 반환
		
	}
}
