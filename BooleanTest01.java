/*
	1. ��������ֻ��true��false����ֵ
	2. boolean��ʵ�ʿ�����ʹ�����߼��ж���, ͨ������������λ��
*/
public class BooleanTest01{
	public static void main(String[] args){

		// ����: �����ݵ�����: int�޷�ת��Ϊboolean
//		boolean xingBie = 1;
//		System.out.println(xingBie);
		
		boolean sex = false;

		if (sex){
			System.out.println("��");
		}else {
			System.out.println("Ů");
		}

		int a = 1;
		int b = 2;
		boolean flag = (a < b);
		System.out.println(flag);
	}
}