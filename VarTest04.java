/*
	������������ :
	1. ������ : ��������Ч��Χ
	2. ���˴����žͲ���ʶ��
	3. ��ͬ�ķ����еı�����������
	4. �ֲ������ͳ�Ա������������, ����ʱ, �ĸ����ҽ��ͷ����ĸ� ( �ͽ�ԭ�� ), ���ǲ���������.
*/

public class VarTest04{

	// ��Ա����
	int i = 100;

	public static void main(String[] args){
		// �ֲ�����
		// int i = 10;

		for (int j = 0; j < 10; j++){

		}
		// System.out.println(j);	// ���ܷ���, ��Ϊj����for��, ֻ��for����Ч

		int k;
		for (k = 0; k < 10; k++){

		}
		System.out.println(k);	// ���Է���, ��Ϊk����main��
	}

	// ���������ζ��岻�ù�, �����ѧ
	public static void x(){
		// System.out.println(i);	// i���޷����ʵ�, ��Ϊi����main�����Ĵ����ž�ʧЧ��.

		int i = 20;	// ���i����Ч��Χ��x����, ��main�����е�i����ͻ.
	}
}