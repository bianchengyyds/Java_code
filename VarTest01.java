/*
	1. 变量的理解 :
		内存当中存储数据的最基本的单元.

	2. 在java语言中任何数据都是有数据类型的
		整数型 : int
		浮点型 : double
		布尔型 : boolean

	3. 数据类型的作用 :
		不同的数据类型在内存中分配的空间大小不同.
		也就是说JVM到底给这个数据分配多大的空间, 主要还是看这个变量的数据类型.

	4. 对于int, JVM会自动给它分配4个字节 ( byte ) 的空间.
		1byte = 8bit ( 比特位 )
		1bit就是一个1或0 ( 二进制位 )

	5. 那么int占用了多少个bit呢?
		4 * 8 = 32bit

	6. 变量的三要素 :
		变量的数据类型
		变量的名字
		变量中保存的值

		int		i	=	10;
		类型	名字	值

	7. 变量命名规范 :
		首字母小写, 后面每个单词首字母大写, 遵循驼峰原则, 见名知意.
*/

/*
	1. 变量的声明/定义 :
		数据类型 + 变量名
		int	nianLing;
	
	2. 在java中有一个规定, 变量必须先声明, 再赋值才能访问. ( 没有值相当于这个空间没有开辟 )
		
	3. 变量赋值 :
		nianLing = 20;
		// 赋值运算符 : "=", 特点 : 等号右边先执行, 执行完后有赋值给左边的变量.
*/

public class VarTest01{
	public static void main(String[] args){

		// 声明变量, 并赋值
		int nianLing = 10;
		System.out.println(nianLing);

		// 重新赋值
		nianLing = 20;
		System.out.println(nianLing);
		
		int nianLing = 30;
		System.out.println(nianLing);
		// 结论 : 在同一个作用域中变量可以重新赋值, 但是不能重复声明

	}
}