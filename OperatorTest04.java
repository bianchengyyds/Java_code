/*
	��ֵ�����:
		1. ����������ֵ���������չ��ֵ�����
		2. ���������:
			=
		3. ��չ��ֵ�����:
			+=
			-=
			*=
			/=
			%=
			ע��: ��������֮�䲻���пո�
		4. �﷨:
			ʹ����չ�����ʱ, ��Զ������ı�����������
			byte x = 100;
			x += 1;
			x�Ե���������byte����, x�Ժ�Ҳ��Զ��byte, ���ܺ����Ƕ�������.
*/
public class OperatorTest04{
	public static void main(String[] args){
		int k = 10;
		k += 20;	// k����׷��20
		System.out.println(k);	// 30

		int i = 10;
		i = i + 10;		// ������+=�����
		System.out.println(i);	// 20

		// i += 10; �� i = i + 10;
		// ����������, ���Ǳ����ϲ�һ��.
		byte x = 100;
		System.out.println(x);
		// ����: �����ݵ�����: ��intת����byte���ܻ�����ʧ
		// x = x + 1;
		
		// ����ͨ��
		x += 1;	// ��ͬ��(byte)(x = x + 1);

		x += 199;	// ��ͬ��(byte)(x = x + 199);
		System.out.println(x);	// 44 , ǿת�����ʧ����

		
		int a = 100;
		a += 100;
		System.out.println(a);	// 200

		a -= 100;
		System.out.println(a);	// 100

		a *= 10;
		System.out.println(a);	// 1000

		a /= 30;
		System.out.println(a);	// 33
		
		a %= 2;
		System.out.println(a);	// 1

	}
}