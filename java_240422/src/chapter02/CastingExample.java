package chapter02;

public class CastingExample {
	public static void main(String[] args) {
		
		int intValue= 44032;
//		int타입을 
//		char charValue=intValue;
//		char로 변환(casting)해서 저장
		char charValue=(char)intValue;
		
		System.out.println(charValue);
//		정수 작은타입에서 큰 타입으로 변환
//		long longValue=500;
//		5000999888L에서 L을 안붙이면 int로 인식해서 오류
		long longValue=5000999888L;
//		정수 큰타입에서 작은 타입으로 변환(변환 안하면 오류)
		intValue=(int)longValue;
		System.out.println(intValue);
		
		double doubleValue=3.14;
		intValue=(int) doubleValue;
		System.out.println(intValue);
		
	}
}
