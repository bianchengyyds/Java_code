public class IntTest04{
	public static void main(String[] args){
		// int300 : 00000000 00000000 00000001 00101100
		// 强转后 : 会砍掉3( int4 - byte1 )个字节, 最后的结果为: 00101100, 十进制为44, 精度损失256
		byte b = (byte)300;
		System.out.println(b);
	}
}