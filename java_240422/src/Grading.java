import java.util.Scanner;

/*
 * 점수를 입력받아서 출력
 */
public class Grading {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요 0~100 :");
		Scanner scanner = new Scanner(System.in);
		char grade;
		int score = scanner.nextInt();
		if (score >= 90) {
			grade = 'A';
		} else if (80 >= score) {
			grade = 'B';
		} else if (70 >= score) {
			grade = 'C';
		} else if (60 >= score) {
			grade = 'D';
		} else {
			grade = 'F';
		}

	}
}
