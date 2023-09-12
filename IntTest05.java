/*
	java中有一个语法规则:
		当一个整数型字面量没有超出byte或short或char的取值范围,
		那么这个整数型字面量可以直接赋值给byte或short或char类型的变量,
		long是不行的.

		这种语法机制是为了方便写代码而存在的.
*/
public class IntTest05{
	public static void main(String[] args){
		byte x = 1;
		byte y = 127;

		// 错误: 不兼容的类型: 从int转换到byte可能会有损失
		byte z = 128;


		short a = 1;
		short b = 32767;

		// 错误: 不兼容的类型: 从int转换到short可能会有损失
		short c = 32768;


		char c1 = 'a';
		char c2 = 97;
		char c3 = 65535;

		// 错误: 不兼容的类型: 从int转换到char可能会有损失
		char c4 = (char)65536;
		System.out.println(c4);
	}
}