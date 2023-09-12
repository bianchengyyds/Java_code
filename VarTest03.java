/*
	变量的分类 :
		1. 根据出现的位置进行划分 :
			局部变量 ( 在方法体中 )
			成员变量 ( 在方法体外, 类体内 )
		
		2. 注意 :
			局部变量只在方法体中有效, 方法体执行结束, 该变量的内存就释放了.
*/
public class VarTest03{

	// 成员变量
	int i = 10;

	public static void main(String[] args){
		
		// 局部变量
		int j = 20;	// main方法结束后j的内存将释放
	}
}