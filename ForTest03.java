/*
	
*/
public class ForTest03{
	public static void main(String[] args){
		// 变形
		for (int i = 10; i >= 0; i--){
			System.out.println("i = " + i);		// 10 9 ... 0
		}

		// 变形
		for (int i = 0; i <= 10; i += 2){
			System.out.println("i = " + i);		// 0 2 ... 10
		}

		// 变形
		for (int i = 1; i <= 10; i += 2){
			System.out.println("i = " + i);		// 1 3 ... 9
		}

		// 变形
		for (int i = 100; i >= 0; i %= 3){
			System.out.println("i = " + i);		// 100 1 1 1 1 ...
		}
	}
}