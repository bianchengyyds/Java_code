/*
	1. 语法格式:
		for(初始化表达式; 布尔表达式; 更新表达式){
			循环体; // 由Java语句构成
		}

		注意:
			初始化表达式最先执行, 并且在整个循环中只执行一次

			条件表达式的结果必须是布尔类型.

			四个步骤都可省略.
	2. 执行原理:
		依次执行:
			初始化
			布尔表达式
				为ture, 执行下面, 为false则跳出循环
			循环体
			更新
		然后循环:
			布尔表达式
				为ture, 执行下面, 为false则跳出循环
			循环体
			更新
		直到布尔表达式为false
*/
public class ForTest02{
	public static void main(String[] args){
		
		// 最简练的for循环
		/*
			for(;;){
				System.out.println(1);
			}
		*/

		// 最常见的for循环
		// 一下循环中, int i = 0;只执行一次, i变量属于for循环中的局部变量, for循环结束之后, 
		// i的内存将被释放. i变量只能在for循环中使用.
		for (int i = 0; i <= 10; i++){
			System.out.println("i = " + i);		// 0 1 ... 10
		}
		
		// i变量的作用域就扩大了.
		int i = 0;
		for (i = 0; i <= 10; i++){
			System.out.println("i -> " + i);	// 0 1 ... 10
		}
		System.out.println(i);					// 11

		// 变形
		for (int k = 0; k <= 10;){
			System.out.println("k -> " + k);	// 0 1 ... 10
			k++;
		}

		// 再变形
		for (int k = 0; k <= 10;){
			k++;
			System.out.println("k -> " + k);	// 1 2 ... 11
		}
	}
}