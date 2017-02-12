package ex081;

import java.util.ArrayList;

public class Test109 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("SE");
		list.add("EE");
		list.add("ME");
		list.add("SE");
		list.add("EE");
		
		list.remove("SE");
//		list.remove("ME");
		
		System.out.println("Value are: " + list);
	}

}
