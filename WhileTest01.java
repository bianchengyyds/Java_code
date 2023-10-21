/*
	1. 语法格式:
		while(布尔表达式){
			循环体;
		}
	2. 执行原理:
		判断布尔表达式的结果, 如果为true执行循环体, 循环结束后, 再判断布尔表达式, 为true, 执行循环体, 直到布尔表达式为false, 才终止循环.
3. while循环执行的次数:
	0~n次
4. while和for本质上相同, 只不过语法格式不同.
*/
public class WhileTest01{
	public static void main(String[] args){
		int i = 0;
		
		/*
		while (i <= 10){
			System.out.println("i = " + i);
			i++;
		}

		for(i = 0; i <= 10; i++){
			System.out.println("i -> " + i);
		}
		*/

		while (i <= 10){
			i++;
			System.out.println("i = " + i);
		}
		for(i = 0; i <= 10;){
			i++;
			System.out.println("i -> " + i);
		}

	}
}