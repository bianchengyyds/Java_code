/*
	1. 在java程序中使用EditPlus工具进行代码编写时, 有一些单词是蓝色, 红色, 绿色, 黑色, 紫色或粉色...
	2. 黑色字体的是 : 标识符
	3. 标识符可以标识 : 类名, 方法名, 变量名, 接口名, 常量名...
	4. 凡是程序员自己有权利命名的单词都是标识符
	5. 标识符的命名规则 : 
		规则1 : 只能由数字, 字母 ( 中文 ), 下划线, 美元符号组成, 不能含其它符号
		规则2 : 不能以数字开头
		规则3 : 关键字不能做标识符
		规则4 : 标识符严格区分大小写
			但是对于类名来说, 如果一个java源文件中同时出现了A类和a类,
			那么谁在前就生成谁 ( 只生成一个 ), 建议不要让类名"相同"
		规则5 : 标识符理论上没有长度限制
*/
public class BiaoShiFu{	// BiaoShiFu类名
	public static void main(String[] args){	// main方法名 ( 不能修改 ), args变量名
		
	}
}



/*
	1. 标识符除了命名规则之外, 还有命名规范:
		命名规则 ( 法律 ): 是语法, 不遵守会报错
		命名规范 ( 道德 ): 不符合也行, 遵守规范代码的可读性很好
	2. 具体的命名规范:
		规范1 : 见名知意 ( 看到标识符的名字后, 就知道这个什么意思 )
		规范2 : 遵循驼峰原则 ( 一高一低 )
			有利于单词与单词之间的分隔
			如 : BiaoShiFu 一看是3个单词
		规范3 : 类名和接口名首字母大写, 后面每个单词首字母大写
				StudenTest, UserTest
		规范4 : 变量名和方法名首字母小写, 后面每个单词首字母大写
				nianLing, mingZi
		规范5 : 所有常量名全部大写,并且单词与单词之间采用下划线衔接
				USER_AGE
*/	


/*
	关键字 :
	1. Java 关键字是编程语言里事先定义的，有特殊意义的单词，Java 中所有的关键字都是
小写的英语单词.
	2. 凡是在EditPlus中以蓝色字体形式存在的都是关键字.
	3. java语言中是严格区分大小写的, public和Public不一样, class和Class也不一样.
	4. 关键字不需要花时间去记忆, 随着后面程序的积累, 会接触到所有的关键字.
*/