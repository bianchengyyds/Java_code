/*
	ҵ��Ҫ��:
		1. �Ӽ����Ͻ���һ���˵�����
		2. ����Ҫ��Ϊ[0-150], ����ֵ��ʾ�Ƿ�, ��Ҫ��ʾ�Ƿ���Ϣ
		3. �����˵���������̬���ж�����������������ĸ��׶�?
			[0-5]Ӥ�׶�
			[6-10]�ٶ�
			[11-18]����
			[19-35]����
			[36-55]����
			[56-150]����
		4. ��ʹ��if���������ϵ�ҵ���߼�.
*/
public class IfTest02{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("����������: ");
		int nianLing = s.nextInt();
	/*
		if(nianLing >= 0 && nianLing <= 5){
			System.out.println("Ӥ�׶�");
		}else if(nianLing >= 6 && nianLing <= 10){
			System.out.println("�ٶ�");
		}else if(nianLing >= 11 && nianLing <= 18){
			System.out.println("����");
		}else if (nianLing >= 19 && nianLing <= 35){
			System.out.println("����");
		}else if (nianLing >= 36 && nianLing <= 55){
			System.out.println("����");
		}else if (nianLing >= 56 && nianLing <= 150){
			System.out.println("����");
		}else {
			System.out.println("�Ƿ���Ϣ, ����������!");
		}
	*/
		// �Ľ�:
	/*
		if(nianLing < 0 || nianLing > 150){
			System.out.println("�Ƿ���Ϣ, ����������!");
		}else if(nianLing <= 5){
			System.out.println("Ӥ�׶�");
		}else if(nianLing <= 10){
			System.out.println("�ٶ�");
		}else if(nianLing <= 18){
			System.out.println("����");
		}else if (nianLing <= 35){
			System.out.println("����");
		}else if (nianLing <= 55){
			System.out.println("����");
		}else {
			System.out.println("����");
		}
	*/
		// �ٸĽ�:
		String str = "����";
		if(nianLing < 0 || nianLing > 150){
			System.out.println("�Ƿ���Ϣ, ����������!");
			return;		// ��ֹ����, ���ڻὲ
		}else if(nianLing <= 5){
			str = "Ӥ�׶�";
		}else if(nianLing <= 10){
			str = "�ٶ�";
		}else if(nianLing <= 18){
			str = "����";
		}else if (nianLing <= 35){
			str = "����";
		}else if (nianLing <= 55){
			str = "����";
		}
		System.out.println(str);
	}
}