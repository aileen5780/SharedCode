package ex121;

public class Test159 {

	public static void main(String[] args) {
		AnotherSampleClass asc = new AnotherSampleClass();
		Test159 sc = new Test159();
		
		sc = asc;
		System.out.println("sc: "+ sc.getClass());
		System.out.println("asc: "+ asc.getClass());
	}
}

class AnotherSampleClass extends Test159{
	
}
