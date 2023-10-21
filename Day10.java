/*
	*1、题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同

	*2、题目：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个。
	第二天早上又将剩下的桃子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下的一半零一个。
	到第10天早上想再吃时，只剩下一个桃子了。求第一天共摘了多少

	3、题目：计算 1! + 2! + 3! + 4! +... + 10!
		说明：4! 表示4的阶乘。4的阶乘是：1 * 2 * 3 * 4

	4、题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半再落下，
	求它在第10次落地时，共经过多少米

	5、一个四位数，恰好等于去掉它的首位数字之后所剩的三位数的3倍，这个四位数是多少？
*/
public class Day10{
	public static void main(String[] args){
	/*
	1.
	
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入一个五位的正整数 ");
		int num = s.nextInt();
		for(int i = 1; i <= 4; i++){
			num /= 10;
			int yuShu = num % 10;
		}
	
		int x = 12321;
		int a = 0, b = 0;
        int c = x;
        while (c!=0)
        {
            a = c % 10;
            b = b * 10 + a;
            c = c / 10;
        }
        if(b==x){
            System.out.print("是回文数");
        }else{
            System.out.print("不是回文数");
        }
	*/
	/*
	2.
	
		int day = 1;
		int num = 900;
		for(num = 900; num <= 5000; num++){
			for(day = 1; day <= 10; day++){
				num = num / 2 - 1;
				if(day == 10 && num == 1){
					System.out.println(num);
				}
			}
		}
	*/
	/*
		int num = 1;
		int day = 10;
		System.out.println("第" + day + "天有桃子:" + num);
		for (day = 9; day >= 1; day--) {
			num = 2 * (num + 1);
			System.out.println("第" + day + "天有桃子:" + num);
		}
		System.out.println("猴子在第1天摘了" + num + "个桃子");
	*/
	/*
	3.
	
		int i = 1;
		int jieCheng = 1;
		int sum = 0;
		for(i = 1; i <= 10; i++){
			jieCheng *= i;
			sum += jieCheng;
		}
		System.out.println(sum);
	*/
	/*
	4.
	
		int i = 1;
		int height = 100;
		int sum = 0;
		for(i = 1; i <= 10; i++){
			sum += height;
			height /= 2;
		}
		System.out.println(sum);
	*/
	/*
	5.
	
		int i = 1000;
		for(i = 1000; i <= 9999; i++){
			if(i == i % 1000 * 3){
				System.out.println(i + " ");
			}
		}
	*/
	}
}