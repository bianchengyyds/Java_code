/*
	1������ָ���·ݣ���ӡ���·������ļ��ڡ�
		3,4,5 ���� 
		6,7,8 �ļ� 
		9,10,11 �＾ 
		12, 1, 2 ����

	if��switch��дһ��

	2���Ӽ��̽���һ�����֣��жϸ����ֵ�������

	3���Ӽ��̽���һ�����֣��жϸ����ֵ���ż��

	4��������С�Ƚϣ����������������Ƚϴ�С��
		��x>y ��� >
		��x=y ��� =
		��x<y ��� <

	5����д�����ɼ����������������ֱ�������num1,num2,num3�У������ǽ�������
	ʹ��if-else�ṹ��������С�����˳�����

	6�����𲽼�8Ԫ��3KM���ڣ�
	����3KM��������ÿ����1.2Ԫ
	����5KM��������ÿ����1.5Ԫ
	���ڼ����Ͻ��չ��������ó��ܼۡ�
*/
public class Day08{
	public static void main(String[] args){
	/*	
	1. ����һif:
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("������һ���·�: ");
		int month = s.nextInt();

		String str = "����";
		if(month > 12 || month < 1){
			System.out.println("�������");
			return;
		}else if(month == 12 || month <= 2){
			str = "����";
		}else if(month >= 9){
			str = "�＾";
		}else if(month >= 6){
			str = "�ļ�";
		}
		System.out.println(str);
	*/
	/*	
	������switch:
	
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("������һ���·�: ");
		int month = s.nextInt();
		String str = "�������";
		
		if(month >= 1 && month <=12){
			switch(month){
				case 3:
				case 4:
				case 5:
					str = "����";
					break;
				case 6:
				case 7:
				case 8:
					str = "�ļ�";
					break;
				case 9:
				case 10:
				case 11:
					str = "�＾";
					break;
				default:
					str = "����";
			}
		}
		System.out.println(str);
	*/
	/*
	2. 
	
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("������һ������: ");
		double num = s.nextDouble();
		String str = "��";

		if(num > 0){
			str = "��";
		}else if(num == 0){
			str = "�����Ǹ�";
		}
		System.out.println(str);
	*/
	/*
	3.
	
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("������һ������: ");
		int num = s.nextInt();
		if(num % 2 == 0){
			System.out.println("ż��");
		}else {
			System.out.println("����");
		}
	*/
	/*
	4.
	
		java.util.Scanner s1 = new java.util.Scanner(System.in);
		java.util.Scanner s2 = new java.util.Scanner(System.in);
		System.out.print("��������������: ");
		int x = s1.nextInt();
		int y = s2.nextInt();
		String str = "=";

		if(x > y){
			str = ">";
		}else if(x < y){
			str = "<";
		}
		System.out.println(str);
	*/
	/*
	5.
	
		java.util.Scanner s1 = new java.util.Scanner(System.in);
		java.util.Scanner s2 = new java.util.Scanner(System.in);
		java.util.Scanner s3 = new java.util.Scanner(System.in);
		System.out.print("��������������: ");
		int num1 = s1.nextInt();
		int num2 = s2.nextInt();
		int num3 = s3.nextInt();
		int tmp = 0;

		if(num1 > num2){
			tmp = num2;
			num2 = num1;
			num1 = tmp;
		}
		if(num1 > num3){
			tmp = num3;
			num3 = num1;
			num1 = tmp;
		}
		if(num2 > num3){
			tmp = num3;
			num3 = num2;
			num2 = tmp;
		}
		System.out.println("С" + num1 + ",��" + num2 + ",��" + num3);
	*/
	/*
	6.
	
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("�����빫����: ");
		double km = s.nextDouble();
		double price = 8;
		if(km > 5){
			price = 8 + 1.2 * 2 + (km - 5) * 1.5;
		}else if(km > 3){
			price = 8 + (km - 3) * 1.2;
		}
		System.out.println(price);
	*/
	}
}