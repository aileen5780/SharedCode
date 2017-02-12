package ex081;

public class Test106 {
	
	static boolean bVar;
	
	public static void main(String[] args) {
		boolean bVar1 = true;
		int count = 8;
		do {
			System.out.println("Hello java!" + count);
			if (count>=7){
				bVar1 = false;
			}
		}while (bVar != bVar1 && count >4);
		count -= 2;
	}

}
