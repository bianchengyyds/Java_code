/*
	0. Ӧ�����ȥ���( ���ɺ�ϰ��, ����ǳ���Ҫ ) :
			1) ��ʹ�ú�������˼·;
			2) ���ӵ�����, ����һ��һ����ʵ��, û��Ҫһ�����.

	1������1000�������в��ܱ�7����������֮��
		��һ��:	��1��ʼѭ��, ѭ����1000, �ȱ�֤ÿһ�����ֶ���ȡ��;
		
		�ڶ���: �ڵ�һ����ѭ��������, һ������һ�����ֵ�ɸ��, �жϸ������Ƿ���"���ܱ�7����������";

		������: �����Щ���������, ����������ӡ����.
	2������ 1+2-3+4-5+6-7....+100�Ľ��

	3���ӿ���̨����һ������������������Ľ׳ˡ���������5���׳�Ϊ 5*4*3*2*1

	*4���ӿ���̨����һ�����������жϸ������Ƿ�Ϊ����
	������������ָ�ڴ���1����Ȼ���У�����1�����������ⲻ����������������Ȼ����

	*5���Ӽ��̽���һ��������������������Ϊ�������������ͼ��
		*
	   ***
	  *****
	 *******
	*********
	���磺����5�����ӡ����ͼ5�С�

	6��С��������ÿ�����2.5ԪǮ������������������ǣ�ÿ����һ���Ǵ�Ǯ�ĵ�5��
	����5�ı����Ļ��������Ứȥ6ԪǮ�����ʣ����������죬С���ſ��Դ浽100ԪǮ��

	*7��һ�������ǡ�õ�����������֮�ͣ�������������������� 6 = 1 + 2 + 3�����
	�ҳ�1000�����е�������

	8����һ��������5λ����������
	Ҫ��
	һ�������Ǽ�λ��
	���������ӡ����λ����
*/
public class Day09{
	public static void main(String[] args){
		
			//1������1000�������в��ܱ�7����������֮��
		/*
			int i = 0;
			int sum = 0;	// sum����, ���ڴ洢��͵Ľ��
			// ѭ��ʱ��for, while, do...while
			for(i = 0; i <= 1000; i++){		// ��һ��
				// �ж�ʱ��if, switch
				if(i % 7 != 0){		// �ڶ���, ��ʱ��i�ǲ��ܱ�7������, ��ʱ���iӦ���������
					sum += i;	// ������, ���
				}
			}
			// ��forѭ������֮��, �����������, �������������
			System.out.println("sum = " + sum);
		*/
		
			//2������ 1+2-3+4-5+6-7....+100�Ľ��
		/*
			// ������:
			int i = 0;
			int j = 0;
			int sum1 = 0;
			int sum2 = 0;
			for(i = 2; i <= 100; i += 2){
				sum1 += i;
			}
			for(j = 3; j <= 100; j += 2){
				sum2 += j;
			}
			System.out.println(sum1 - sum2 + 1);	// +1����ĿҪ��
		*/
		/*
			// ����һ:
			int i = 0;
			int sum = 1;	// sum�ĳ�ʼֵ��1������0
			for(i = 2; i <= 100; i++){		// i��2��ʼ

				if(i % 2 != 0){		// ����-
					sum -= i;
				}else {		// ż��+
					sum += i;
				}
				
			}
			System.out.println(sum);
		*/

		
			// 3���ӿ���̨����һ������������������Ľ׳ˡ���������5���׳�Ϊ 5*4*3*2*1
		/*
			java.util.Scanner s = new java.util.Scanner(System.in);
			System.out.print("������һ��������: ");

			int i = s.nextInt();
			int jieCheng = 1;		// ��ʼֵ����Ϊ0, ����˻���Ϊ0��
			for(int j = 1; j <= i; j++){
				jieCheng *= j;
			}
			System.out.println(jieCheng);
		*/	
		
			// 4���ӿ���̨����һ�����������жϸ������Ƿ�Ϊ����
			// ������������ָ�ڴ���1����Ȼ���У�����1�����������ⲻ����������������Ȼ����
			
			// ��һ��: ����һ��������
			// �ڶ���: ȡ����2��ʼ��������������Ȼ��
			// ������: �ø�����������Щ��Ȼ��( ���ڵ���2, С�ڸ������� )ȡģ, �жϸý���Ƿ�Ϊ0, ���Ϊ0, ��ֱ������ѭ��
			// ���Ĳ�: ����Щ��Ȼ�����Գ���֮��, ��ʱ����Ȼ������ѭ����ĵ���++��, ��������������, �����Ϊ����

			java.util.Scanner s = new java.util.Scanner(System.in);
			System.out.println("������һ��������: ");	//	��һ��

			// ����һ:
		/*
			int i = s.nextInt();
			int j = 0;
			for(j = 2; j < i; j++){		// �ڶ���
				if(i % j == 0){			// ������
					System.out.println("������������");
					break;		// Ϊ��Ч��, ����Ҫ��ֹѭ��
				}
			}
			if(i == j){					// ���Ĳ�
				System.out.println("����������");
			}
		*/

			// ������( ��Ҫ��ϰ�򲼶���� ):
		/*
			int i = s.nextInt();
			int j = 0;

			// ׼��һ���������͵ı��
			boolean zhiShu = true;		// true��ʾ����

			for(j = 2; j < i; j++){
				if(i % j == 0){
					zhiShu = false;		// false��ʾ��������
					break;		// Ϊ��Ч��, ����Ҫ��ֹѭ��
				}
			}	
			System.out.println(i + (zhiShu ? "��" : "����") + "����");	// ��Ŀ�����, �жϲ������ͱ���Ƿ�Ϊ����
		*/	

			// 5���Ӽ��̽���һ��������������������Ϊ�������������ͼ��
			//	  *
			//   ***
			//  *****
			// *******
			//*********
			// ���磺����5�����ӡ����ͼ5�С�

			// ��һ��: ����һ��������
			// �ڶ���: ���ѭ�������к�
			// ������: �ڲ�ѭ��1���ƿո�( 2n-1 )
			// ���Ĳ�: �ڲ�ѭ��2�����Ǻ�( ������-�к� )
			// ���岽: һ�н�����, Ҫִ�л���

				// ���ƿո�
				// ��һ����һ��
				// �ڶ���������
				// �����������
				// ��n����2n-1��

				// �����Ǻ�
				// ��һ�����ĸ�(5-1)
				// �ڶ���������(5-2)
				// �������Ƕ���(5-3)
				// ��������һ��(5-4)
				// ��������0��(5-5)
				// ��n����������-�к�
 
		/*
			java.util.Scanner s = new java.util.Scanner(System.in);
			System.out.println("������һ��������( ��Ϊ�к�, ���ͼ�� ): ");

			int rows = s.nextInt();

			// 6��ѭ��6��
			// n��ѭ��n��
			for(int i = 0; i < rows; i++){		// ���ѭ�����Ƶ���������
				// ��������Ҫ��һ��ȫ�����
				// ������Ҫ�ٴ�ʹ��ѭ��, ����ո��Լ�"*"	// �ڲ�ѭ�����Ƶ�������


				// ���ƿո�
				for(int j = 0; j < rows - i; j++){
					System.out.print(" ");
				}

				// �����Ǻ�
				for(int k = 0; k < (2 * i - 1); k++){
					System.out.print("*");
				}

				// ��������forѭ��������֮��, ��ʾһ�оͽ�����
				// �����ﻻ��
				System.out.println();
			}
		*/

			//6��С��������ÿ�����2.5ԪǮ������������������ǣ�ÿ����һ���Ǵ�Ǯ�ĵ�5��
			//����5�ı����Ļ��������Ứȥ6ԪǮ�����ʣ����������죬С���ſ��Դ浽100ԪǮ��
		/*
			double i = 0;
			int day = 0;
			

			while(i < 100){
				i += 2.5;
				day++;
				if(day % 5 == 0){
					i -= 6;
				}
			}
			if(i >= 100){
				System.out.println("��" + day + "��, " + "�浽��" + i + "Ԫ");
			}
		*/
		
			// 7��һ�������ǡ�õ�����������֮�ͣ�������������������� 6 = 1 + 2 + 3�����
			// �ҳ�1000�����е�������

			// ��һ��: ȡ��1��1000֮�����������
			// �ڶ���: �жϸ����Ƿ�Ϊ����
			// ������: �ҵ�����������
			// ���Ĳ�: ������ڸ���, ��������, ����������
		/*
			int i = 0;
			int j = 0;
			
			for(i = 2; i <= 1000; i++){		// ��һ��

			// �ڶ���: �ж�i�Ƿ�Ϊ����

			// ������: �ҵ�����������
				int sum = 0;
				for(j = 1; j <= i / 2; j++){
					if(i % j == 0){
						// ��ʱ��j��������
						sum += j;
					}
				}
				if(i == sum){
					System.out.println(i);
				}
				
			}
		*/
		
			// 8����һ��������5λ����������
			// Ҫ��
			// һ�������Ǽ�λ��
			// ���������ӡ����λ����
		/*
			java.util.Scanner s = new java.util.Scanner(System.in);
			System.out.print("������һ����С��5λ��������: ");

			int i = s.nextInt(); 
			int weiShu = 0;
			for(; i != 0; i /= 10){
				weiShu++;
				System.out.print((i % 10));		// �����ӡ
			}
			if(i == 0){
				System.out.println();
				System.out.println("�������" + weiShu + "λ��");
			}
		*/
	}
}