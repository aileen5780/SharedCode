package ex001;

class Mid {	 
	public int findMid(int n1, int n2) { 
		return (n1 + n2) / 2;	 
	}
}
 
public class Test005 extends Mid {
 
	public static void main(String[] args) { 
	int n1 = 22, n2 = 2; 
	// insert code here
	Test005 c = new Test005();
	int n3 = c.findMid(n1, n2);
	
//	Test005 c = new Mid();
	 
	System.out.print(n3);
	 
	}
 
}

