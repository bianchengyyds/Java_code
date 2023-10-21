/*
	业务3:
		1. 接收一个学生的考试成绩, 根据考试成绩输出成绩的等级.
		2. 等级:
			优:	[90-100]
			良:	[80-89]
			中:	[70-79]
			及格:	[60-69]
			不及格:	[0-59]
		3. 要求成绩是一个合法的数字, 成绩必须在[0-100]之间, 成绩可能带有小数.
*/
public class IfTest03{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入你的成绩: ");
		double chengJi = s.nextDouble();
		String str = "优";
		if (chengJi < 0 || chengJi > 100){
			System.out.println("非法数字, 请重新输入!");
			return;
		}else if (chengJi <= 59){
			str = "不及格";
		}else if (chengJi <= 69){
			str = "及格";
		}else if(chengJi <= 79){
			str = "中";
		}else if(chengJi <= 89){
			str = "良";
		}
		System.out.println(str);
	}
}