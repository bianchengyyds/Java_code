/*
	if���:
		1. �﷨��ʽ:
			��һ��д��:
				if(�������ʽ){
					java���;
					java���;
				}
				�����һ��������{}����һ����֧
				
				ִ��ԭ��:
					����������ʽ�Ľ��Ϊtrue, ��ִ�д�����
					�еĳ���, ����������еĴ��벻ִ��.

			�ڶ���д��:
				if(�������ʽ){	// ��֧1
					java���;
				}else{			// ��֧2
					java���;
				}

				ִ��ԭ��:
					����������ʽ�Ľ��Ϊtrue, ��ִ�з�֧1
					�еĳ���, ��֧2��ִ��, Ϊfalse, ��֧1��ִ��, ִ�з�֧2.

			������д��:
				if(�������ʽ1){	// ��֧1
					java���;
				}else if(�������ʽ2){ // ��֧2
					java���;
				}else if(�������ʽ3){ // ��֧3
					java���;
				}...

				ִ��ԭ��:
					���жϲ������ʽ1, Ϊtrue, ִ�з�֧1, Ȼ��ͽ�����.
					�����ʽ1Ϊfalse, ���жϱ��ʽ2, Ϊtrue, ִ�з�֧2, ����.
					...

		2. ע��:
			����if�����˵, ���κ������ֻ����1����ִ֧��, �����ܴ���2�����߶����ִ֧��.
			if���ֻҪ��һ����ִ֧����, ����if���ͽ�����.

			���Ǵ���else��, һ���ᱣ֤��һ����ִ֧��.

			����ֻ֧��һ��java���ʱ, �����ſ���ʡ��.
*/
public class IfTest01{
	public static void main(String[] args){
		// ҵ��: ��sexΪtrueʱ��ʾ��, ΪfalseʱΪŮ.

		java.util.Scanner s = new java.util.Scanner(System.in);
		boolean sex = s.nextBoolean();
	/*
		if(sex){
			System.out.println('��');
		}else{
			System.out.println('Ů');
		}
	*/

		// ����, ʹ����Ŀ�����
		System.out.println(sex ? '��' : 'Ů');

		if (sex)
			System.out.println('��');
			System.out.println("hello");	// û������ 
		
		// ����: �� 'if', ����û�� 'else'
		/*
		else
			System.out.println('Ů');
		*/
	}
}