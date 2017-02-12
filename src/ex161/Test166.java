package ex161;

public class Test166 {

	public static void main(String[] args) {
		Test166 ts = new Test166();
		System.out.println(isAvailable + "");
		isAvailable = ts.doStuff();
		System.out.println(isAvailable);
	}
	public static boolean doStuff(){
		return !isAvailable;
	}
	static boolean isAvailable = false;

}
