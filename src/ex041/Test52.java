package ex041;

public class Test52 {

	public static void main(String[] args) {
		String names[] = new String[3];
		names[0] = "Mary Brown";
		names[1] = "Nancy Red";
		names[2] = "Jessy Orange";
			
		try{
			for(String n: names){
				try{
					String pwd = n.substring(0, 3) + n.substring(6, 10);
					System.out.println(pwd);
				}catch(StringIndexOutOfBoundsException sie){
					System.out.println("String Out of limits");
				}
				
			}
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Out of limits");
		}

	}

}
