package chapter04;

public class Book {
	
	String title;//멤버변수(필드)
	String author;
	
	public Book(String t, String a) {
		title=t;
		author=a;
	}
	public Book(String t) {
		title =t;
		author  = "작자미상";
	}
	
	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자","생택쥐베리");
//		1.매개변수 가지고 생성자 호출
		Book loveStory=new Book("춘향전");
		
		System.out.println(loveStory.title+"  "+loveStory.author);
		System.out.println(littlePrince.title+"  "+littlePrince.author);
	}
}
