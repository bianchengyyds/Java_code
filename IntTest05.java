/*
	java����һ���﷨����:
		��һ��������������û�г���byte��short��char��ȡֵ��Χ,
		��ô�������������������ֱ�Ӹ�ֵ��byte��short��char���͵ı���,
		long�ǲ��е�.

		�����﷨������Ϊ�˷���д��������ڵ�.
*/
public class IntTest05{
	public static void main(String[] args){
		byte x = 1;
		byte y = 127;

		// ����: �����ݵ�����: ��intת����byte���ܻ�����ʧ
		byte z = 128;


		short a = 1;
		short b = 32767;

		// ����: �����ݵ�����: ��intת����short���ܻ�����ʧ
		short c = 32768;


		char c1 = 'a';
		char c2 = 97;
		char c3 = 65535;

		// ����: �����ݵ�����: ��intת����char���ܻ�����ʧ
		char c4 = (char)65536;
		System.out.println(c4);
	}
}