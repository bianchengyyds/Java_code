/*
	�ַ������������:
		1. + ������:
			���
			�ַ���ƴ��

		2. ��ʱʹ��:
			�� + ���߶�����������ʱ, ���.
			�� + ���ߵ�����һ��Ϊ�ַ�������ʱ, ������ַ���ƴ�Ӳ���.
		
		3. �ַ���ƴ��֮��Ľ������һ���ַ���.

		4. ��һ�����ʽ���ж���Ӻ�ʱ:
			��ѭ�������ҵ�˳������ִ��( �������С���� ).
*/
public class OperatorTest06{
	public static void main(String[] args){
		int a = 100;
		int b = 200;
		// ���
		int sum = a + b;
		// �ַ���ƴ��
		System.out.println("sum = " + sum);	// sum = 30

		int nianLing = 20;

		// �ַ���ƴ��
		System.out.println("���� = " + nianLing);	// ���� = 20
		
		// �������ƴ��
		System.out.println(a + b + "110");	// 300110
		
		// ��ƴ����ƴ��
		System.out.println(a + (b + "110"));	// 100200110

		// �ڿ���̨�����"100 + 200 = 300", Ҫ��ֻ��ʹ�ñ���a(100)��b(200)�ͷ���
		System.out.println(a + " + " + b + " = " + (a + b));
		
		// �ڿ���̨���"��¼�ɹ���ӭ**����", Ҫ��**ʹ�ñ�������ʾ
		String name = "stephen";
		System.out.println("��¼�ɹ���ӭ" + name + "����");
	}
}