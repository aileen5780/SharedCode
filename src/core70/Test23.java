package core70;

public class Test23 {

	public static void main(String[] args) {
		int x = 100;
		int a = x++;
		int b = ++x;
		int c = x++;
		int d = (a<b)?a:(a<c)?a:(b<c)?b:c;
		System.out.println(a);

	}

}
