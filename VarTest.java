/*
	1. 关于程序当中的数据 :
	开发软件是为了解决现实世界中的问题, 而现实世界中, 有很多问题都是使用数据进行描述
的, 所以软件执行过程中最主要就是对数据的处理.
	软件在处理数据之前需要能够表示数据, 在Java代码中表示数据, 有一个概念叫做字面量, 
也就是数据.
	10
	1.23
	true
	'a'
	"abc"等		都叫做字面量

	2. 数据被分为：整数型、浮点型、字符型、布尔型、字符串型等。 
	整数型（数字）：1、2、100、-2, -10
	浮点型（数字，带小数）：1.0、2.0、3.14 
	字符型（文字，单个字符）：'a'
	字符串型 ( 一个字符串 )	: "abc"
	布尔型（真假）：true ( 真 )、false ( 假 ), 布尔型只有这两个

	3. 如何区分字符型和字符串型 :
	单引号引起的 : 字符型
	双引号引起的 : 字符串型
*/


public class VarTest{
	public static void main(String[] args){

		System.out.println(100);
		System.out.println(1.23);
		System.out.println(true);
		System.out.println(false);
		System.out.println('a');
		System.out.println("abc");
		System.out.println("中");
		System.out.println("国");


		//定义/声明 一个变量, 起名i
		int i = 10;
		System.out.println(i);

		// 以下程序访问的是字符i和字符串i, 以下的两个i和i变量没有任何关系.
		System.out.println('i');
		System.out.println("i");
	}
}

/*
	变量:
	1. 10 + 20 = 30
	在内存中找一块空间存储10, 再找一块空间存储20, CPU负责"+"运算, 算出来的结果30再存放到一块空间中.

	2. 分析一下, 如果只有字面量, 没有变量机制的话, 有什么问题?

	// 以下虽然都是10, 但是这三个10占用三块不同的内存空间.
	System.out.println(10);
	System.out.println(10);
	System.out.println(10);	// 只有字面量的话, 是远远不够的, 因为字面量内存是无法重复利用的.
	int i = 10;
	// 以下访问的是同一块内存空间. ( 这样使用变量后, 内存空间就得到了复用 )
	System.out.println(i);
	System.out.println(i);
*/
	