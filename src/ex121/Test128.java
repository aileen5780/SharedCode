package ex121;

public class Test128{
	static int i=7;

	public static void main(String[] args) {
		Test128 obj = new Test128();
		obj.i++;
		Test128.i++;
		obj.i++;
		System.out.println(Test128.i + " " + obj.i);
	}

}
