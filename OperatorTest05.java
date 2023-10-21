/*
	条件运算符( 三目运算符 ):
		1. 语法格式:
			布尔表达式 ? 表达式1 : 表达式2
		2. 执行原理:
			布尔表达式的结果为true时, 执行表达式1, 否则执行表达式2.
*/
public class OperatorTest05{
	public static void main(String[] args){
		
		// 错误: 不是语句
		//100;

		// 错误: 不是语句
		// '男';
		boolean sex = true;

		// 错误: 不是语句
		// sex ? '男' : '女';	返回'男', 但是'男'不是语句, 所以报错.

		char c = sex ? '男' : '女';
		System.out.println(c);	// 男
	}
}