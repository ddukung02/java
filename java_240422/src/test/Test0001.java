package test;

enum Cheat{
	POWER_OVERWHELMING,
	OPERATION_CWAL,
	SHOW_ME_THE_MONEY
}

public class Test0001 {
	
	public String name;
	public int size;
	public Cheat cheat;
	
	public static void main(String[] args) {
	
		for(Cheat cheat : Cheat.values()) {
			 System.out.println(cheat);
		}
	
	
	
	
	}
	
	
}
