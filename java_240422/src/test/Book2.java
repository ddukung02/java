package test;

public class Book2 {
	int date;
	String title;
	String author;
		
	Book2(){
	}
	
	Book2(int date){
		this.date = date;
		this.title="제목없음";
		this.author = "작가미상";
	}

	Book2(int date,String title){
		this.date=date;
	}
	
	
	public static void main(String[] args) {
		
	}
}
