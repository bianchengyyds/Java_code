/*
	1. break���Ƚ�����, ������: break�����һ�����ʳ�Ϊ��һ��java���
		continueҲ�����
	2. break����ʹ��λ��:
		����switch��䵱��
		����ѭ������
*/
public class BreakTest01{
	public static void main(String[] args){
		for(int i = 0; i <= 10; i++){
			if(i == 5){
				// break���������������ѭ����ֹ.
				break;	// ��Ե������������ѭ��, ���������if���
			}
			System.out.println("i = " + i);		// 0 1 2 3 4
		}		

		System.out.println("HelloWorld");	// break��ֹ����forѭ��, ��ѭ�����������޹�, �������������ճ�ִ��

		
		for(int j = 0; j < 2; j++){
			for(int i = 0; i <= 10; i++){
			if(i == 5){
				break;	// ��Ե������������ѭ��
			}
			System.out.println("i = " + i);		// 0 1 2 3 4	0 1 2 3 4
			}
		}
	}
}