package constructorTest;

public class B extends A {
	public B(){
		super("AA");
		System.out.println("call B's non-argument constructor");
	}
	
	public B(String mess){
		super();
		System.out.println("call B's one-argument constructor" + mess);
	}
}
