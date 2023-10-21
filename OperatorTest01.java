/*
	1. 算术运算符
		+
		-
		*
		/
		%	取余数

		++	自增1
			可以出现在变量前, 也可以出现在变量后面,
			不管是前是后, 执行结束后, 变量的值一定会自增1.
		
		--	自减1
			跟++一个道理
*/
public class OperatorTest01{
	public static void main(String[] args){
		int a = 10;
		int b = 3;
		System.out.println(a + b);	// 13
		System.out.println(a - b);	// 7
		System.out.println(a * b);	// 30
		System.out.println(a / b);	// 3
		System.out.println(a % b);	// 1

		int i = 1;
		System.out.println(i);
		++i;
		System.out.println(i);

		// 语法: 当++出现在变量后, 会先赋值运算, 再自增1.
		//					   前,  先自增1, 再赋值运算.
		int m = 10;
		//int n = m++;	// n = 10
		int n = ++m;	// n = 11
		System.out.println(n);
		System.out.println(m);	// m = 11


		// 题目:
		int c = 90;
		System.out.println(c++);	// 90
		System.out.println(c);		// 91

		int d = 80;
		System.out.println(++d);	// 81
		System.out.println(d);		// 81

		int e = 70;
		System.out.println(e--);	// 70
		System.out.println(e);		// 69

		int f = 60;
		System.out.println(--f);	// 59
		System.out.println(f);		// 59
	}
}