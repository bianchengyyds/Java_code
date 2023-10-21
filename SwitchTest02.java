/*
	业务2:
		1. 接收一个学生的考试成绩, 根据考试成绩输出成绩的等级.
		2. 等级:
			优:	[90-100]
			良:	[80-89]
			中:	[70-79]
			及格:	[60-69]
			不及格:	[0-59]
		3. 要求成绩是一个合法的数字, 成绩必须在[0-100]之间, 成绩可能带有小数.
		4. 要求使用switch语句实现.
*/
public class SwitchTest02{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入你的成绩: ");
		double score = s.nextDouble();
		
		if( score > 100 || score < 0 ){
			System.out.println("输入错误, 请重新输入");
			return;
		}
		int grade = (int)(score / 10);
		/*
		switch(grade){
		default:
			System.out.println("不及格");
			break;
		case 6:
			System.out.println("及格");
			break;
		case 7:
			System.out.println("中");
			break;
		case 8:
			System.out.println("良");
			break;
		case 9:
		case 10:
			System.out.println("优秀");
			break;
		}
		*/

		// 改善:
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
	}
}