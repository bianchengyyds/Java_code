/*
	byte, short, char���������ʱ, ������ת����int��������
*/
public class IntTest07{
	public static void main(String[] args){
		char c1 = 'a';
		byte b = 1;

		// ע�� : �����+�Ǹ�����͵�
		System.out.println(c1 + b);
		

		// ����: �����ݵ�����: ��intת����short���ܻ�����ʧ
		short a = c1 + b;	// ������д�����ﲻ֪������ӷ����Ľ���Ƕ���, ֻ֪����int����

		short s = 98;		// 98ֱ��д���������������ʶ��
		System.out.println(s);
	}
}