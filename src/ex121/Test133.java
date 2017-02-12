package ex121;

public class Test133 {
	int num;
	public static void graceMarks (Test133 obj4){
		obj4.num += 10;
	}

	public static void main(String[] args) {
		Test133 obj1 = new Test133();
		Test133 obj2 = obj1;
		Test133 obj3 = null;
		obj2.num = 60;
		graceMarks(obj2);
		

	}

}
