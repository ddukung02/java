package test;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Study {
    
	public static void main(String[] args) {
		Study study = new Study();
		
		study.multiple();
		
	}
	
	
	
	 void multiple() {
        try {
            int number = readNumber();	// 1번
            System.out.printf("%d에 2를 곱하면 %d 입니다.", number, number*2);	// 2번
        } catch (InputMismatchException e) {	// 3번
            System.out.println("[ERROR] 숫자를 입력해주세요.");	// 4번
            multiple();	// 5번
        }
    }

     int readNumber() {
        System.out.print("숫자를 입력해주세요 : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }
}