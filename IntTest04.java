public class IntTest04{
	public static void main(String[] args){
		// int300 : 00000000 00000000 00000001 00101100
		// ǿת�� : �ῳ��3( int4 - byte1 )���ֽ�, ���Ľ��Ϊ: 00101100, ʮ����Ϊ44, ������ʧ256
		byte b = (byte)300;
		System.out.println(b);
	}
}