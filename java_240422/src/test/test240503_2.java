package test;

public class test240503_2 {



		public static void main(String[] args) {
			
			int intArray[];
			intArray = makeArray();
			
			for(int i=0; i<intArray.length;i++) {
				System.out.print(intArray[i]+100+" ");
		
			}
		}
	
	 public static int[] makeArray() {
		int[] temp = new int[10];
		
		for(int i = 0; i<temp.length;i++) {
			temp[i]=i+1;
		}
		return temp;
	}
	
}
