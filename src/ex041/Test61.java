package ex041;

public class Test61 {
	 
	static String[][] arr =new String[3][]; 
		private static void doPrint() {	
		//A
//		int i = 0;
//		for(String[] sub:arr){
//			int j = sub.length-1;
//			for(String str:sub){
//				System.out.println(str[j]);
//				i++;
//			}
//		}
		//B
		for(int i = 0; i<arr.length;i++){
			int j = arr[i].length-1;
			System.out.print(arr[i][j]);
			i++;
		}
		//C	
//		int i=0;
//		for(String[] sub:arr[][]){
//			int j = sub.length;
//			System.out.println(arr[i][j]);
//			i++;
//		}
		
		
	}
	 
	public static void main(String[] args) {	 
		String[] class1 = {"A","B","C"};	 
		String[] class2 = {"L","M","N","O"};	 
		String[] class3 = {"I","J"};	 
		arr[0] = class1;	 
		arr[1] = class2;	 
		arr[2] = class3;	 
		Test61.doPrint();	 
	}	 
}
