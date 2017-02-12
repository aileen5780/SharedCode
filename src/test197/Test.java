package test197;

public class Test {

	public static void main(String[] args) {
		try{
			method1();
		}catch(RuntimeException ne){
			System.out.println("A");
		}
	}
	public static void method1(){
		try{
			throw Math.random()>0.5 ? new MyException() : new RuntimeException();
		}catch (MyException re){
			System.out.println("B");
		}
	}

}
