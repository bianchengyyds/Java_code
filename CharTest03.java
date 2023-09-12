/*
	1. 整数能否直接赋值给char
	2. char c2 = 97;
		这个是允许的, 输出的结果是字符'a'
		经过这个测试得出个结论:
			当一个整数赋值给char类型变量的时候, 会自动转换成char字符型.
			第二 : 当一个整数型字面量没有超出byte或short或char的取值范围,
		那么这个整数型字面量可以直接赋值给byte或short或char类型的变量,
		long是不行的.
*/
public class CharTest03{
	public static void main(String[] args){
		char c1 = 'a';
		System.out.println(c1);
		
		// 这里会做类型转换吗?
		// 97是int类型 ( 默认当作int类型 )
		// c2是char类型
		char c2 = 97;
		System.out.println(c2);

		char c3 = 65535;
		System.out.println(c3);

		char c4 = (char)65536;
		System.out.println(c4);
	}
}