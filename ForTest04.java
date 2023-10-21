/*
	业务1:
		1. 使用for循环, 实现1-100所有奇数求和
		2. 至少给出两种解决方案
*/
public class ForTest04{
	public static void main(String[] args){
		int i = 0;
		int sum = 0;
		
		// 第一种
		for(i = 0; i <= 100; i++){
			if(i % 2 != 0){
				sum += i;
			}
		}
		System.out.println("sum = " + sum);		// 2500
		

		// 第二种
		/*
		for(i = 1; i <= 100; i += 2){
			sum += i;
		}
		System.out.println("sum = " + sum);
		*/
	}
}