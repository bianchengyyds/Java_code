/*
	1. continueҪ��break�Ա���ѧ
	2. continue�������:
		��ֹ��ǰ����ѭ��, ֱ�ӽ�����±��ʽ, Ȼ��ִ����һ��ѭ��.
*/
public class ContinueTest01{
	public static void main(String[] args){
		for(int i = 0; i <= 10; i++){
			if(i == 5){
				break;
			}
			System.out.println("i = " + i);		// 0 1 2 3 4
		}
		System.out.println("--------------------");

		for(int i = 0; i <= 10; i++){
			if(i == 5){
				continue;	// ִ��continue��, ��֮�����佫����ִ��, ����i++, Ȼ��ִ����һ��ѭ��
			}
			System.out.println("i = " + i);		// 0 1 2 3 4 6 7 8 9 10 , û��5
		}
	}
}