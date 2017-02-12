package ex081;

public class Test093 {

	public static void main(String[] args) {
		String[][] arra = new String[3][];
		 
		arra[0] = new String[]{"rose", "lily"};
		 
		arra[1] = new String[]{"apple", "berry","cherry","grapes"};
		 
		arra[2] = new String[]{"beans", "carrot","potato"};
		
//		int n1 = arra[0].length;
//		int n2 = arra[1].length;
//		int n3 = arra[2].length;
//		
//		System.out.println(n1);
//		System.out.println(n2);
//		System.out.println(n3);		
			
		for (int i = 0; i < arra.length; i++) { 
			for (int j=0; j < arra[i].length; j++) { 
				arra[i][j] = arra[i][j].toUpperCase(); 
				System.out.print(arra[i][j] + " ");
			} 
		}
		
//		for (String a[]:arra[][]) { 
//			for (String x:a[]) { 
//			toUpperCase(); 
//			} 
//			} 



	}

}
