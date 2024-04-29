package test;

import java.util.Scanner;

public class Member {
	 static String id;
	 static String pw;
	 static String address;
	 static String email;
	 
	 public static void main(String[] args) {
		new Member();
	}

	public Member(){
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("ID,PW,ADDRESS,EMAIL을 입력하시오");
		 id=scanner.next();
		 pw=scanner.next();
		 address=scanner.next();
		 email=scanner.next();
		 result();
	 }
	 private static void result() {
		 System.out.println("학생 정보");
		 System.out.println("--------------");
		 System.out.println(id);
		 System.out.println(pw);
		 System.out.println(address);
		 System.out.println(email);
	 }
	 
}
