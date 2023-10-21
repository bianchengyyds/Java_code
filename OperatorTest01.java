/*
	1. ���������
		+
		-
		*
		/
		%	ȡ����

		++	����1
			���Գ����ڱ���ǰ, Ҳ���Գ����ڱ�������,
			������ǰ�Ǻ�, ִ�н�����, ������ֵһ��������1.
		
		--	�Լ�1
			��++һ������
*/
public class OperatorTest01{
	public static void main(String[] args){
		int a = 10;
		int b = 3;
		System.out.println(a + b);	// 13
		System.out.println(a - b);	// 7
		System.out.println(a * b);	// 30
		System.out.println(a / b);	// 3
		System.out.println(a % b);	// 1

		int i = 1;
		System.out.println(i);
		++i;
		System.out.println(i);

		// �﷨: ��++�����ڱ�����, ���ȸ�ֵ����, ������1.
		//					   ǰ,  ������1, �ٸ�ֵ����.
		int m = 10;
		//int n = m++;	// n = 10
		int n = ++m;	// n = 11
		System.out.println(n);
		System.out.println(m);	// m = 11


		// ��Ŀ:
		int c = 90;
		System.out.println(c++);	// 90
		System.out.println(c);		// 91

		int d = 80;
		System.out.println(++d);	// 81
		System.out.println(d);		// 81

		int e = 70;
		System.out.println(e--);	// 70
		System.out.println(e);		// 69

		int f = 60;
		System.out.println(--f);	// 59
		System.out.println(f);		// 59
	}
}