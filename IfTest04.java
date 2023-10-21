/*
	业务4:
		1. 接收天气的信息
			1 : 雨天
			0 : 晴天
		2. 接收性别的信息
			1 : 男
			0 : 女
		3. 要求:
			当天气是雨天时:
				女 : 打一把小花伞
				男 : 打一把大黑伞
			当天气时晴天时:
				女 : 擦点防晒霜, 出去玩耍
				男 : 直接走起, 出去玩耍

		4. 需要使用if语句以及嵌套方式展现这个业务.
*/
public class IfTest04{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("今天的天气如何: ");
		int tianQi = s.nextInt();
		System.out.print("请输入你的性别: ");
		int sex = s.nextInt();
		if (tianQi != 1 && tianQi != 0){
			System.out.println("错误");
		}else{
			if (tianQi == 1){
			
				if(sex == 0){
					System.out.println("打一把小花伞");
				}else if(sex == 1){
					System.out.println("打一把大黑伞");
				}
			}else {
				if(sex == 0){
					System.out.println("擦点防晒霜, 出去玩耍");
				}else if (sex == 1){
					System.out.println("直接走起, 出去玩耍");
				}
			}			
		}
		
	}
}