/*
	关于java中的转义字符 :
		java中, \负责转义
			1. \t : 制表符tab
			2. \n : 换行
			3. \\ : \
			4. \' : '
			5. \" : "
*/
public class CharTest02{
	public static void main(String[] args){
		char c1 = 't';
		
		// 经过测试, 代码\t实际上是一个字符, 不属于字符串
		char c2 = '\t';
		char c3 = '\n';

		// \u表示后面的是一个字符unicode编码
		// unicode编码是十六进制的
		char x = '\u4e2d';	// 表示一个字符
		System.out.println(x);
//		System.out.println(c1);
//		System.out.println("abc" + c2 + "abc");
//		System.out.println(c1);
//		System.out.println("\"test\"");
//		System.out.print(c1);	//不换行
//		System.out.println(c1);	//换行
	}
}