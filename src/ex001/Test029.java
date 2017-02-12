package ex001;

import java.io.IOException;

class X{
	public void printFileContent() throws IOException{
		throw new IOException();
	}
}

public class Test029 {

	public static void main(String[] args) {
		X xobj = new X();
		try {
			xobj.printFileContent();
		} catch(IOException e){
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
