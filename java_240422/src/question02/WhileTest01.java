package question02;

public class WhileTest01 {
	public static void main(String[] args) {
		
		
		int i=0;
		int sum_temp=0;
		int sum=0;
		while (i<49) {
			sum_temp+=2;
			sum+=sum_temp;
			System.out.println(sum_temp);
			i++;
			
		}
		System.out.println(sum);
	}
}
