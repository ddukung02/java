package question06;

public class TV {
	String brand;
	int year;
	int big;
	
	TV(String brand, int year, int big){
		this.brand=brand;
		this.year=year;
		this.big=big;
	}
	void show(){
		System.out.println(brand+"에서 만든"+year+"년형"+big+"TV");
	}
	public static void main(String[] args) {
		TV myTV = new TV("LG",2017,32);
		myTV.show(); 
	}
}
