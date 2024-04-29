import java.util.Scanner;

public class GradingSwitch {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요 0~100 :");
		Scanner scanner = new Scanner(System.in);
		char grade;
		int score = scanner.nextInt();
		
		switch (score/10) {
		case 10:	//100점
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
				
		default:
			grade = 'F';
			break;
		}
		
		System.out.println();
		
		
		
		
		/*
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
		}*/

	}

}
