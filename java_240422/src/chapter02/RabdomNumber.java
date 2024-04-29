package chapter02;

public class RabdomNumber {
	public static void main(String[] args) {
		int n = rollDie();
		System.out.println("주사위의 눈:" +n);
	}
//	매개변수가 없는 메소드(주사위의 숫자 구하기 = 1~6)
	public static int rollDie() {
			double x = 6*Math.random();
			int temp = (int)x;
			return temp+1;
	}
}
