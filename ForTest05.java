/*
	1. 所有合法的"控制语句"都可以嵌套使用
	2. for循环嵌套一个for循环的执行原理:
		for(){
			// 在分析最外层for循环时, 把里面的for循环当作一个普通的java语句
			for(){}
		}
*/
public class ForTest05{
	public static void main(String[] args){
		/*
		for(int i = 0; i < 2; i++){
			System.out.println("i = " + i);		// 循环2次
		}
		for(int j = 0; j < 10; j ++){
			System.out.println("j = " + j);		// 循环10次
		}

		System.out.println("------------------------");

		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 10; j ++){
				System.out.println("j = " + j);
			}
		}
		*/

		
		int i = 0;
		for(int k = 0; k < 2; k++){
			for(;i < 10; i++){
				System.out.println("k = " + k);		// 0 0 ... 0
				System.out.println("i --> " + i);	// 0 1 ... 9
			}
		}
		

		/*
		for(int k = 0; k < 2; k++){
			for(int i = 0;i < 10; i++){
				System.out.println("k = " + k);		// 0 0 ... 0		1 1 ... 1
				System.out.println("i --> " + i);	// 0 1 ... 9		0 1 ... 9
			}
		}
		*/
	}
}