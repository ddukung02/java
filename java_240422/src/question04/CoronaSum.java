package question04;

public class CoronaSum {
	public static void main(String[] args) {
		
		int[][] arr;
		arr = new int[12][3];
		int sum=0;
		for(int i=0;i<12;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=10*(i+1)+j+1;
				sum +=arr[i][j];
			}
		}
		System.out.println("1년 전체 코로나 환자수는 "+sum);
		
//		11 12 13	10*i + j
//		21 22 23
//		31 32 33
//		41 42 43
		
		
		
		
//		121 122 123
	
		
		
	}
}
