package question3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateGrade {
	public static void main(String[] args) {
		
		boolean cheating=false;
		int attendrate;
		int totalscore;
		int totalscore_temp;
		char grade;
		
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("부정행위를 했는가?");
			cheating = scanner.nextBoolean();
			
		} catch (InputMismatchException e) {
			System.out.println("부정행위 여부를 올바르게 입력하시오");
		}
		
		System.err.println("출석률을 얼마인가");
		attendrate = scanner.nextInt();
		
		System.out.println("총점은 얼마인가");
		totalscore_temp = scanner.nextInt();
		totalscore=totalscore_temp/10;
		if(cheating==true||attendrate<80) {
			grade ='F';
			}else {
			switch (totalscore) {
			case 10:
			case 9:
				grade='A';
				break;
			case 8:
				grade='B';
				break;
			case 7:
				grade='C';
				break;
			case 6:
				grade='D';
				break;
			default:
				grade='F';
				break;
			}
			
			
		}
		System.out.println("학점: "+grade);
		scanner.close();
	}
}
