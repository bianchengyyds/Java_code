/*
	ҵ��2:
		1. ����һ��ѧ���Ŀ��Գɼ�, ���ݿ��Գɼ�����ɼ��ĵȼ�.
		2. �ȼ�:
			��:	[90-100]
			��:	[80-89]
			��:	[70-79]
			����:	[60-69]
			������:	[0-59]
		3. Ҫ��ɼ���һ���Ϸ�������, �ɼ�������[0-100]֮��, �ɼ����ܴ���С��.
		4. Ҫ��ʹ��switch���ʵ��.
*/
public class SwitchTest02{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("��������ĳɼ�: ");
		double score = s.nextDouble();
		
		if( score > 100 || score < 0 ){
			System.out.println("�������, ����������");
			return;
		}
		int grade = (int)(score / 10);
		/*
		switch(grade){
		default:
			System.out.println("������");
			break;
		case 6:
			System.out.println("����");
			break;
		case 7:
			System.out.println("��");
			break;
		case 8:
			System.out.println("��");
			break;
		case 9:
		case 10:
			System.out.println("����");
			break;
		}
		*/

		// ����:
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
	}
}