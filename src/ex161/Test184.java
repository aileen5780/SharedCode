package ex161;

class MarksOutOfBoundsException extends IndexOutOfBoundsException { }

public class Test184 {
	 
	void verify(int marks) throws IndexOutOfBoundsException { 
		if (marks > 100) { 
			throw new MarksOutOfBoundsException();
		}
		if (marks > 50) {
			System.out.print("Pass"); 
		} else {	 
			System.out.print("Fail");	 
		}		 
	}
	 	 
	public static void main(String[] args) {
		int marks = Integer.parseInt(args[2]);
		try {
			new Test184().verify(marks);
		} catch(Exception e) {
			System.out.print(e.getClass());	 
		}	 
	}
	 
}
 
