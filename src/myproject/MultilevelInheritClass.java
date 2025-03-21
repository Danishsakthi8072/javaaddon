package myproject;

public class MultilevelInheritClass extends MUL { 
		public static void main(String[] args) {
		add();
		sub();
		mul();	
		}
	}

class ADDITION {
	
	public static int a=5,b=5;
	
	static void add() {
		System.out.println("Class A");
		System.out.println(a+b);
			
	}
}

class SUB extends ADDITION{
	
	static void sub() {
		
		System.out.println("Class B");
		System.out.println(a-b);
	}
}

class MUL extends SUB{
	
	static void mul() {
		System.out.println("Class C");
		System.out.println(a*b);

	}
}