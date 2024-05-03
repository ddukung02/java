package chapter04;

public class Circle2 {
//	4.멤버변수가 1
	int radius;//10
	String name;//"자바피자"
	public double getArea() {
		return 3.14*radius*radius;
	}

//	2.생성자 호출됨
	public Circle2(){
//		3.반지름이 1
		radius =1;
		name = "";
	}
	public Circle2(int radius, String n){
//		this 사용해서 경고창 없앰                                                      
		this.radius = radius; 
		name=n;
	}
	public static void main(String[] args) {
//		생성자 호출
		
//		Circle2 pizza= new Circle2();//반지름이 1이고 이름은 없음
//		double area = pizza.getArea();
//		System.out.println(area);
//		
//		new Circle2(10);
		
//		객체 생성하면서 생성자 호출 (매개변수 10,"자바피자"2개를 들고 감)
		Circle2 pizza = 	new Circle2(10,"자바피자");//반지름이 10이고, 이름은 자바피자인 pizza객체를 생성
		
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적은"+area);
		
//		Circle2 donut = new Circle2();
		Circle2 donut = new Circle2(2,"");
		donut.name="자바도넛";
		area = donut.getArea();
		System.out.println(donut.name+"의 면적은"+area);
		
		
	}
}
