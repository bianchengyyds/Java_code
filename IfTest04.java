/*
	ҵ��4:
		1. ������������Ϣ
			1 : ����
			0 : ����
		2. �����Ա����Ϣ
			1 : ��
			0 : Ů
		3. Ҫ��:
			������������ʱ:
				Ů : ��һ��С��ɡ
				�� : ��һ�Ѵ��ɡ
			������ʱ����ʱ:
				Ů : �����ɹ˪, ��ȥ��ˣ
				�� : ֱ������, ��ȥ��ˣ

		4. ��Ҫʹ��if����Լ�Ƕ�׷�ʽչ�����ҵ��.
*/
public class IfTest04{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("������������: ");
		int tianQi = s.nextInt();
		System.out.print("����������Ա�: ");
		int sex = s.nextInt();
		if (tianQi != 1 && tianQi != 0){
			System.out.println("����");
		}else{
			if (tianQi == 1){
			
				if(sex == 0){
					System.out.println("��һ��С��ɡ");
				}else if(sex == 1){
					System.out.println("��һ�Ѵ��ɡ");
				}
			}else {
				if(sex == 0){
					System.out.println("�����ɹ˪, ��ȥ��ˣ");
				}else if (sex == 1){
					System.out.println("ֱ������, ��ȥ��ˣ");
				}
			}			
		}
		
	}
}