/*
	switch���:
		1. �﷨��ʽ:
			switch(ֵ){
			case ֵ1:
				java���;
				java���...
				break;
			case ֵ2:
				java���;
				java���...
				break;
			case ֵ3:
				java���;
				java���...
				break;
			default:
				java���;
			}

			������һ��������switch���:
				����: break��default���Ǳ����

			switch���֧�ֵ�ֵ��:
				֧��int�����Լ�String����( JDK8֮��ſ�ʼ֧��String���� ).
				������ֻ֧��������, ����byte, short, charҲ����ʹ��, ��Ϊ���ǿ����Զ�����ת��.

			switch��"ֵ" �� "ֵ1", "ֵ2"�Ƚ�ʱ��ʹ��"=="���бȽ�.

		2. ִ��ԭ��:
			"ֵ" �� "ֵ1"���бȽ�, �����ͬ, ��ִ�и÷�֧�е�java���, Ȼ������break, switch����.
			��������, �������"ֵ" �� "ֵ2" ���бȽ�, �����ͬ, ��ִ�и÷�֧�е�Java���, ����break����.

			ע��:
				�����ִ֧����, ���Ƿ�֧���ִ����, ��ʱ�ᷢ��case��͸����
				switch(ֵ){
				case ֵ1:
					java���;
					java���...
				case ֵ2:
					java���;
					java���...
					break;
				��ʱ�ᷢ��case��͸����( ֵ��ֵ1��ͬ, ִ��Java���, Ȼ����ֵ2�Ƚ�, ֱ��ִ�������java��� )

			���е�case��û��ִ��, ��ִ��default���.

	ҵ��1:
		дһ��������switch���:
		���ռ�������, ����������������ж����ڼ�.
			1 ����һ
			...
			7 ������
*/
public class SwitchTest01{
	public static void main(String[] args){
		
		/*
		����: �����ݵ�����: ��longת��Ϊint��������ʧ
		long x = 100L;
		switch(x){
		
		}
		*/
/*
		byte b = 100;
		switch(b){
		
		}

		short s = 100;
		switch(s){
		
		}

		int i = 100;
		switch(i){
		
		}

		char c = 'a';
		switch(c){
		
		}

		String str = "stephen";
		switch(str){

		}
*/

		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("������1-7������: ");
		int num = s.nextInt();
		/*
		switch(num){
		case 1:
			System.out.println("����һ");
			break;
		case 2:
			System.out.println("���ڶ�");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
			break;
		case 7:
			System.out.println("������");
			break;
		default:
			System.out.println("�������, ����������");
			break;
		}
		*/

		// ����:
		switch(num){
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("weekday");
			break;
		case 6:
		case 7:
			System.out.println("weekend");
			break;
		default:
			System.out.println("�������, ����������");
			break;
		}
	}
}