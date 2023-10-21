/*
	1. break语句比较特殊, 特殊在: break语句是一个单词成为了一个java语句
		continue也是如此
	2. break语句的使用位置:
		用于switch语句当中
		用于循环当中
*/
public class BreakTest01{
	public static void main(String[] args){
		for(int i = 0; i <= 10; i++){
			if(i == 5){
				// break语句会让离它最近的循环终止.
				break;	// 针对的是离它最近的循环, 而不是这个if语句
			}
			System.out.println("i = " + i);		// 0 1 2 3 4
		}		

		System.out.println("HelloWorld");	// break终止的是for循环, 与循环以外的语句无关, 所以这里的语句照常执行

		
		for(int j = 0; j < 2; j++){
			for(int i = 0; i <= 10; i++){
			if(i == 5){
				break;	// 针对的是离它最近的循环
			}
			System.out.println("i = " + i);		// 0 1 2 3 4	0 1 2 3 4
			}
		}
	}
}