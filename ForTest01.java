/*
	为什么使用循环语句:
		1. 要求在控制台上输出100个100
		System.out.println(100);
		System.out.println(100);
		System.out.println(100);
		System.out.println(100);
		System.out.println(100);
		...
		这种方法有点复杂, 所以要使用循环语句来实现这个业务.

*/
public class ForTest01{
	public static void main(String[] args){
		
		int i = 0;
		int count = 0;	// 计算打印结果的个数
		for(i = 1; i <= 100; i++){
			System.out.println(100);
			count++;
		}
		System.out.println("count = " + count);
	}
}