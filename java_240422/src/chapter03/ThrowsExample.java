package chapter03;

public class ThrowsExample {
	public static void main(String[] args) {
		try {
			findClass();
			System.out.println("클래스를 찾음");

		} catch (ClassNotFoundException e) {
			System.err.println("클래스를 못찾음ㅠ.ㅠ");
		}
	}

	public static void findClass() throws ClassNotFoundException {

		Class.forName("java.lang.String");
	}
}
