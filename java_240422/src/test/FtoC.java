package test;

import java.util.Scanner;

public class FtoC {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("==================");
		System.out.println("1.화씨->섭씨");
		System.out.println("2.섭씨->화씨");
		System.out.println("==================");
		
		System.out.println("1번 또는 2번 번호를 입력하세요");
		int i=scanner.nextInt();
		double temperature ; 
		String s_temp;
		String s_temp2="화씨온도를 입력하세요";
		String s_temp3="섭씨온도를 입력하세요";
		String s_temp4="번호를 바르게 입력하세요";
		s_temp = (i==1)?s_temp2:(i==2)?s_temp3:s_temp4;
		System.out.println(s_temp);
		
		
		temperature =(i==1||i==2)? scanner.nextDouble():0;
		
		double f_temp2 = (temperature-32)*5/9;
		double c_temperature = f_temp2;
		
			
		double c_temp = (double)9/(double)5;
		double f_temperature =temperature*c_temp+32;

		double newTemperature=(i==1)?c_temperature:f_temperature;
		
		System.out.println(newTemperature);
		scanner.close();
	}
}
