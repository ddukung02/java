package chapter03;

public class Calc {
	//args: main 메소드 매개변수
	public static void main(String[] args) {
		double sum=0.0;
		
		for (int i = 0; i < args.length; i++) {
//			Double : Wrapper 클래스
//			 parseDouble(): 실수로 변환하는 메소드
			sum+= Double.parseDouble(args[i]);
		}
		
		System.out.println("합계: "+sum);
		
	}
}
