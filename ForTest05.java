/*
	1. ���кϷ���"�������"������Ƕ��ʹ��
	2. forѭ��Ƕ��һ��forѭ����ִ��ԭ��:
		for(){
			// �ڷ��������forѭ��ʱ, �������forѭ������һ����ͨ��java���
			for(){}
		}
*/
public class ForTest05{
	public static void main(String[] args){
		/*
		for(int i = 0; i < 2; i++){
			System.out.println("i = " + i);		// ѭ��2��
		}
		for(int j = 0; j < 10; j ++){
			System.out.println("j = " + j);		// ѭ��10��
		}

		System.out.println("------------------------");

		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 10; j ++){
				System.out.println("j = " + j);
			}
		}
		*/

		
		int i = 0;
		for(int k = 0; k < 2; k++){
			for(;i < 10; i++){
				System.out.println("k = " + k);		// 0 0 ... 0
				System.out.println("i --> " + i);	// 0 1 ... 9
			}
		}
		

		/*
		for(int k = 0; k < 2; k++){
			for(int i = 0;i < 10; i++){
				System.out.println("k = " + k);		// 0 0 ... 0		1 1 ... 1
				System.out.println("i --> " + i);	// 0 1 ... 9		0 1 ... 9
			}
		}
		*/
	}
}