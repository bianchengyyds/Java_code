/*
	1. 语法结构:
		do{
			循环体;
		}while();

	2. 执行原理:
		先执行一次循环体, 再判断布尔表达式, 为true则执行循环体, 为false则结束循环.
	3. 注意:
		do...while循环最后不要忘了分号( 因为while后面没有结束功能的大括号, 所以要使用分号来结束 )
	4. do...while的循环次数:
		1~n次
*/
public class DoWhileTest01{
	public static void main(String[] args){
		/*
		int i = 0;
		do{
			System.out.println("i = " + i);
			i++;
		}while(i <= 10);	// 0 1 ... 10
		*/

		// 变形
		/*
		int i = 0;
		do{
			System.out.println(i++);
		}while(i <= 10);	// 0 1 ... 10
		*/

		// 变形
		int i = 0;
		do{
			System.out.println(++i);
		}while(i <= 10);	// 1 2 ... 11

		do{
			System.out.println("Hello world");
		}while(false);
	}
}