package ex041;

public class Test49 {

	public static void main(String[] args) {
		String str = " ";
		str.trim();
		System.out.println(str.equals("") + " " + str.isEmpty());
		
		String s = str.trim();
		System.out.println(s.equals("") + " " + s.isEmpty());
		
	}

}
