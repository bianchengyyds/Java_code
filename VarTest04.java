/*
	变量的作用域 :
	1. 作用域 : 变量的有效范围
	2. 出了大括号就不认识了
	3. 不同的方法中的变量可以重名
	4. 局部变量和成员变量可以重名, 重名时, 哪个离我近就访问哪个 ( 就近原则 ), 但是不建议重名.
*/

public class VarTest04{

	// 成员变量
	int i = 100;

	public static void main(String[] args){
		// 局部变量
		// int i = 10;

		for (int j = 0; j < 10; j++){

		}
		// System.out.println(j);	// 不能访问, 因为j属于for域, 只在for中有效

		int k;
		for (k = 0; k < 10; k++){

		}
		System.out.println(k);	// 可以访问, 因为k属于main域
	}

	// 这个方法如何定义不用管, 后面会学
	public static void x(){
		// System.out.println(i);	// i是无法访问的, 因为i出了main方法的大括号就失效了.

		int i = 20;	// 这个i的有效范围是x方法, 与main方法中的i不冲突.
	}
}