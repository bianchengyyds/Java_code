/*
	1. 浮点型包括:
	float : 4个字节, 单精度
	double : 8个字节, 双精度, 更精确

	2. 但是需要注意的是, 如果在银行方面或者财务方面, double时远远不够的, 在Java中提供了一种精度更到的类型, 
这种类型专门使用在财务软件方面 : java.math.BigDecimal ( 引用数据类型 )

	3. float和double存储数据时都是存储的近似值, 因为现实世界中有这种无限循环数据, 但是计算机的内存有限,
用一个有限的资源存放无限的数据只能使用近似值.
	
	4. 注意 : 任意一个浮点型都比整数型空间大
		float容量 > long容量

	5. 规定 : 任意一个浮点型数据默认被当作double来处理, 如果想让这个浮点型数据被当作float来处理, 那么请在数据
			  后面添加F/f.
*/
public class FloatTest01{
	public static void main(String[] args){

		// 不存在类型转换
		double pai = 3.1415926;
		System.out.println(pai);

		// 
		float pi = 3.14F;
		System.out.println(pi);

		int i = (int)(10.0 / 5);
		System.out.println(i);
	}
}