/*
	1. �﷨�ṹ:
		do{
			ѭ����;
		}while();

	2. ִ��ԭ��:
		��ִ��һ��ѭ����, ���жϲ������ʽ, Ϊtrue��ִ��ѭ����, Ϊfalse�����ѭ��.
	3. ע��:
		do...whileѭ�����Ҫ���˷ֺ�( ��Ϊwhile����û�н������ܵĴ�����, ����Ҫʹ�÷ֺ������� )
	4. do...while��ѭ������:
		1~n��
*/
public class DoWhileTest01{
	public static void main(String[] args){
		/*
		int i = 0;
		do{
			System.out.println("i = " + i);
			i++;
		}while(i <= 10);	// 0 1 ... 10
		*/

		// ����
		/*
		int i = 0;
		do{
			System.out.println(i++);
		}while(i <= 10);	// 0 1 ... 10
		*/

		// ����
		int i = 0;
		do{
			System.out.println(++i);
		}while(i <= 10);	// 1 2 ... 11

		do{
			System.out.println("Hello world");
		}while(false);
	}
}