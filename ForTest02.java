/*
	1. �﷨��ʽ:
		for(��ʼ�����ʽ; �������ʽ; ���±��ʽ){
			ѭ����; // ��Java��乹��
		}

		ע��:
			��ʼ�����ʽ����ִ��, ����������ѭ����ִֻ��һ��

			�������ʽ�Ľ�������ǲ�������.

			�ĸ����趼��ʡ��.
	2. ִ��ԭ��:
		����ִ��:
			��ʼ��
			�������ʽ
				Ϊture, ִ������, Ϊfalse������ѭ��
			ѭ����
			����
		Ȼ��ѭ��:
			�������ʽ
				Ϊture, ִ������, Ϊfalse������ѭ��
			ѭ����
			����
		ֱ���������ʽΪfalse
*/
public class ForTest02{
	public static void main(String[] args){
		
		// �������forѭ��
		/*
			for(;;){
				System.out.println(1);
			}
		*/

		// �����forѭ��
		// һ��ѭ����, int i = 0;ִֻ��һ��, i��������forѭ���еľֲ�����, forѭ������֮��, 
		// i���ڴ潫���ͷ�. i����ֻ����forѭ����ʹ��.
		for (int i = 0; i <= 10; i++){
			System.out.println("i = " + i);		// 0 1 ... 10
		}
		
		// i�������������������.
		int i = 0;
		for (i = 0; i <= 10; i++){
			System.out.println("i -> " + i);	// 0 1 ... 10
		}
		System.out.println(i);					// 11

		// ����
		for (int k = 0; k <= 10;){
			System.out.println("k -> " + k);	// 0 1 ... 10
			k++;
		}

		// �ٱ���
		for (int k = 0; k <= 10;){
			k++;
			System.out.println("k -> " + k);	// 1 2 ... 11
		}
	}
}