/*
	1. �����ܷ�ֱ�Ӹ�ֵ��char
	2. char c2 = 97;
		����������, ����Ľ�����ַ�'a'
		����������Եó�������:
			��һ��������ֵ��char���ͱ�����ʱ��, ���Զ�ת����char�ַ���.
			�ڶ� : ��һ��������������û�г���byte��short��char��ȡֵ��Χ,
		��ô�������������������ֱ�Ӹ�ֵ��byte��short��char���͵ı���,
		long�ǲ��е�.
*/
public class CharTest03{
	public static void main(String[] args){
		char c1 = 'a';
		System.out.println(c1);
		
		// �����������ת����?
		// 97��int���� ( Ĭ�ϵ���int���� )
		// c2��char����
		char c2 = 97;
		System.out.println(c2);

		char c3 = 65535;
		System.out.println(c3);

		char c4 = (char)65536;
		System.out.println(c4);
	}
}