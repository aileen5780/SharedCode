package ex001;

public class Test023 {

	public static void main(String[] args) {
		try{
			String[] arr = new String[4];
			arr[1] = "Unix";
			arr[2] = "Linux";
			arr[3] = "Solarios";
			
//			arr[1].toString();
			
			for(String var : arr){
				System.out.println(var + " ");
			}
		}catch(Exception e) {
			System.out.println(e.getClass());
		}

	}

}
