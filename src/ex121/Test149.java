package ex121;

class Base{
	public static void main(String[] args) {
		System.out.println("Base " + args[2]);
	}
}

public class Test149 extends Base{

	public static void main(String[] args) {
		System.out.println("Overriden " + args[1]);
	}

}
