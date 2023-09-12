/*
	byte, short, char做混合运算时, 各自先转换成int再做运算
*/
public class IntTest07{
	public static void main(String[] args){
		char c1 = 'a';
		byte b = 1;

		// 注意 : 这里的+是负责求和的
		System.out.println(c1 + b);
		

		// 错误: 不兼容的类型: 从int转换到short可能会有损失
		short a = c1 + b;	// 而这样写到这里不知道这个加法最后的结果是多少, 只知道是int类型

		short s = 98;		// 98直接写到这里编译器可以识别
		System.out.println(s);
	}
}