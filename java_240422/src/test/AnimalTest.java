package test;

public class AnimalTest{
	public static void main(String[] args) {
		
		Whale w = new Whale();
		w.setName("고래");
		w.setAge(5);
		w.setSwim(true);
		w.setSex("남자");
		
		System.out.println("이름 : "+w.getName());
		System.out.println("나이 : "+w.getAge());
		System.out.println("수영여부 : "+w.getSwim());
		System.out.println("성별 : "+w.getSex());
		System.out.println("여부 : "+w.getAge());
	}
}
