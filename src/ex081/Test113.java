package ex081;

import java.util.ArrayList;

public class Test113 {

	public static void main(String[] args) {
		ArrayList myList = new ArrayList();
		String[] myArray;
		try {
			while (true) {
				myList.add("My String");
			}
		}catch (RuntimeException re) {
			System.out.println("Caught an RuntimeException");
		}catch (Exception e) {
			System.out.println("Caught an Exception");
		}
		System.out.println("Ready to use");
	}

}
