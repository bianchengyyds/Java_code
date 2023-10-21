/*
	1. 输出信息到控制台:
		Ssytem.out.println();
	2. 接受键盘输入:
		看不懂很正常, 因为这个代码时面向对象章节学习之后才能理解的.

	前提: java.util.Scanner s = new java.util.Scanner(System.in);
	3. 接受一个整数:
		int num = s.nextInt();
	4. 接收一个字符串:
		String str = s.next()
*/
public class KeyInput{
	public static void main(String[] args){

		// 创建一个键盘扫描器对象
		// s: 变量名, 可以修改, 其它不能修改
		java.util.Scanner s = new java.util.Scanner(System.in);

		// 接受一个int类型的数据
		// 代码执行到此, 会暂停下来, 等待用户输入, 用户可以输入一个整数, 然后回车
		// 回车之后i变量就有值了, 这个值就是用户输入的那个数.


		int i = s.nextInt();
		System.out.println("你输入的数为 : " + i);

		System.out.print("请输入用户名: ");
		String name = s.next();
		System.out.println("欢迎" + name + "回来");

		int j = s.nextInt();
		System.out.println("你输入的是 " + j);

		String kd = s.next();
		System.out.println("你输入的是 " + kd);


		//java.util.Scanner s = new java.util.Scanner(System.in);

		int k = s.nextInt();
		System.out.println("你输入的是:" + k);



		int a = s.nextInt();
		System.out.println("你输入的是:" + a);


		String b = s.next();
		System.out.println("你输入的是:" + b);
	}
}