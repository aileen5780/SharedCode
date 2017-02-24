package ex201;

class Test236 {
	int x(int d){
		System.out.println("one");
		return 0;
	}
	String x(double d){
		System.out.println("two");
		return null;
	}
//	double x(double d){
//		System.out.println("three");
//		return 0.0;
//	}

	public static void main(String[] args) {
		new Test236().x(4.0);
	}
}
