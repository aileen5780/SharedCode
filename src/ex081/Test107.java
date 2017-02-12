package ex081;

public class Test107 {
	
	int num;
	public static void graceMarks(Test107 obj4){
		obj4.num += 10;
	}

	public static void main(String[] args) {
		Test107 obj1 = new Test107();
		Test107 obj2 = obj1;
//		Test107 obj1 = null;
		obj2.num = 60;
		graceMarks(obj2);

	}

}
