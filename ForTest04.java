/*
	ҵ��1:
		1. ʹ��forѭ��, ʵ��1-100�����������
		2. ���ٸ������ֽ������
*/
public class ForTest04{
	public static void main(String[] args){
		int i = 0;
		int sum = 0;
		
		// ��һ��
		for(i = 0; i <= 100; i++){
			if(i % 2 != 0){
				sum += i;
			}
		}
		System.out.println("sum = " + sum);		// 2500
		

		// �ڶ���
		/*
		for(i = 1; i <= 100; i += 2){
			sum += i;
		}
		System.out.println("sum = " + sum);
		*/
	}
}