/*
	����java�е�ת���ַ� :
		java��, \����ת��
			1. \t : �Ʊ��tab
			2. \n : ����
			3. \\ : \
			4. \' : '
			5. \" : "
*/
public class CharTest02{
	public static void main(String[] args){
		char c1 = 't';
		
		// ��������, ����\tʵ������һ���ַ�, �������ַ���
		char c2 = '\t';
		char c3 = '\n';

		// \u��ʾ�������һ���ַ�unicode����
		// unicode������ʮ�����Ƶ�
		char x = '\u4e2d';	// ��ʾһ���ַ�
		System.out.println(x);
//		System.out.println(c1);
//		System.out.println("abc" + c2 + "abc");
//		System.out.println(c1);
//		System.out.println("\"test\"");
//		System.out.print(c1);	//������
//		System.out.println(c1);	//����
	}
}