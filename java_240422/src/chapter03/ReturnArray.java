package chapter03;

public class ReturnArray {
	
//	makeArray() 메소드
//	int[]: 반환 타입(리턴을 안하면 오류)
	static int[] makeArray(){
		int temp[] = new int[4];

		for (int i = 0; i < temp.length; i++) {
			temp[i]=i;
		}
		return temp;
	
	}
	
	public static void main(String[] args) {
		int intArray[];
		intArray = makeArray();
	
	for (int i = 0; i < intArray.length; i++) {
		System.out.print(intArray[i]+" ");
	}
	
	
	}
	
	
	
}
