/*
	1. continue要和break对比着学
	2. continue语句作用:
		终止当前本次循环, 直接进入更新表达式, 然后执行下一次循环.
*/
public class ContinueTest01{
	public static void main(String[] args){
		for(int i = 0; i <= 10; i++){
			if(i == 5){
				break;
			}
			System.out.println("i = " + i);		// 0 1 2 3 4
		}
		System.out.println("--------------------");

		for(int i = 0; i <= 10; i++){
			if(i == 5){
				continue;	// 执行continue后, 这之后的语句将不会执行, 跳到i++, 然后执行下一次循环
			}
			System.out.println("i = " + i);		// 0 1 2 3 4 6 7 8 9 10 , 没有5
		}
	}
}