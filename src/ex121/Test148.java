package ex121;

public class Test148 {
    public static void main(String[] args) {
		// ����һ���յ�StringBuilder����
		StringBuilder str = new StringBuilder();
		
        
		// ׷���ַ���
		str.append("jaewkjldfxmopzdm");
//		str.length();
		str.delete(0, str.length());

		
        // �Ӻ���ǰÿ����λ���붺��
		
//		str.insert(13,",");
//		str.insert(10,",");
//		str.insert(7,",");
//		str.insert(4,",");
//		str.insert(1,",");
        
		
        // ��StringBuilder����ת��ΪString�������
		System.out.print(str.toString());
		System.out.print(str.length());
	}
}
