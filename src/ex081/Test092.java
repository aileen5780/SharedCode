package ex081;

class A{
	public A(){
		System.out.print("A");
	}
}

class B extends A{
	public B(){
		System.out.print("B");
	}
}

public class Test092 extends B{
	public Test092(){
		System.out.print("C");
	}

	public static void main(String[] args) {
		Test092 t = new Test092();

	}

}
