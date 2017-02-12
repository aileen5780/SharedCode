package test173;

public class TestA extends Root {

	public static void main(String[] args) {
		Root r = new TestA();
//		System.out.println(r.method1());
		System.out.println(r.method2());

	}
	
}

 interface I{
	default void print(){
		
	}
}
