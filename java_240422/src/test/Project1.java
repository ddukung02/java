package test;

import java.util.Scanner;

public class Project1 {

	public static void main(String[] args){
		Scanner scin=new Scanner(System.in);
		int x = scin.nextInt();
		System.out.println("숫자 입력 : "+ x);
		int y = scin.nextInt();
		System.out.println("숫자 입력 : "+ y);
		System.out.print("결과:");
		
		int sum=0;
		int max=0, min=0;
		
		if (x>=y) {
		 max = x;
		 min = y;}		
		else {
		 max = y;				
		min = x;}
		
while(min<max) {
	System.out.print(min + " ,");
	sum +=min;
	min++;
if(min==max) {
	System.out.println(max);
	sum +=max;
}
	}

System.out.print("합계: " + sum);
scin.close();
	}	
	}
