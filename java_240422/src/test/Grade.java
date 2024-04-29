package test;

public class Grade {
	static String student;
	static double korean ;
	static double english;
	static double math;
	static double average;
    public Grade(String name,double a, double b, double c) {
    	String student = name;
    	double korean = a;
    	double english = b;
    	double math = c;
    	double average = (a+b+c)/3;
    	System.out.println(student+average);
    }

    public static void main(String [] args) {
        new Grade("강백호",90,80,70);
        new Grade("채치수",82,92,60.5);
        
    }

}