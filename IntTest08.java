/*
	���� : ���������������������ʱ, ���յĽ��������"�������"��Ӧ������
			char + short + byte�������
			��Ϊchar + short + byte�������ʱ, �������ת����int��������
*/
public class IntTest08{
	public static void main(String[] args){
		long a = 10L;
		char c = 'a';
		short s = 100;
		int i = 30;
		// ���
		System.out.println(a + c + s + i);	// 237

		// ��������long����
		int x = (int)(a + c + s + i);
		System.out.println(x);
	}
}