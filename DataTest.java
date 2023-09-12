/*
	数据类型需要遵循的规则 :
	1. 八种基本数据类型中，除 boolean 类型不能转换，剩下七种类型之间都可以进行转换；

	2. 如果整数型字面量没有超出 byte,short,char 的取值范围，可以直接将其赋值给byte,short,char 类型的变量；

	3. 小容量向大容量转换称为自动类型转换，容量从小到大的排序为：byte < short(char) < int < long < float < double，其中
short 和 char 都占用两个字节，但是 char 可以表示更大的正整数；

	4. 大容量转换成小容量，称为强制类型转换，编写时必须添加“强制类型转换符”，但运行时可能出现精度损失，谨慎使用；

	5. byte,short,char 类型混合运算时，先各自转换成 int 类型再做运算；

	6. 多种数据类型混合运算，各自先转换成容量最大的那一种再做运算；
*/
/*
	1. short s1 = 1; s1 = s1 + 1;有什么错? 

	2. char 类型变量能不能储存一个中文的汉字，为什么？ 

	3. float f = 1.0 有什么错？ 

	4. long a = 2147483648 有什么错？ 

	5. int i = 0xffff 有问题吗？ 

	6. char c = 65536 有问题吗，为什么？
*/
public class DataTest{
	public static void main(String[] args){

		// 1. short s1 = 1;
		// 错误: 不兼容的类型: 从int转换到short可能会有损失		
		// s1 = s1 + 1;

		// 2. char c1 = '中';

		// 3. float f = (float)1.0;
		// float f = 1.0F;

		// 4. 错误: 整数太大
		// long a = 2147483648;
		// 改正
		// long a = 2147483648F;

		// 5. D:\Java\Java_code\chapter04>javac DataTest.java
		//	  D:\Java\Java_code\chapter04>java DataTest
		//		65535
		// int i = 0xffff;

		// 6. 错误: 不兼容的类型: 从int转换到char可能会有损失
		// char c = 65536;
		System.out.println(s1);
	}
}