/*
	关系运算符:
		>
		>=
		<
		<=
		==
		!=

		1. 一定要记住一个规则:
			所有关系运算符的结果都是布尔型, 不是true就是false

		2. 在Java中:
			= : 赋值运算符
			== : 关系运算符, 判断是否相等
*/
public class OperatorTest02{
	public static void main(String[] args){
		int a = 10;
		int b = 10;
		System.out.println(a > b);	// false
		System.out.println(a >= b);	// true
		System.out.println(a < b);	// false
		System.out.println(a <= b);	// true
		System.out.println(a == b);	// true
		System.out.println(a != b);	// false
	}
}