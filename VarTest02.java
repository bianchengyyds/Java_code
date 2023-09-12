/*
	1. 一行上可以同时声明多个变量
		
*/
public class VarTest02{
	public static void main(String[] args){

		// 声明三个变量, a, b, c, 但是a, b没有赋值, c赋值100
		int a, b, c = 100;
		
		// 给a, b赋值
		a = 10;
		b = 20;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}