/*
	业务2:
		1. 九九乘法表

		1 * 1 = 1
		1 * 2 = 2	2 * 2 = 4
		1 * 3 = 3	2 * 3 = 6	3 * 3 = 9
		...
		1 * 9 = 9	2 * 9 = 18 ... 9 * 9 = 81

		2. 特点:
			共九行
			第一行一个, 第二行两个, 第n行n个
*/
public class ForTest06{
	public static void main(String[] args){
		int i = 0;
		for(i = 1; i < 10; i++){		// 9行, 循环9次, i是行号
			for(int j = 1; j <= i; j++){	// 负责输出一行
				System.out.print(j + " * " + i + " = " + (j * i) + "	");
			}
		System.out.println();
		}
	}
}