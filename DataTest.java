/*
	����������Ҫ��ѭ�Ĺ��� :
	1. ���ֻ������������У��� boolean ���Ͳ���ת����ʣ����������֮�䶼���Խ���ת����

	2. ���������������û�г��� byte,short,char ��ȡֵ��Χ������ֱ�ӽ��丳ֵ��byte,short,char ���͵ı�����

	3. С�����������ת����Ϊ�Զ�����ת����������С���������Ϊ��byte < short(char) < int < long < float < double������
short �� char ��ռ�������ֽڣ����� char ���Ա�ʾ�������������

	4. ������ת����С��������Ϊǿ������ת������дʱ������ӡ�ǿ������ת��������������ʱ���ܳ��־�����ʧ������ʹ�ã�

	5. byte,short,char ���ͻ������ʱ���ȸ���ת���� int �����������㣻

	6. �����������ͻ�����㣬������ת��������������һ���������㣻
*/
/*
	1. short s1 = 1; s1 = s1 + 1;��ʲô��? 

	2. char ���ͱ����ܲ��ܴ���һ�����ĵĺ��֣�Ϊʲô�� 

	3. float f = 1.0 ��ʲô�� 

	4. long a = 2147483648 ��ʲô�� 

	5. int i = 0xffff �������� 

	6. char c = 65536 ��������Ϊʲô��
*/
public class DataTest{
	public static void main(String[] args){

		// 1. short s1 = 1;
		// ����: �����ݵ�����: ��intת����short���ܻ�����ʧ		
		// s1 = s1 + 1;

		// 2. char c1 = '��';

		// 3. float f = (float)1.0;
		// float f = 1.0F;

		// 4. ����: ����̫��
		// long a = 2147483648;
		// ����
		// long a = 2147483648F;

		// 5. D:\Java\Java_code\chapter04>javac DataTest.java
		//	  D:\Java\Java_code\chapter04>java DataTest
		//		65535
		// int i = 0xffff;

		// 6. ����: �����ݵ�����: ��intת����char���ܻ�����ʧ
		// char c = 65536;
		System.out.println(s1);
	}
}