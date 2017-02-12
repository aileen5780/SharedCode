package ex201;

public class Test204 {

	public static void main(String[] args) {
		String[][] arr = {{"A","B","C"},{"D","E"}};
		for(int i = 0; i < arr[i].length; i++){
			for(int j=0; j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
				if (arr[i][j].equals("B")){
					break;
				}
			}
			continue;
		}

	}

}
