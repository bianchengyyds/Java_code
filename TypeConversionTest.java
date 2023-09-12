/*
	接下来，根据以上的 6 条规则，我们来看一下以下代码，指出哪些代码编译报错，以及怎么解决（大家注意看代码的注释信息）：
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

		// 5. 错误: 不兼容的类型: 从long转换到int可能会有损失
		// int e = d;
		// 原因: c是int类型, 小容量转大容量( 自动类型转换 ), 先将类型转换成long, 再赋值给d, 此时d是long类型,
		//		 大容量转小容量( 强制类型转换 ), 应使用强制类型转换符.

		// 6. 
		int f = 10 / 3;

		// 7. 
		long g = 10;

		// 8. 错误: 不兼容的类型: 从long转换到int可能会有损失
		// int h = g / 3;
		// 原因: g是int类型, 小容量转大容量( 自动类型转换 ), 先将类型转换成long, 再赋值给h, 此时h是long类型,
		//		 大容量转小容量( 强制类型转换 ), 应使用强制类型转换符.

		// 9. 
		long m = g / 3;
		
		// 10. 错误: 不兼容的类型: 从int转换到byte可能会有损失
		// byte x = (byte)g / 3;
		// 原因: (byte)g强转成byte类型, 它/3运用了多类型运算规则, 即多类型运算时, 应该将所有的转换成最大的那个类型,
		//		 再进行运算, 这是(byte)g / 3就是int类型了, 自然就不能赋值给byte类型的x.

		// 11. 
		short y = (short)(g / 3);

		// 12. 
		short i = 10; 
		
		// 13. 
		byte j = 5;

		// 14. 错误: 不兼容的类型: 从int转换到short可能会有损失
		// short k = i + j;
		// 原因 : i和j都是强转成的int, 只不过将强转负号隐藏了, 所以i + j后还是int, 不能直接赋值给short类型的k.

		// 15. 
		int n = i + j;
		
		// 16. 
		char cc = 'a'; 
		// cc = a
		System.out.println("cc = " + cc);
		
		// 17. 输出97
		System.out.println((byte)cc);
		
		//18. 输出197
		int o = cc + 100; 
		System.out.println(o);
	}
}