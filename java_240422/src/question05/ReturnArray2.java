package question05;

public class ReturnArray2 {
	static int[] arr = {1,2,3,4,5,6,7,8,9,10};

	public static void main(String[] args) {
		
		for(int i=0; i<10;i++) {
			arr[i]=arr[i]+100;
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static int[] makeArray(int[] a) {
		return a;
	}
}
