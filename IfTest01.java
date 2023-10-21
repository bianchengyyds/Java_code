/*
	if语句:
		1. 语法格式:
			第一种写法:
				if(布尔表达式){
					java语句;
					java语句;
				}
				这里的一个大括号{}叫做一个分支
				
				执行原理:
					如果布尔表达式的结果为true, 则执行大括号
					中的程序, 否则大括号中的代码不执行.

			第二种写法:
				if(布尔表达式){	// 分支1
					java语句;
				}else{			// 分支2
					java语句;
				}

				执行原理:
					如果布尔表达式的结果为true, 则执行分支1
					中的程序, 分支2不执行, 为false, 分支1不执行, 执行分支2.

			第三种写法:
				if(布尔表达式1){	// 分支1
					java语句;
				}else if(布尔表达式2){ // 分支2
					java语句;
				}else if(布尔表达式3){ // 分支3
					java语句;
				}...

				执行原理:
					先判断布尔表达式1, 为true, 执行分支1, 然后就结束了.
					当表达式1为false, 则判断表达式2, 为true, 执行分支2, 结束.
					...

		2. 注意:
			对于if语句来说, 在任何情况下只能有1个分支执行, 不可能存在2个或者多个分支执行.
			if语句只要有一个分支执行了, 整个if语句就结束了.

			凡是带有else的, 一定会保证有一个分支执行.

			当分支只有一个java语句时, 大括号可以省略.
*/
public class IfTest01{
	public static void main(String[] args){
		// 业务: 当sex为true时表示男, 为false时为女.

		java.util.Scanner s = new java.util.Scanner(System.in);
		boolean sex = s.nextBoolean();
	/*
		if(sex){
			System.out.println('男');
		}else{
			System.out.println('女');
		}
	*/

		// 改良, 使用三目运算符
		System.out.println(sex ? '男' : '女');

		if (sex)
			System.out.println('男');
			System.out.println("hello");	// 没有问题 
		
		// 错误: 有 'if', 但是没有 'else'
		/*
		else
			System.out.println('女');
		*/
	}
}