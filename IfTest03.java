/*
	ҵ��3:
		1. ����һ��ѧ���Ŀ��Գɼ�, ���ݿ��Գɼ�����ɼ��ĵȼ�.
		2. �ȼ�:
			��:	[90-100]
			��:	[80-89]
			��:	[70-79]
			����:	[60-69]
			������:	[0-59]
		3. Ҫ��ɼ���һ���Ϸ�������, �ɼ�������[0-100]֮��, �ɼ����ܴ���С��.
*/
public class IfTest03{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("��������ĳɼ�: ");
		double chengJi = s.nextDouble();
		String str = "��";
		if (chengJi < 0 || chengJi > 100){
			System.out.println("�Ƿ�����, ����������!");
			return;
		}else if (chengJi <= 59){
			str = "������";
		}else if (chengJi <= 69){
			str = "����";
		}else if(chengJi <= 79){
			str = "��";
		}else if(chengJi <= 89){
			str = "��";
		}
		System.out.println(str);
	}
}