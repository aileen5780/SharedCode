package constructorTest;

public class A {
	public A(){
		System.out.println("call A's non-argument constructor");
	}
	
	public A(String mess){
		System.out.println("call A's one-argument constructor" + mess);
	}
}
