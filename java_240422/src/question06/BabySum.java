package question06;

public class BabySum {
	public static void main(String[] args) {
		
		int baby[][]=new int[120][5];
		int sum=0;
		
		for(int i=0; i<baby.length;i++) {
			for(int j=0;j<baby[i].length;j++) {
				baby[i][j]=(i+1)*100+j+1;
				System.out.print(baby[i][j]+"\t");
			}
			System.out.println();
		}
	
	
	}
}