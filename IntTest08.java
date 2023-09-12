/*
	结论 : 多种数据类型做混合运算时, 最终的结果类型是"最大容量"对应的类型
			char + short + byte这个除外
			因为char + short + byte混合运算时, 会各自先转换成int再做运算
*/
public class IntTest08{
	public static void main(String[] args){
		long a = 10L;
		char c = 'a';
		short s = 100;
		int i = 30;
		// 求和
		System.out.println(a + c + s + i);	// 237

		// 计算结果是long类型
		int x = (int)(a + c + s + i);
		System.out.println(x);
	}
}