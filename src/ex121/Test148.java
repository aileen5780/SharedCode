package ex121;

public class Test148 {
    public static void main(String[] args) {
		// 创建一个空的StringBuilder对象
		StringBuilder str = new StringBuilder();
		
        
		// 追加字符串
		str.append("jaewkjldfxmopzdm");
//		str.length();
		str.delete(0, str.length());

		
        // 从后往前每隔三位插入逗号
		
//		str.insert(13,",");
//		str.insert(10,",");
//		str.insert(7,",");
//		str.insert(4,",");
//		str.insert(1,",");
        
		
        // 将StringBuilder对象转换为String对象并输出
		System.out.print(str.toString());
		System.out.print(str.length());
	}
}
