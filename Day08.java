/*
	1、根据指定月份，打印该月份所属的季节。
		3,4,5 春季 
		6,7,8 夏季 
		9,10,11 秋季 
		12, 1, 2 冬季

	if和switch各写一版

	2、从键盘接收一个数字，判断该数字的正负。

	3、从键盘接收一个数字，判断该数字的奇偶。

	4、整数大小比较：输入两个整数，比较大小，
		若x>y 输出 >
		若x=y 输出 =
		若x<y 输出 <

	5、编写程序，由键盘输入三个整数分别存入变量num1,num2,num3中，对它们进行排序，
	使用if-else结构，并按从小到大的顺序输出

	6、打车起步价8元（3KM以内）
	超过3KM，超出的每公里1.2元
	超过5KM，超出的每公里1.5元
	请在键盘上接收公里数，得出总价。
*/
public class Day08{
	public static void main(String[] args){
	/*	
	1. 方法一if:
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入一个月份: ");
		int month = s.nextInt();

		String str = "春季";
		if(month > 12 || month < 1){
			System.out.println("输入错误");
			return;
		}else if(month == 12 || month <= 2){
			str = "冬季";
		}else if(month >= 9){
			str = "秋季";
		}else if(month >= 6){
			str = "夏季";
		}
		System.out.println(str);
	*/
	/*	
	方法二switch:
	
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入一个月份: ");
		int month = s.nextInt();
		String str = "输入错误";
		
		if(month >= 1 && month <=12){
			switch(month){
				case 3:
				case 4:
				case 5:
					str = "春季";
					break;
				case 6:
				case 7:
				case 8:
					str = "夏季";
					break;
				case 9:
				case 10:
				case 11:
					str = "秋季";
					break;
				default:
					str = "冬季";
			}
		}
		System.out.println(str);
	*/
	/*
	2. 
	
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入一个数字: ");
		double num = s.nextDouble();
		String str = "负";

		if(num > 0){
			str = "正";
		}else if(num == 0){
			str = "非正非负";
		}
		System.out.println(str);
	*/
	/*
	3.
	
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入一个数字: ");
		int num = s.nextInt();
		if(num % 2 == 0){
			System.out.println("偶数");
		}else {
			System.out.println("奇数");
		}
	*/
	/*
	4.
	
		java.util.Scanner s1 = new java.util.Scanner(System.in);
		java.util.Scanner s2 = new java.util.Scanner(System.in);
		System.out.print("请输入两个数字: ");
		int x = s1.nextInt();
		int y = s2.nextInt();
		String str = "=";

		if(x > y){
			str = ">";
		}else if(x < y){
			str = "<";
		}
		System.out.println(str);
	*/
	/*
	5.
	
		java.util.Scanner s1 = new java.util.Scanner(System.in);
		java.util.Scanner s2 = new java.util.Scanner(System.in);
		java.util.Scanner s3 = new java.util.Scanner(System.in);
		System.out.print("请输入三个数字: ");
		int num1 = s1.nextInt();
		int num2 = s2.nextInt();
		int num3 = s3.nextInt();
		int tmp = 0;

		if(num1 > num2){
			tmp = num2;
			num2 = num1;
			num1 = tmp;
		}
		if(num1 > num3){
			tmp = num3;
			num3 = num1;
			num1 = tmp;
		}
		if(num2 > num3){
			tmp = num3;
			num3 = num2;
			num2 = tmp;
		}
		System.out.println("小" + num1 + ",中" + num2 + ",大" + num3);
	*/
	/*
	6.
	
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入公里数: ");
		double km = s.nextDouble();
		double price = 8;
		if(km > 5){
			price = 8 + 1.2 * 2 + (km - 5) * 1.5;
		}else if(km > 3){
			price = 8 + (km - 3) * 1.2;
		}
		System.out.println(price);
	*/
	}
}