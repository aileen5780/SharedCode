package core70;

import java.util.ArrayList;

public class Test45 {

	public static void main(String[] args) {
		ArrayList myList = new ArrayList();
		String[] myArray;
		try{
			while(true){
				myList.add("My String");
			}
		}catch(RuntimeException re){
			System.out.println("RuntimeException");
		}catch(Exception e){
			System.out.println("Exception");
		}
		System.out.println("Ready to use");
	}

}
