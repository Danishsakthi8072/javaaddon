package myproject;

public class SingleInheritClass extends ADD{
	public static void main(String[] args) {
	System.out.println(add());	
	}
}

class ADD{
	static int add() {
		int a=5 , b=5;
		return a + b;
	}
}


