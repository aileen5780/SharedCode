package ex081;

class Test105{
	public static String maskCC (String creditCard){
		String x = "XXXX-XXXX-XXXX-";
		StringBuilder sb = new StringBuilder(x);
		sb.append(creditCard, 15, 19);
		System.out.println(sb);
		return sb.toString();

		
//		System.out.println(sb.substring(15,19));
//		return x + creditCard.substring(15, 19);
		
	}




	public static void main(String[] args) {
		System.out.println(maskCC("1234-5678-9101-1121"));

	}	

}
