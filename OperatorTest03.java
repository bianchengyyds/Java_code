/*
	�߼������:
		&	�߼��� ( ���� )
		|	�߼��� ( ���� )
		!	�߼��� ( ȡ�� )
		&&	��·��
		||	��·��

		1. �ص�:
			�߼����������Ҫ���ǲ�������, �������յĽ��Ҳ�ǲ�������.

		2. ��·����߼��������:
			������û���κ�����, ��ȫ��ͬ,
			ֻ������·��ᷢ����·����.

		3. ��·����:
			�ұ߱��ʽ��ִ�н�����·

		4. ��ʱʹ���߼���, ��ʱʹ�ö�·��:
			��Ч�ʷ�����˵, &&��&Ч�ʸ�һ��, &�ĵڶ������ʽһ����ִ��, &&��һ��
			����������, &&��&��ͬʱ�����, �󲿷������ʹ��&&.
*/
public class OperatorTest03{
	public static void main(String[] args){

		// �߼���&: ȫ��Ϊ��, �������
		System.out.println(true & true);	// true
		System.out.println(true & false);	// false
		System.out.println(false & false);	// false

		// �߼���|: ȫ��Ϊ��, ����Ϊ��
		int a = 100;
		int b = 101;
		int c = 99;
		System.out.println(a < b | c > b);	// true
		System.out.println(true | false);	// true
		System.out.println(false | false);	// false
		System.out.println(true | true);	// true

		// �߼���!: ȡ��
		System.out.println(!false); // true
		System.out.println(!true);	// false
		// ������Ҫ��һ��С����, ����������ȼ�
		System.out.println(!(a > b));


		// ��·��&&
		System.out.println(true & true);	// true
		System.out.println(true & false);	// false
		System.out.println(false & false);	// false
		// �����ͬ
		System.out.println(true && true);	// true
		System.out.println(true && false);	// false
		System.out.println(false && false);	// false

		int x = 10;
		int y = 11;
		// �߼���ȫ��Ϊ��, ���x > y����Ѿ���false��, �������ʽ�Ľ���Ѿ�ȷ��Ϊfalse��,
		//		��������˵�ұߵı��ʽ��Ӧ��ִ��.
		System.out.println(x > y & x > y++);
		// ͨ�����Եó�: ���ʽx > y++ִ����.
		System.out.println(y);	// 12
		
		int m = 10;
		int n = 11;
		// ʹ�ö�·��ʱ, ����ߵı��ʽΪfalseʱ, �ұߵı��ʽ��ִ��, ��Ϊ��·.
		System.out.println(m > n && m > n++);
		// ͨ������, m > n++δִ��.
		System.out.println(n); // 11
		
		// ��·��||
		// ��߱��ʽ���Ϊtrueʱ, �ұ߱��ʽ����Ҫִ��, ��ʱ��·.
		int i = 1;
		int j = 2;
		System.out.println(i < j || i > j--);
		System.out.println(j);	// 2
	}
}