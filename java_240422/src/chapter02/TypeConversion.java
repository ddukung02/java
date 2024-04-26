package chapter02;

public class TypeConversion {
	public static void main(String[] args) {
		
		byte b= 127;
		int i=10;
		
		System.out.println(b+i);
		System.out.println(10/4);
//		실수 큰타입으로 계산됨(double/int)
		System.out.println(10.0/4);
		System.out.println(2.9+1.8);
//		2+1.8
		System.out.println((int)2.9+1.8);
//		2+1
		System.out.println((int)2.9+(int)1.8);
//		4.7을 변환
		System.out.println((int)(2.9+1.8));
		
		
		
		
	}
}
