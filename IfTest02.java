/*
	业务要求:
		1. 从键盘上接收一个人的年龄
		2. 年龄要求为[0-150], 其他值表示非法, 需要提示非法信息
		3. 根据人的年龄来动态的判断这个人属于生命的哪个阶段?
			[0-5]婴幼儿
			[6-10]少儿
			[11-18]少年
			[19-35]青年
			[36-55]中年
			[56-150]老年
		4. 请使用if语句完成以上的业务逻辑.
*/
public class IfTest02{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入年龄: ");
		int nianLing = s.nextInt();
	/*
		if(nianLing >= 0 && nianLing <= 5){
			System.out.println("婴幼儿");
		}else if(nianLing >= 6 && nianLing <= 10){
			System.out.println("少儿");
		}else if(nianLing >= 11 && nianLing <= 18){
			System.out.println("少年");
		}else if (nianLing >= 19 && nianLing <= 35){
			System.out.println("青年");
		}else if (nianLing >= 36 && nianLing <= 55){
			System.out.println("中年");
		}else if (nianLing >= 56 && nianLing <= 150){
			System.out.println("老年");
		}else {
			System.out.println("非法信息, 请重新输入!");
		}
	*/
		// 改进:
	/*
		if(nianLing < 0 || nianLing > 150){
			System.out.println("非法信息, 请重新输入!");
		}else if(nianLing <= 5){
			System.out.println("婴幼儿");
		}else if(nianLing <= 10){
			System.out.println("少儿");
		}else if(nianLing <= 18){
			System.out.println("少年");
		}else if (nianLing <= 35){
			System.out.println("青年");
		}else if (nianLing <= 55){
			System.out.println("中年");
		}else {
			System.out.println("老年");
		}
	*/
		// 再改进:
		String str = "老年";
		if(nianLing < 0 || nianLing > 150){
			System.out.println("非法信息, 请重新输入!");
			return;		// 终止程序, 后期会讲
		}else if(nianLing <= 5){
			str = "婴幼儿";
		}else if(nianLing <= 10){
			str = "少儿";
		}else if(nianLing <= 18){
			str = "少年";
		}else if (nianLing <= 35){
			str = "青年";
		}else if (nianLing <= 55){
			str = "中年";
		}
		System.out.println(str);
	}
}