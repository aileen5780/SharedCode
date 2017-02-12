package ex041;

class Base {
	public void test(){
		System.out.println("Base ");
	}
}

class DerivedA extends Base {
	public void test(){
		System.out.println("DerivedA ");
	}
	public void a(){
		System.out.println("a ");
	}
}

public class Test51 extends DerivedA {
	public void test(){
		System.out.println("DerivedB ");
	}
	
	public void a51(){
		System.out.println("a51 ");
	}
	public static void main(String[] args) {
		Base b1 = new Test51();
		Base b2 = new DerivedA();
		Base b3 = new Test51();
		b1 = (Base) b3;
		Base b4 = (DerivedA) b3;
		
		b1.test();
//		b2.test();
//		b3.test();
		b4.test();

		
	}
}


