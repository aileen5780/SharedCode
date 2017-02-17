package ex161;

public class Test176 {
	String myStr = "7007";
//	int myNum = 6006;
	public void doStuff(String str){
		int myNum = 0;
		String myStr = null;
		try{
//			String myStr = str;
			myStr = str;
			myNum = Integer.parseInt(myStr);
		}catch(NumberFormatException ne){
			System.out.println("Error");
		}
		System.out.println("myStr: "+ myStr + ", myNum: "+ myNum);
	}

	public static void main(String[] args) {
		Test176 obj = new Test176();
		obj.doStuff("9009");

	}

}
