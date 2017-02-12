package ex001;

public class Test021 {

	public static void main(String[] args) {
		Test021 t = new Test021();
		try{
			t.doPrint();
			t.doList();
		}catch (Exception e2) {
			System.out.println(e2);
		}
		
		

	}
	
	public void doList() throws Exception{
		throw new Error("Error");
	}
	
	public void doPrint() throws Exception{
		throw new RuntimeException("Exception");
	}

}
