/*
	���������������ϵ� 6 ��������������һ�����´��룬ָ����Щ������뱨���Լ���ô��������ע�⿴�����ע����Ϣ����
	byte b1 = 1000; 
		byte b2 = 20; 
		short s = 1000; 
		int c = 1000; 
		long d = c; 
		int e = d; 
		int f = 10 / 3; 
		long g = 10; 
		int h = g / 3; 
		long m = g / 3; 
		byte x = (byte)g / 3; 
		short y = (short)(g / 3); 
		short i = 10; 
		byte j = 5; 
		short k = i + j; 
		int n = i + j; 
		char cc = 'a'; 
		System.out.println("cc = " + cc); 
		System.out.println((byte)cc); 
		int o = cc + 100; 
		System.out.println(o);
*/
public class TypeConversionTest{
	public static void main(String[] args){
		// 1. 
		byte b2 = 20;

		// 2.
		short s = 1000;

		// 3.
		int c = 1000;

		// 4. 
		long d = c;

		// 5. ����: �����ݵ�����: ��longת����int���ܻ�����ʧ
		// int e = d;
		// ԭ��: c��int����, С����ת������( �Զ�����ת�� ), �Ƚ�����ת����long, �ٸ�ֵ��d, ��ʱd��long����,
		//		 ������תС����( ǿ������ת�� ), Ӧʹ��ǿ������ת����.

		// 6. 
		int f = 10 / 3;

		// 7. 
		long g = 10;

		// 8. ����: �����ݵ�����: ��longת����int���ܻ�����ʧ
		// int h = g / 3;
		// ԭ��: g��int����, С����ת������( �Զ�����ת�� ), �Ƚ�����ת����long, �ٸ�ֵ��h, ��ʱh��long����,
		//		 ������תС����( ǿ������ת�� ), Ӧʹ��ǿ������ת����.

		// 9. 
		long m = g / 3;
		
		// 10. ����: �����ݵ�����: ��intת����byte���ܻ�����ʧ
		// byte x = (byte)g / 3;
		// ԭ��: (byte)gǿת��byte����, ��/3�����˶������������, ������������ʱ, Ӧ�ý����е�ת���������Ǹ�����,
		//		 �ٽ�������, ����(byte)g / 3����int������, ��Ȼ�Ͳ��ܸ�ֵ��byte���͵�x.

		// 11. 
		short y = (short)(g / 3);

		// 12. 
		short i = 10; 
		
		// 13. 
		byte j = 5;

		// 14. ����: �����ݵ�����: ��intת����short���ܻ�����ʧ
		// short k = i + j;
		// ԭ�� : i��j����ǿת�ɵ�int, ֻ������ǿת����������, ����i + j����int, ����ֱ�Ӹ�ֵ��short���͵�k.

		// 15. 
		int n = i + j;
		
		// 16. 
		char cc = 'a'; 
		// cc = a
		System.out.println("cc = " + cc);
		
		// 17. ���97
		System.out.println((byte)cc);
		
		//18. ���197
		int o = cc + 100; 
		System.out.println(o);
	}
}