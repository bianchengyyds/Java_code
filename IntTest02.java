/*
	在Java中有一条非常重要的结论, 必须记住 :
		1. 在任何情况下, 整数型的'字面量'默认被当作int类型来处理.
		2. 如果希望该'整数型字面量'被当作long类型来处理, 需要在'字面量'后面添加L
			建议使用大写L, 因为小写l和1傻傻分不清.
*/
public class IntTest02{
	public static void main(String[] args){
		
		// 不存在类型转换
		int a = 100;
		System.out.println(a);

		// 存在类型转换, 因为200这个字面量默认被当作int类型来处理
		// b变量是long类型, int是4个字节, long是8个字节
		// 小容量可以自动转换成大容量, 这种操作叫做 : 自动类型转换
		long b = 200;
		System.out.println(b);

		// 不存在类型转换, 因为字面量300L是long类型
		long c = 300L;
		System.out.println(c);

		// 题目:
		// 可以吗? 存在类型转换吗?
		// 可以, 而且存在类型转换
		long d = 2147483647;
		System.out.println(d);

		// 错误 : 整数太大
		// long e = 2147483648;
		
		// 这样就不会报错了, 字面量2147483648L被当作long类型来处理
		long e = 2147483648L;
		System.out.println(e);


	}
}