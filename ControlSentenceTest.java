/*
	*��һ�⣺��д java ������ѭ���ṹ��ӡ���µ���ֵ�б� 
			1 10 100 1000 
			2 20 200 2000 
			3 30 300 3000 
			4 40 400 4000
			5 50 500 5000 

	�ڶ��⣺��ӡ 2 �� 10000 ������������ÿ����ʾ 8 �������� 

	�����⣺��д���򣬼��� 5 �Ľ׳ˡ� 

	�����⣺����̨�������䣬�������������ͬ����ʾ�� 

	*�����⣺��д���������ͼ����
				*
			   ***
			  *****
			 *******
			*********
			 *******
			  *****
			   ***
			    *
	*�����⣺����� 5 �׸ߵĵط���������ÿ�ε���ĸ߶���ԭ���� 30%���������ε�������ĸ߶��� 0.1 ��
*/
public class ControlSentenceTest{
	public static void main(String[] args){
		/*
			��һ�⣺��д java ������ѭ���ṹ��ӡ���µ���ֵ�б� 
			1 10 100 1000 
			2 20 200 2000 
			3 30 300 3000 
			4 40 400 4000
			5 50 500 5000
		

		int num = 0;
		for(int i = 1; i <= 5; i++){
			int tmp = i;
			for(int j = 1; j <= 4; j++){
				System.out.print(tmp + " ");
				tmp *= 10;
			}
			System.out.println();
		}
		*/

		// �ڶ��⣺��ӡ 2 �� 1000 ������������ÿ����ʾ 8 ������
		// ����: ����1�����������ⲻ������������
/*
		��һ��: ȡ��2��1000֮���������i
		�ڶ���: ��ȡ��2��i-1֮���������j
		������: �Գ�( ��i����j, ������������������������ )
		���Ĳ�: 2��i-1�������Գ���, ���ֶ���������, ��ʱ��j��i���, ��iΪ����

		int i = 0;
		int num = 0;
		for(i = 2; i <= 1000; i++){
			int j = 2;
			for(; j <= i - 1; j++){
				if(i % j == 0){
					break;
				}
			}
			
			if(i == j){
				num++;
				System.out.print(i + " ");
				if(num % 8 == 0){
					System.out.println();
				}
			}
		}
*/
		// �����⣺��д���򣬼��� 5 �Ľ׳�
		/*
		int i = 0;
		int jieCheng = 1;
		for(i = 1; i <= 5; i++){
			jieCheng *= i;	
		}
		System.out.println(jieCheng);	// 120
		*/

		// �����⣺����̨�������䣬�������������ͬ����ʾ.
		/*
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("��������ĳɼ�: ");
		double score = s.nextDouble();
		
		if( score > 100 || score < 0 ){
			System.out.println("�������, ����������");
			return;
		}
		int grade = (int)(score / 10);
		String str = "";
		switch(grade){
		default:
			str = "������";
			break;
		case 6:
			str = "����";
			break;
		case 7:
			str = "��";
			break;
		case 8:
			str = "��";
			break;
		case 9:
		case 10:
			str = "����";
			break;
		}
		System.out.println(str);
		*/


// �����⣺����� 5 �׸ߵĵط���������ÿ�ε���ĸ߶���ԭ���� 30%���������ε�������ĸ߶��� 0.1 ��
	/*
		double height = 5.0;
		int count = 0;
		for(; height > 0.1; count++){
			height *= 0.3;
		}
		System.out.println(count);
	*/
	}
}