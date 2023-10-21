/*
	赋值运算符:
		1. 包括基本赋值运算符和扩展赋值运算符
		2. 基本运算符:
			=
		3. 扩展赋值运算符:
			+=
			-=
			*=
			/=
			%=
			注意: 两个符号之间不能有空格
		4. 语法:
			使用扩展运算符时, 永远都不会改变运算结果类型
			byte x = 100;
			x += 1;
			x自诞生以来是byte类型, x以后也永远是byte, 不管后面是多大的数字.
*/
public class OperatorTest04{
	public static void main(String[] args){
		int k = 10;
		k += 20;	// k变量追加20
		System.out.println(k);	// 30

		int i = 10;
		i = i + 10;		// 类似于+=运算符
		System.out.println(i);	// 20

		// i += 10; 和 i = i + 10;
		// 这两个类似, 但是本质上不一样.
		byte x = 100;
		System.out.println(x);
		// 错误: 不兼容的类型: 从int转换到byte可能会有损失
		// x = x + 1;
		
		// 可以通过
		x += 1;	// 等同于(byte)(x = x + 1);

		x += 199;	// 等同于(byte)(x = x + 199);
		System.out.println(x);	// 44 , 强转后会损失精度

		
		int a = 100;
		a += 100;
		System.out.println(a);	// 200

		a -= 100;
		System.out.println(a);	// 100

		a *= 10;
		System.out.println(a);	// 1000

		a /= 30;
		System.out.println(a);	// 33
		
		a %= 2;
		System.out.println(a);	// 1

	}
}