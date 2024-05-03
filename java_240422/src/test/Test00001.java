package test;

import java.util.Scanner;

public class Test00001 {

	public static int money=0;
	public static int[] arr= {50000,10000,5000,1000,500,50,10,1};
    public static void main(String[] args) {
    	
    	    	
    	putMoney();
    	if(money==0) {
    		System.out.println("잘못 입력하셨습니다");
    	}else {
    	calc2(money);
    	}
    }
    
    
    public static void putMoney() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("금액 입력");
    	while(scanner.hasNextInt()) {
    	money = scanner.nextInt();
    	break;
    	}
    }	
    	
    public static int calc2(int money) {
    	for(int i =0; i<arr.length;i++) {
    	int moneycount = money/arr[i];
    	 money =money%arr[i];
    	 System.out.println(arr[i]+"원권은"+moneycount+"장 입니다");
    	}
    	return money;
    }
    
    
    
}