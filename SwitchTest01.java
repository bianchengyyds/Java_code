/*
	switch语句:
		1. 语法格式:
			switch(值){
			case 值1:
				java语句;
				java语句...
				break;
			case 值2:
				java语句;
				java语句...
				break;
			case 值3:
				java语句;
				java语句...
				break;
			default:
				java语句;
			}

			以上是一个完整的switch语句:
				其中: break和default不是必须的

			switch语句支持的值有:
				支持int类型以及String类型( JDK8之后才开始支持String类型 ).
				本质上只支持这两个, 但是byte, short, char也可以使用, 因为它们可以自动类型转换.

			switch中"值" 与 "值1", "值2"比较时会使用"=="进行比较.

		2. 执行原理:
			"值" 与 "值1"进行比较, 如果相同, 则执行该分支中的java语句, 然后遇到break, switch结束.
			如果不相等, 会继续将"值" 与 "值2" 进行比较, 如果相同, 则执行该分支中的Java语句, 遇到break结束.

			注意:
				如果分支执行了, 但是分支最后执行了, 此时会发生case穿透现象
				switch(值){
				case 值1:
					java语句;
					java语句...
				case 值2:
					java语句;
					java语句...
					break;
				此时会发生case穿透现象( 值与值1相同, 执行Java语句, 然后不与值2比较, 直接执行下面的java语句 )

			所有的case都没有执行, 则执行default语句.

	业务1:
		写一个完整的switch语句:
		接收键盘输入, 根据输入的数字来判断星期几.
			1 星期一
			...
			7 星期天
*/
public class SwitchTest01{
	public static void main(String[] args){
		
		/*
		错误: 不兼容的类型: 从long转换为int可能有损失
		long x = 100L;
		switch(x){
		
		}
		*/
/*
		byte b = 100;
		switch(b){
		
		}

		short s = 100;
		switch(s){
		
		}

		int i = 100;
		switch(i){
		
		}

		char c = 'a';
		switch(c){
		
		}

		String str = "stephen";
		switch(str){

		}
*/

		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入1-7的整数: ");
		int num = s.nextInt();
		/*
		switch(num){
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期天");
			break;
		default:
			System.out.println("输入错误, 请重新输入");
			break;
		}
		*/

		// 改善:
		switch(num){
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("weekday");
			break;
		case 6:
		case 7:
			System.out.println("weekend");
			break;
		default:
			System.out.println("输入错误, 请重新输入");
			break;
		}
	}
}