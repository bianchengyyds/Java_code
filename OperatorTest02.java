/*
	��ϵ�����:
		>
		>=
		<
		<=
		==
		!=

		1. һ��Ҫ��סһ������:
			���й�ϵ������Ľ�����ǲ�����, ����true����false

		2. ��Java��:
			= : ��ֵ�����
			== : ��ϵ�����, �ж��Ƿ����
*/
public class OperatorTest02{
	public static void main(String[] args){
		int a = 10;
		int b = 10;
		System.out.println(a > b);	// false
		System.out.println(a >= b);	// true
		System.out.println(a < b);	// false
		System.out.println(a <= b);	// true
		System.out.println(a == b);	// true
		System.out.println(a != b);	// false
	}
}