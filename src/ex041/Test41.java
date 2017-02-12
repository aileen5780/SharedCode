package ex041;

public class Test41 {

	public static void main(String[] args) {
		int[] x = {6,7,8};
		for (int i:x){
			System.out.print(i+" ");
			i++;
		}
		Runnable  run = new Runnable(){

			@Override
			public void run(int x) {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		Runnable run1 = (int y) -> {};
	}

}
