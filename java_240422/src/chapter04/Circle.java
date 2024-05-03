package chapter04;

public class Circle {
//	멤버변수(필드)
	int radius;
	String name;
		
	public Circle() { }
	public Circle(int a) {}
	public Circle(int a, int b) { }

	public double getArea() {
		return 3.14*radius*radius;
	}
	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle();
		
		pizza.radius=10;
		pizza.name="자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+area);
		
		Circle donut;
		donut = new Circle();
		donut.radius=2;
		donut.name="자바도넛";
		area= donut.getArea();
		System.out.println(donut.name+"의 면적은 "+area);
		
	
	
		
	}
	
	
}
