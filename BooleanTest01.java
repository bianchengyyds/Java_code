/*
	1. 布尔类型只有true和false两个值
	2. boolean在实际开发中使用在逻辑判断中, 通常放在条件的位置
*/
public class BooleanTest01{
	public static void main(String[] args){

		// 错误: 不兼容的类型: int无法转换为boolean
//		boolean xingBie = 1;
//		System.out.println(xingBie);
		
		boolean sex = false;

		if (sex){
			System.out.println("男");
		}else {
			System.out.println("女");
		}

		int a = 1;
		int b = 2;
		boolean flag = (a < b);
		System.out.println(flag);
	}
}