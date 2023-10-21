/*
	字符串连接运算符:
		1. + 的作用:
			求和
			字符串拼接

		2. 何时使用:
			当 + 两边都是数字类型时, 求和.
			当 + 两边的任意一遍为字符串类型时, 会进行字符串拼接操作.
		
		3. 字符串拼接之后的结果还是一个字符串.

		4. 当一个表达式中有多个加号时:
			遵循自左向右的顺序依次执行( 除非添加小括号 ).
*/
public class OperatorTest06{
	public static void main(String[] args){
		int a = 100;
		int b = 200;
		// 求和
		int sum = a + b;
		// 字符串拼接
		System.out.println("sum = " + sum);	// sum = 30

		int nianLing = 20;

		// 字符串拼接
		System.out.println("年龄 = " + nianLing);	// 年龄 = 20
		
		// 先求和再拼接
		System.out.println(a + b + "110");	// 300110
		
		// 先拼接再拼接
		System.out.println(a + (b + "110"));	// 100200110

		// 在控制台上输出"100 + 200 = 300", 要求只能使用变量a(100)和b(200)和符号
		System.out.println(a + " + " + b + " = " + (a + b));
		
		// 在控制台输出"登录成功欢迎**回来", 要求**使用变量来表示
		String name = "stephen";
		System.out.println("登录成功欢迎" + name + "回来");
	}
}