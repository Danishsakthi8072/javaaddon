package myproject;

public class Hierarchical {
	public static int a=5,b=5;
	public static void main(String args[]) {
		Child1 x = new Child1();
		Child2 y = new Child2();
		x.accept();
		y.accept();
	}
}

class Parent {
	int a=5 ,b=8;
	public void add(int i,int j) {
		System.out.println(i+j);
	}
}

class Child1 extends Parent{
	int i=2,j=5;
	public void access() {
		Parent inp = new Parent();
		inp.add(i,j);
	}
}

class Child2 extends Parent{
	public void mul() {
		System.out.println(a*b);
	}
}

class GrandGrandChild extends Hierarchical{
	public void div() {
		System.out.println(a/b);
	}
}



