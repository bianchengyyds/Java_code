/*
	1. �����Ϣ������̨:
		Ssytem.out.println();
	2. ���ܼ�������:
		������������, ��Ϊ�������ʱ��������½�ѧϰ֮���������.

	ǰ��: java.util.Scanner s = new java.util.Scanner(System.in);
	3. ����һ������:
		int num = s.nextInt();
	4. ����һ���ַ���:
		String str = s.next()
*/
public class KeyInput{
	public static void main(String[] args){

		// ����һ������ɨ��������
		// s: ������, �����޸�, ���������޸�
		java.util.Scanner s = new java.util.Scanner(System.in);

		// ����һ��int���͵�����
		// ����ִ�е���, ����ͣ����, �ȴ��û�����, �û���������һ������, Ȼ��س�
		// �س�֮��i��������ֵ��, ���ֵ�����û�������Ǹ���.


		int i = s.nextInt();
		System.out.println("���������Ϊ : " + i);

		System.out.print("�������û���: ");
		String name = s.next();
		System.out.println("��ӭ" + name + "����");

		int j = s.nextInt();
		System.out.println("��������� " + j);

		String kd = s.next();
		System.out.println("��������� " + kd);


		//java.util.Scanner s = new java.util.Scanner(System.in);

		int k = s.nextInt();
		System.out.println("���������:" + k);



		int a = s.nextInt();
		System.out.println("���������:" + a);


		String b = s.next();
		System.out.println("���������:" + b);
	}
}