/*
	逻辑运算符:
		&	逻辑与 ( 并且 )
		|	逻辑或 ( 或者 )
		!	逻辑非 ( 取反 )
		&&	短路与
		||	短路或

		1. 特点:
			逻辑运算符两边要求都是布尔类型, 并且最终的结果也是布尔类型.

		2. 短路与和逻辑与的区别:
			运算结果没有任何区别, 完全相同,
			只不过短路与会发生短路现象.

		3. 短路现象:
			右边表达式不执行叫做短路

		4. 何时使用逻辑与, 何时使用短路与:
			从效率方面来说, &&比&效率高一点, &的第二个表达式一定会执行, &&不一定
			开发过程中, &&和&是同时并存的, 大部分情况下使用&&.
*/
public class OperatorTest03{
	public static void main(String[] args){

		// 逻辑与&: 全真为真, 遇假则假
		System.out.println(true & true);	// true
		System.out.println(true & false);	// false
		System.out.println(false & false);	// false

		// 逻辑或|: 全假为假, 遇真为真
		int a = 100;
		int b = 101;
		int c = 99;
		System.out.println(a < b | c > b);	// true
		System.out.println(true | false);	// true
		System.out.println(false | false);	// false
		System.out.println(true | true);	// true

		// 逻辑非!: 取反
		System.out.println(!false); // true
		System.out.println(!true);	// false
		// 这里需要加一个小括号, 运算符有优先级
		System.out.println(!(a > b));


		// 短路与&&
		System.out.println(true & true);	// true
		System.out.println(true & false);	// false
		System.out.println(false & false);	// false
		// 结果相同
		System.out.println(true && true);	// true
		System.out.println(true && false);	// false
		System.out.println(false && false);	// false

		int x = 10;
		int y = 11;
		// 逻辑与全真为真, 左边x > y结果已经是false了, 整个表达式的结果已经确认为false了,
		//		按道理来说右边的表达式不应该执行.
		System.out.println(x > y & x > y++);
		// 通过测试得出: 表达式x > y++执行了.
		System.out.println(y);	// 12
		
		int m = 10;
		int n = 11;
		// 使用短路与时, 当左边的表达式为false时, 右边的表达式不执行, 称为短路.
		System.out.println(m > n && m > n++);
		// 通过测试, m > n++未执行.
		System.out.println(n); // 11
		
		// 短路或||
		// 左边表达式结果为true时, 右边表达式不需要执行, 此时短路.
		int i = 1;
		int j = 2;
		System.out.println(i < j || i > j--);
		System.out.println(j);	// 2
	}
}