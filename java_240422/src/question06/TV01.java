package question06;


public class TV01 {
	String brand;
	int year;
	int big;
	
	TV01(String brand, int year, int big){
		this.brand=brand;
		this.year=year;
		this.big=big;
	}
	TV01(){
		this("LG",2017,32);
	}
	
	void show(){
		System.out.println(this.brand+"에서 만든"+this.year+"년형"+this.big+"TV");
	}
	
	
	public static void main(String[] args) {
		TV01 myTV = new TV01();
		myTV.show(); 
	}
}
