/*
	ҵ��2:
		1. �žų˷���

		1 * 1 = 1
		1 * 2 = 2	2 * 2 = 4
		1 * 3 = 3	2 * 3 = 6	3 * 3 = 9
		...
		1 * 9 = 9	2 * 9 = 18 ... 9 * 9 = 81

		2. �ص�:
			������
			��һ��һ��, �ڶ�������, ��n��n��
*/
public class ForTest06{
	public static void main(String[] args){
		int i = 0;
		for(i = 1; i < 10; i++){		// 9��, ѭ��9��, i���к�
			for(int j = 1; j <= i; j++){	// �������һ��
				System.out.print(j + " * " + i + " = " + (j * i) + "	");
			}
		System.out.println();
		}
	}
}