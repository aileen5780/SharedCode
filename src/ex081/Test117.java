package ex081;

public class Test117 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Duke");
		String str1 = sb1.toString();
		String str2 = str1;
//		String str2 = new String(str1);
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));

	}

}
