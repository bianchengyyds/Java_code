/*
	*第一题：编写 java 程序，用循环结构打印如下的数值列表： 
			1 10 100 1000 
			2 20 200 2000 
			3 30 300 3000 
			4 40 400 4000
			5 50 500 5000 

	第二题：打印 2 到 10000 的所有素数，每行显示 8 个素数。 

	第三题：编写程序，计算 5 的阶乘。 

	第四题：控制台输入年龄，根据年龄输出不同的提示。 

	*第五题：编写程序输出下图菱形
				*
			   ***
			  *****
			 *******
			*********
			 *******
			  *****
			   ***
			    *
	*第六题：篮球从 5 米高的地方掉下来，每次弹起的高度是原来的 30%，经过几次弹起，篮球的高度是 0.1 米
*/
public class ControlSentenceTest{
	public static void main(String[] args){
		/*
			第一题：编写 java 程序，用循环结构打印如下的数值列表： 
			1 10 100 1000 
			2 20 200 2000 
			3 30 300 3000 
			4 40 400 4000
			5 50 500 5000
		

		int num = 0;
		for(int i = 1; i <= 5; i++){
			int tmp = i;
			for(int j = 1; j <= 4; j++){
				System.out.print(tmp + " ");
				tmp *= 10;
			}
			System.out.println();
		}
		*/

		// 第二题：打印 2 到 1000 的所有素数，每行显示 8 个素数
		// 素数: 除了1和它本身以外不再有其它因数
/*
		第一步: 取出2到1000之间的正整数i
		第二步: 再取出2到i-1之间的正整数j
		第三步: 试除( 将i除以j, 如果可以整除则该数不是质数 )
		第四步: 2到i-1的数都试除后, 发现都不能整除, 此时的j和i相等, 则i为质数

		int i = 0;
		int num = 0;
		for(i = 2; i <= 1000; i++){
			int j = 2;
			for(; j <= i - 1; j++){
				if(i % j == 0){
					break;
				}
			}
			
			if(i == j){
				num++;
				System.out.print(i + " ");
				if(num % 8 == 0){
					System.out.println();
				}
			}
		}
*/
		// 第三题：编写程序，计算 5 的阶乘
		/*
		int i = 0;
		int jieCheng = 1;
		for(i = 1; i <= 5; i++){
			jieCheng *= i;	
		}
		System.out.println(jieCheng);	// 120
		*/

		// 第四题：控制台输入年龄，根据年龄输出不同的提示.
		/*
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入你的成绩: ");
		double score = s.nextDouble();
		
		if( score > 100 || score < 0 ){
			System.out.println("输入错误, 请重新输入");
			return;
		}
		int grade = (int)(score / 10);
		String str = "";
		switch(grade){
		default:
			str = "不及格";
			break;
		case 6:
			str = "及格";
			break;
		case 7:
			str = "中";
			break;
		case 8:
			str = "良";
			break;
		case 9:
		case 10:
			str = "优秀";
			break;
		}
		System.out.println(str);
		*/


// 第六题：篮球从 5 米高的地方掉下来，每次弹起的高度是原来的 30%，经过几次弹起，篮球的高度是 0.1 米
	/*
		double height = 5.0;
		int count = 0;
		for(; height > 0.1; count++){
			height *= 0.3;
		}
		System.out.println(count);
	*/
	}
}