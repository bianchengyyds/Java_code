/*
	1. �﷨��ʽ:
		while(�������ʽ){
			ѭ����;
		}
	2. ִ��ԭ��:
		�жϲ������ʽ�Ľ��, ���Ϊtrueִ��ѭ����, ѭ��������, ���жϲ������ʽ, Ϊtrue, ִ��ѭ����, ֱ���������ʽΪfalse, ����ֹѭ��.
3. whileѭ��ִ�еĴ���:
	0~n��
4. while��for��������ͬ, ֻ�����﷨��ʽ��ͬ.
*/
public class WhileTest01{
	public static void main(String[] args){
		int i = 0;
		
		/*
		while (i <= 10){
			System.out.println("i = " + i);
			i++;
		}

		for(i = 0; i <= 10; i++){
			System.out.println("i -> " + i);
		}
		*/

		while (i <= 10){
			i++;
			System.out.println("i = " + i);
		}
		for(i = 0; i <= 10;){
			i++;
			System.out.println("i -> " + i);
		}

	}
}